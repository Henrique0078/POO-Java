/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Henrique
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private double salario;

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
    
    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public void receberAum(double valor){
        this.setSalario(getSalario() + valor);
    }

    @Override
    public void descricao(){
        System.out.println("\nNome: " + this.getNome()
                + "\nIdade: " + this.getIdade()
                + "\nSexo: " + this.getSexo()
                + "\nEspecialidade: " + this.getEspecialidade()
                + "\nSalario: " + this.getSalario());
    }
    
}
