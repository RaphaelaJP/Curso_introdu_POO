package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private double salario;

    public Professor() {
      
    }
    
    public void receberAumento (){
        salario += 1000;
        System.out.println("O professor: " + this.getNome() + " Tem o salario de: " + this.salario);
        
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
  
}
