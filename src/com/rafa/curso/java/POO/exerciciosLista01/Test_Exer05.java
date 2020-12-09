package com.rafa.curso.java.POO.exerciciosLista01;

/**
 *
 * @author Raphaa JP
 */
public class Test_Exer05 {
 
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        
        conta.numeroConnta = "1234567890";
        conta.especial =  true;
        conta.agencia = "0060";
        conta.saldo = 400;
        conta.limiteEspecial = 600;
    
        System.out.println("O saldo da conta é: " + conta.saldo);
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("O número da conta é: " + conta.numeroConnta);
        
    }
}
