package com.rafa.curso.java.aulas.POO;

/**
 *
 * @author Raphaa JP
 */
public class TestPessoa {
    
    public static void main(String[] args) {
        
      Aluno alu = new Aluno ();
      
      alu.setNome("Rafaela");
      alu.setMatricula(2145698);
      alu.setCurso("Sistemas De Informação");
      alu.setIdade(25);
      alu.setSexo("Feminino");
      alu.pagarMensalidade();
      
      
      
      Funcionario func = new Funcionario ();
      
      func.setNome("Matheus");
      func.setIdade(30);
      func.mudarTrabalho();
      
      
      
      Professor prof = new Professor ();
      
      prof.setNome("Lilian");
      prof.receberAumento();
      
       
        
        
    }
}