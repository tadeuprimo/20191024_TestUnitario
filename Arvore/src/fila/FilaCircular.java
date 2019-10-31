package fila;

public class FilaCircular {

    private int MAX;
    private long[] vetor;
    private int inicio, fim, qtdItens;

    public FilaCircular(int qtd) {
        MAX = qtd;
        vetor = new long[MAX];
        inicio = 0;
        fim = -1;
        qtdItens = 0;
    }

    public void adicionar(long elemento) {
        if (qtdItens == 5) {
            System.out.println("A fila esta cheia, o elemento " + elemento + " Não foi adicionado!");
            return;
        } 
        if (fim == MAX - 1) {
            fim = -1;
        }
            vetor[++fim] = elemento;
            qtdItens++;

        }

    

    public long remover() {
        long temp = 0;
        if (qtdItens == 0) {
            System.out.println("A fila está vazia!");
        } else {
            temp = vetor[inicio++];
            qtdItens--;
            if (inicio == MAX) 
                inicio = 0;
            
        }
        return temp;

    }

    public long getPrimeiroElemento() {
        return vetor[inicio];
    }

    public boolean isVazia() {
        return (qtdItens == 0);
    }

    public boolean isCheia() {
        return (qtdItens == MAX);
    }

    public int getTamanho() {

        return qtdItens;
    }

    public void mostrar() {
        if (qtdItens == 0) {
            System.out.println("A fila está vazia!");
        } 
        int i = 1;
        int in = inicio;
        while (i <= qtdItens) {
            System.out.println(i + " - " + vetor[in++]);
            if (in == MAX) {
                in = 0;
            }
            i++;
        }
    }

    public void inicializar() {
        inicio = 0;
        fim = -1;
        qtdItens = 0;
    }

}

