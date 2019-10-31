 package fila;

public class FilaPessoa {

    private Pessoa[] fila;
    private int inicio, fim;
    private int MAXIMO;

    public FilaPessoa(int quantidade) {
        MAXIMO = quantidade;
        fila = new Pessoa[MAXIMO];
        inicializar();
    }

    public void inicializar() {
        inicio = 0;
        fim = -1;
    }
    public int getTamanhoAtual(){
        if(fim == -1) return 0;
        return fim-inicio+1;
    }
    public boolean isVazia(){
        return (inicio-1==fim);
    }
    public Pessoa getPrimeiroElemento(){
        if(getTamanhoAtual()>0)
            return fila[inicio];
        else
            return null;
    }
      public Pessoa getUltimoElemento(){
        if(getTamanhoAtual()>0)
            return fila[fim];
        else
            return null;
    }
    public Pessoa getElemento(int elemento){
        if(getTamanhoAtual()>0){
            elemento+=inicio-1;
            return fila[elemento];
        }
            
        else
            return null;
    }
    public void adicionar(Pessoa pessoa){
        if(fim<MAXIMO-1){
            fila[++fim] = pessoa;
            System.out.println("Pessoa adicionada: ");
        }
        else{
            System.out.println("A fila está cheia, o elemento não foi adicionado!");
        }
        System.out.println(pessoa.nome + ", " +pessoa.idade);

    }
     public void remover(){
        if(!isVazia()){
            System.out.println("Pessoa removida: ");
            System.out.println(fila[inicio].nome + ", " + fila[inicio].idade);
            inicio++;
        }
        else{
            System.out.println("A fila já está vazia, não foi possível remover!");
        }
    }
    public void mostrarLista(){
        System.out.println("Pessoas atualmente na Fila: ");
        int i = inicio;
        while(i<=fim){
            System.out.println(fila[i].nome + ", " + fila[i].idade);
            i++;
        }

    }
       
}
