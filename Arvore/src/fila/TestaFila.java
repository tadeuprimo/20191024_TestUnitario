package fila;

public class TestaFila {
  public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.adicionar(10);
        fila.adicionar(20);
        fila.adicionar(30);
        fila.remover();
        fila.adicionar(40);
        fila.adicionar(50);
        fila.adicionar(60);
          
        fila.mostrarLista();
        
  }
}
