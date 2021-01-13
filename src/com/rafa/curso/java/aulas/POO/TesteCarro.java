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

        van.exibirAutonomia();
        
        double autonomia = van.calcularAutonomia();
        System.out.println("A autonimia do carro é: " + autonomia);
        
        double qtdCombustivel10 =  van.calcularCombustivel(10);
        double qtdCombustivel20 =  van.calcularCombustivel(20);

        System.out.println("A quantidade de combustivel_10: " + qtdCombustivel10);
        System.out.println("A quantidade de combustivel _20: " + qtdCombustivel20);
    }
}
