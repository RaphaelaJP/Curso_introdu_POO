package com.rafa.curso.java.POO.exerciciosLista01;

/**
 *
 * @author Raphaa JP
 */
public class Test_Exer02 {
    public static void main(String[] args) {
        
        Livro livro = new Livro ();
        
        livro.nome = " O mundo mágico de Letinha";
        livro.autor = " Rafaela ";
        livro.anoLancamento = 2015;
        livro.precoLivro = 2.00;
        
        System.out.println("o nome do livro é: " + livro.nome);
        System.out.println("O preço do livro é: " + livro.precoLivro);
            
    }     
}
