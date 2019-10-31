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
public class TestaArvore {
   public static void main(String[] args){
       Arvore a  = new Arvore();
       No n = new No(10);
       
           
       a.inserir(n,10);
       a.inserir(n,4);
       a.inserir(n,15);
       a.inserir(n,5);
       a.inserir(n,2);
   }
}
