package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.marca =  "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capaciCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);
        System.out.println("Numero de Passageiros: " + van.numPassageiros);

    }
}
