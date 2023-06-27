/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Henrique
 */
public final class Tecnico extends Aluno{
    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public Tecnico(String nome, int idade, String sexo, String matricula, String curso, double mensalidade, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso, mensalidade);
        this.setRegistroProfissional(registroProfissional);
    }
    
    public void praticar(){
        System.out.println("Praticando " + getRegistroProfissional());
    }
    
    @Override
    public void descrever(){
        System.out.println("----------------------------"
                         + "\nNome: " + getNome()
                         + "\nIdade: " + getIdade()
                         + "\nSexo: " + getSexo()
                         + "\nMatricula: " + getMatricula()
                         + "\nCurso: " + getCurso()
                         + "\nMensalidade: " + getMensalidade()
                         + "\nRegistro Profissional: " + getRegistroProfissional());
    }
}
