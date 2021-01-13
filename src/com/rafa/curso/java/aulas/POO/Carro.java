package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capaciCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia (){
        
        System.out.println("A autonomia do carro é: " + capaciCombustivel * consumoCombustivel + " km");
    }
   
    double calcularAutonomia (){
        
        System.out.println("Método com retorno foi chamado");
        return capaciCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel (double km){
        
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }


}


