package calculadora.service;

import calculadora.fila.Fila;
import calculadora.pilha.Pilha;

public class CalculadoraPosFixa {
    public double calcular(Fila fila) throws Exception {
        Pilha pilha = new Pilha();

        while (!fila.estaVazia()) {
            String elemento = fila.desenfileirar();

            if (isNumero(elemento)) {
                pilha.empilhar(Double.parseDouble(elemento));
            } else if (isOperador(elemento)) {
                if (pilha.estaVazia()) throw new Exception("Expressão inválida: operandos insuficientes.");
                double b = pilha.desempilhar();

                if (pilha.estaVazia()) throw new Exception("Expressão inválida: operandos insuficientes.");
                double a = pilha.desempilhar();

                double resultado = operar(a, b, elemento);
                pilha.empilhar(resultado);
            } else {
                throw new Exception("Operador inválido: " + elemento);
            }
        }

        if (pilha.estaVazia()) throw new Exception("Expressão inválida: nenhum resultado.");

        double resultadoFinal = pilha.desempilhar();

        if (!pilha.estaVazia()) throw new Exception("Expressão inválida: operandos excedentes.");

        return resultadoFinal;
    }

    private boolean isNumero(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private boolean isOperador(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%");
    }

    private double operar(double a, double b, String operador) throws Exception {
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) throw new Exception("Divisão por zero.");
                return a / b;
            case "%":
                if (b == 0) throw new Exception("Divisão por zero no módulo.");
                return a % b;
            default:
                throw new Exception("Operador inválido: " + operador);
        }
    }
}