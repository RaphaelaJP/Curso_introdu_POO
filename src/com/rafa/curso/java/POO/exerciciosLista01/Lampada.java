package com.rafa.curso.java.POO.exerciciosLista01;

/**
 *
 * @author Raphaa JP
 */
public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String [] tipos;
    
    boolean ligada;
    
    void ligar(){
        ligada = true;
    }
    
    void desligar (){
        ligada = false;
    }
}
