package calculadora.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<String> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void enfileirar(String elemento) {
        fila.add(elemento);
    }

    public String desenfileirar() {
        return fila.poll();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public void limpar() {
        fila.clear();
    }
}