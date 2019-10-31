package fila;

public class TestaFilaPrioridade {

    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade(10);
        
        fila.adicionar(15, 1);
        fila.adicionar(12, 2);
        fila.adicionar(8, 3);
        fila.adicionar(5, 4);
        fila.adicionar(45, 4);
        fila.adicionar(77, 4);
        fila.adicionar(364, 2);
        fila.adicionar(77, 1);
        
        fila.mostrar();
        System.out.println("----------------------------");
        System.out.println(fila.getTamanhoAtual());
        System.out.println(fila.remover());
        System.out.println("----------------------------");
        fila.mostrar();
        fila.adicionar(14, 3);
        System.out.println("----------------------------");
        fila.mostrar();
    }
}
