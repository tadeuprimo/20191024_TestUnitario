package fila;

public class Fila {
    // private Pessoa[] fila;

    private int[] fila;
    private int inicio, fim;
    private int MAXIMO;

    public Fila(int quantidade) {
        MAXIMO = quantidade;
        fila = new int[MAXIMO];
        inicializar();
    }

    public void inicializar() {
        inicio = 0;
        fim = -1;
    }

    public int getTamanhoAtual() {
        if (fim == -1) {
            return 0;
        }
        return fim - inicio + 1;
    }

    public boolean isVazia() {
        return (inicio - 1 == fim);
    }

    public int getPrimeiroElemento() {
        if (getTamanhoAtual() > 0) {
            return fila[inicio];
        } else {
            return 0;
        }
    }

    public int getUltimoElemento() {
        if (getTamanhoAtual() > 0) {
            return fila[fim];
        } else {
            return 0;
        }
    }

    public int getElemento(int elemento) {
        if (getTamanhoAtual() > 0) {
            elemento += inicio - 1;
            return fila[elemento];
        } else {
            return 0;
        }
    }

    public void adicionar(int num) {
        if (fim < MAXIMO - 1) {
            fila[++fim] = num;
            System.out.println("Número adicionado: "+ num);
        } else {
            System.out.println("A fila está cheia, o elemento não foi adicionado!");
        }

    }

    public void remover() {
        if (!isVazia()) {
            System.out.println("Valor Removido: " + fila[inicio]);
            inicio++;
        } else {
            System.out.println("A fila já está vazia, não foi possível remover!");
        }
    }

    public void mostrarLista() {
        System.out.println("Valores atualmente na Fila: ");
        int i = inicio;
        while (i <= fim) {
            System.out.println("[" + i + "]" + "-" + fila[i]);
            i++;
        }

    }

}