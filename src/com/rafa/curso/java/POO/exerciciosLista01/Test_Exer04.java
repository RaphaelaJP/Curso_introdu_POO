package com.rafa.curso.java.POO.exerciciosLista01;

import java.util.Date;

/**
 *
 * @author Raphaa JP
 */
public class Test_Exer04 {
    
    public static void main(String[] args) {
        
        LivroBiblioteca livro = new LivroBiblioteca();
        
        livro.nome = " O mundo mágico de Letinha";
        livro.autor = " Rafaela ";
        livro.anoLancamento = 2015;
        
        livro.emprestimo = true;
        livro.DataEntrega = new Date();
        livro.emprestadoA = "Lilian";
        
        System.out.println("o nome do livro é: " + livro.nome);
        System.out.println("Emprestado a: " + livro.emprestadoA);
    }
}
