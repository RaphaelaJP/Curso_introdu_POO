package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public class Funcionario extends Pessoa{
 
    private String setor;
    private boolean trabahando;
    
    public void mudarTrabalho(){
        System.out.println(this.getNome() + " Mudou de setor.");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabahando() {
        return trabahando;
    }

    public void setTrabahando(boolean trabahando) {
        this.trabahando = trabahando;
    }
    
    
}

