package fila;

public class FilaPrioridade {

    private int MAX;
    private long[][] vetor;
    private int inicio, fim;

    public FilaPrioridade(int qtd) {
        MAX = qtd;
        vetor = new long[MAX][2];
        inicio = 0;
        fim = -1;
    }

    public void adicionar(long elemento, long prioridade) {
        int j;
        if (isCheia()) {
            System.out.println("A fila esta cheia, o elemento " + elemento + " Não foi adicionado!");
            return;
        }
        for (j = fim; j >= inicio; j--) {
            if (prioridade > vetor[j][1]) {
                vetor[j + 1][0] = vetor[j][0];
                vetor[j + 1][1] = vetor[j][1];
            } else {
                break;
            }
        }
        vetor[j + 1][0] = elemento;
        vetor[j + 1][1] = prioridade;
        fim++;
    }

    public long remover() {
        long temp = 0;
        if (isVazia()) {
            System.out.println("A fila está vazia!");
        } else {
            temp = vetor[inicio++][0];
        }
        return temp;
    }

    public long primeiroElemento() {
        return vetor[inicio][0];
    }

    public boolean isVazia() {
        return (inicio - 1 == fim);
    }

    public boolean isCheia() {
        return (fim == MAX - 1);
    }

    public int getTamanhoAtual() {
        if (fim == -1) return 0;
        return fim-inicio+1;
    }
    
     public void mostrar(){
         if (isVazia()) {
            System.out.println("A fila está vazia!");
        } 
        int i = 1;
        int in = inicio;
        while(in<=fim){
            System.out.println(i + " - " + vetor[in++][0]);
            i++;
        }
     }
     public void inicializar(){
         inicio = 0;
         fim = -1;
     }

}
