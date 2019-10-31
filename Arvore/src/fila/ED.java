package fila;

public class ED {

    public static void main(String[] args) {

        FilaPessoa fila = new FilaPessoa(5);

        Pessoa p1 = new Pessoa();
        p1.nome = "Josu";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.nome = "Joso";
        p2.idade = 24;

        Pessoa p3 = new Pessoa();
        p3.nome = "Josi";
        p3.idade = 23;

        Pessoa p4 = new Pessoa();
        p4.nome = "Jose";
        p4.idade = 22;

        Pessoa p5 = new Pessoa();
        p5.nome = "Josa";
        p5.idade = 21;

        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);
        fila.adicionar(p4);
        fila.adicionar(p5);

        fila.mostrarLista();

        fila.remover();
    }
}
