package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    
    
    public void fazerAniversario (){
        this.idade++;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
