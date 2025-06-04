package calculadora.main;
import java.util.Scanner;

import calculadora.fila.Fila;
import calculadora.service.CalculadoraPosFixa;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();
        CalculadoraPosFixa calculadora = new CalculadoraPosFixa();

        System.out.println("Digite a expressão pós-fixada (separada por espaço):");
        String entrada = sc.nextLine();
        String[] elementos = entrada.split(" ");

        for (String elemento : elementos) {
            fila.enfileirar(elemento);
        }

        try {
            double resultado = calculadora.calcular(fila);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
} 