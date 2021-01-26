package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public class TestClassesAnimal {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r =   new Reptil();
        Peixe p =    new Peixe();
        Ave a  =     new Ave();
        
        m.setPeso(35.3f);
        m.setCorPelo("Amarelo");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println("---- Reptil ----");
        r.setPeso(1.3f);
        r.setCorEscama("Preto");
        r.alimentar();
        r.locomover();
        r.emitirSom();
        
        System.out.println("---- Peixe ----");
        p.setPeso(3.3f);
        p.setCorEscama("Amarelo");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        
        System.out.println("---- Ave ----");
        a.setPeso(2.3f);
        a.setCorPena("Vede");
        a.alimentar();
        a.locomover();
        a.emitirSom();
    }
    
}
