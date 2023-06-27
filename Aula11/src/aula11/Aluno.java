/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Henrique
 */
public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    private double mensalidade;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    public Aluno(String nome, int idade, String sexo, String matricula, String curso, double mensalidade){
        super(nome, idade, sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);
        this.setMensalidade(mensalidade);
    }
    
    public void pagarMensalidade(double valor){
        this.setMensalidade(this.getMensalidade() - valor);
    }
    
    @Override
    public void descrever(){
        System.out.println("----------------------------"
                         + "\nNome: " + getNome()
                         + "\nIdade: " + getIdade()
                         + "\nSexo: " + getSexo()
                         + "\nMatricula: " + getMatricula()
                         + "\nCurso: " + getCurso()
                         + "\nMensalidade: " + getMensalidade());
    }
}
