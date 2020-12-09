package com.rafa.curso.java.POO.exerciciosLista01;
/**
 *
 * @author Raphaa JP
 */
public class Test_Exer06 {
    
    public static void main(String[] args) {
        
        Contato contato1 = new Contato();
        contato1.nome = "Carlos";
        contato1.email = "calos@hotmail.com";
        contato1.endereco = "Av. Jorge Amado";
        
        contato1.telefones = new String [3];
        contato1.telefones[0] = "9999-9998";
        contato1.telefones[1] = "8888-7777";
        contato1.telefones[2] = "9638-4712";
    
        System.out.println("O nome é: " + contato1.nome);
        System.out.println("O email é: " + contato1.email);
        System.out.println("O contato pessoal é: " + contato1.telefones[2]);
    }
}
