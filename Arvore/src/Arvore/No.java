package Arvore;
public class No {

    int valor;
    No noEsquerda, noDireita;
    int maisAlto;

    public No(int valor) {
        this.valor = valor;
    }
    public static No raiz;

    public static void inserir(int valor) {
        inserir(raiz, valor);
    }

    public static void inserir(No node, int valor) {
        if (node == null) {
            System.out.println("Raiz " + valor);
            raiz = new No(valor);
        } else {
            if (valor < node.valor) {
                if (node.noEsquerda != null) {
                    inserir(node.noEsquerda, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a esquerda de " + node.valor);
                    node.noEsquerda = new No(valor);
                }

            } else {
                if (node.noDireita != null) {
                    inserir(node.noDireita, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a direita de " + node.valor);
                    node.noDireita = new No(valor);
                }
            }
        }
    }

    public static void preordem(No node) {
        if (node != null) {
            System.out.print(node.valor + ", ");
            preordem(node.noEsquerda);
            preordem(node.noDireita);

        }
    }

    public static void posordem(No node) {
        if (node != null) {

            posordem(node.noEsquerda);
            posordem(node.noDireita);
            System.out.print(node.valor + ", ");

        }

    }

    public static void ordem(No node) {
        if (node != null) {
            ordem(node.noEsquerda);
            System.out.print(node.valor + ", ");
            ordem(node.noDireita);

        }
    }

    
    public static void main(String[] args) {

        inserir(10);
        inserir(4);
        inserir(15);
        inserir(5);
        inserir(2);

    }

  
}