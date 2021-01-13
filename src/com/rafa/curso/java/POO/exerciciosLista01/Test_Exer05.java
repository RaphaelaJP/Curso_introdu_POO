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
        System.out.println("O número da conta é: " + conta.numeroConnta);
        
        boolean saqueEfetuado =  conta.realizarSaque(500);
        
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possivel realizar saque. Saldo Insuficiente!");
        }
    
        
        System.out.println("Deposito de 500 reais");
        conta.depositar(10);
        conta.consultarSaldo();
        
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando o cheque especial");
        }
    }
   
    


}
