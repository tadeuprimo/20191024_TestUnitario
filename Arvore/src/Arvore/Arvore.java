/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

/**
 *
 * @author aula2
 */
public class Arvore {

    public void inserir(No node, int valor) {
        //verifica se a árvore já foi criada
        if (node != null) {
            //Verifica se o valor a ser inserido é menor que o nodo corrente da árovre, se sim vai para subarvore esquerda
            if (valor < node.valor) {
                //Se tiver elemento no nodo esquerdo continua a busca
                if (node.noEsquerda!= null) {
                    inserir(node.noEsquerda, valor);
                } else {
                    //Se nodo esquerdo vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a esquerda de " + node.valor);
                    node.noEsquerda= new No(valor);
                }
                //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subarvore direita
            } else if (valor > node.valor) {
                //Se tiver elemento no nodo direito continua a busca
                if (node.noDireita!= null) {
                    inserir(node.noDireita, valor);
                } else {
                    //Se nodo direito vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a direita de " + node.valor);
                    node.noDireita= new No(valor);
                }
            }
        }
    }

    public No removeValorMinimoDaArvore(No node) {
        if (node == null) {
            System.out.println("  ERRO ");
        } else if (node.noEsquerda != null) {
            node.noEsquerda = removeValorMinimoDaArvore(node.noEsquerda);
            return node;
        } else {
            //Se não tiver elemento esquerdo só nós resta o da direita
            return node.noDireita;
        }
        return null;
    }

    public void prefixado(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            prefixado(no.noEsquerda);
            prefixado(no.noDireita);
        }
    }

    public void posfixado(No no) {
        if (no != null) {
            posfixado(no.noEsquerda);
            posfixado(no.noDireita);
            System.out.print(no.valor + " ");
        }
    }

    public void emordem(No no) {
        if (no != null) {
            emordem(no.noEsquerda);
            System.out.print(no.valor + " ");
            emordem(no.noDireita);
        }
    }

}
