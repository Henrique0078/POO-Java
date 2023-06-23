/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Henrique
 */
public class Aula10 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jaqueline", 43, "Feminino");
        Aluno aluno = new Aluno("Henrique", 19, "Masculino", "Ciencias");
        Funcionario funcionario = new Funcionario("Thayna", 18, "Feminino", "Adm");
        Professor professor = new Professor("Uau", 45, "Masculino", "Ciencias", 1500);
    
        pessoa.descricao();
        aluno.descricao();
        funcionario.descricao();
        professor.descricao();
    }
    
}
