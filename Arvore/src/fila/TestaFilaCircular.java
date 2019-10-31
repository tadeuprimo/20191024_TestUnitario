
package fila;

public class TestaFilaCircular {

    public static void main(String[] args) {
         FilaCircular fila = new FilaCircular(5);

        fila.adicionar(10);
        fila.adicionar(20);
        fila.adicionar(30);
        fila.remover();
        fila.adicionar(40);
        fila.adicionar(50);
        fila.adicionar(60);
          
        fila.mostrar();
        /*FilaCircular filac = new FilaCircular(5);

        filac.adicionar(100);
        filac.adicionar(200);
        // fila.mostrar();

        System.out.println(filac.getTamanho());
        System.out.println(filac.remover());
      //  System.out.println(filac.remover());
        System.out.println("----------------------------");

        for (int i = 1; i < 6; i++) {
            filac.adicionar(i * 10);
        }
        filac.mostrar();
        System.out.println(filac.remover());
        System.out.println(filac.remover());
         for (int i = 1; i < 6; i++) {
            filac.adicionar(i * 10);
        }
          filac.mostrar();
       /* filac.inicializar();
        filac.mostrar();
        for (int i = 1; i <= 7; i++) {
            filac.adicionar(i * 10);
        }
        while(!filac.isVazia()){
            System.out.println(filac.remover());
        }
        filac.mostrar();*/
    }
}
