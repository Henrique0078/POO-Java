/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Henrique
 */
public final class Professor extends Pessoa{
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
    
    public Professor(String nome, int idade, String sexo, String especialidade, double salario){
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }
    public void receberAumento(double valor){
        this.setSalario(getSalario() + valor);
    }
    
    @Override
    public  void descrever(){
        System.out.println("----------------------------"
                         + "\nNome: " + getNome()
                         + "\nIdade: " + getIdade()
                         + "\nSexo: " + getSexo()
                         + "\nEspecialidade: " + getEspecialidade()
                         + "\nSalario: " + getSalario());
    }
}
