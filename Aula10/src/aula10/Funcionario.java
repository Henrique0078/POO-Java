/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Henrique
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = true;
    }
    
    public void mudarTrabalho(String setor){
        this.setSetor(setor);
    }

    @Override
    public void descricao(){
        System.out.println("\nNome: " + this.getNome()
                + "\nIdade: " + this.getIdade()
                + "\nSexo: " + this.getSexo()
                + "\nSetor: " + this.getSetor()
                + "Trabalhando: " + this.getTrabalhando());
    }
    
}
