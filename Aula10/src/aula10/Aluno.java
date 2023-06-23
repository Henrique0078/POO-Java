/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Henrique
 */
public class Aluno extends Pessoa{
    
    private boolean matr;
    private String curso;

    public boolean getMatr() {
        return matr;
    }
    public void setMatr(boolean matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.matr = true;
        this.curso = curso;
    }
    
    public void cancelarMatr(){
        this.setMatr(false);
    }

    @Override
    public void descricao(){
        System.out.println("\nNome: " + this.getNome()
                + "\nIdade: " + this.getIdade()
                + "\nSexo: " + this.getSexo()
                + "\nMatricula: " + this.getMatr()
                + "\nCurso: " + this.getCurso());
    }
    
}
