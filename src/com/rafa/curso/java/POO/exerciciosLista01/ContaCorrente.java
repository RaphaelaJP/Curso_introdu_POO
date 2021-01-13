package com.rafa.curso.java.POO.exerciciosLista01;

/**
 *
 * @author Raphaa JP
 */
public class ContaCorrente {
    
    String numeroConnta;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    
    double saldo;
 
    
    boolean realizarSaque(double quantiaASacar){
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        
        } else {
            if (especial){
                double limite =  limiteEspecial - saldo;
                if (limite >= quantiaASacar){
                saldo -= quantiaASacar;
            } else {
                return false;
            }
        } else {
            return false;
        }

        }
        return false;
    }

    void depositar (double valorDepositado){
        saldo += valorDepositado;   
    }

    void consultarSaldo (){
        System.out.println("O saldo atual é: " + saldo);
    }
    
    boolean verificarUsoChequeEspecial (){
       return saldo < 0;
    }

}