/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Henrique
 */
public final class Bolsista extends Aluno {
    private boolean bolsa;
    
    public void setBolsa(boolean bolsa){
        this.bolsa = bolsa;
    }
    public boolean getBolsa(){
        return this.bolsa;
    }
    
    public Bolsista(String nome, int idade, String sexo, String matricula, String curso, double mensalidade){
        super(nome, idade, sexo, matricula, curso, mensalidade);
        this.setBolsa(false);
    }
    
    public void renovarBolsa(){
        this.setBolsa(true);
    }
    
    public void cancelarBolsa(){
        this.setBolsa(false);
    }
    
    @Override
    public void pagarMensalidade(double valor){
        if(getBolsa()){
            this.setMensalidade(this.getMensalidade() - (this.getMensalidade() * 0.25) - valor);
        }else{
            this.setMensalidade(this.getMensalidade() - valor);
        }
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
                         + "\nBolsa: " + getBolsa());
    }
}
