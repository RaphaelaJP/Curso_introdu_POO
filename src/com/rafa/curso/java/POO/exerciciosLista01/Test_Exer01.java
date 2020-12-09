package com.rafa.curso.java.POO.exerciciosLista01;

/**
 *
 * @author Raphaa JP
 */
public class Test_Exer01 {
    
    public static void main(String[] args) {
        
        Lampada lampada =  new Lampada ();
 
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.tipoLuz = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.garantiaMeses = 36;
        
        lampada.tipos =  new String [5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeão";
        lampada.tipos[2] = "Luminária";
       
        System.out.println(lampada.modelo);
        System.out.println(lampada.cor);
        System.out.println(lampada.potencia);
        System.out.println(lampada.tensao);

        System.out.println(lampada.tipos[0]);

    }
}
