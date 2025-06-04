package calculadora.pilha;

import java.util.LinkedList;
import java.util.Stack;

public class Pilha {
    private Stack<Double> pilha;

    public Pilha() {
        pilha = new Stack<>();
    }

    public void empilhar(Double elemento) {
        pilha.push(elemento);
    }

    public Double desempilhar() {
        return pilha.pop();
    }

    public Double topo() {
        return pilha.peek();
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }

    public void limpar() {
        pilha.clear();
    }
}