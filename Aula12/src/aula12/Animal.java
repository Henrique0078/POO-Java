/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Henrique
 */
public abstract class Animal {
    private String nome;
    private long peso;
    private int idade;
    private int membros;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getPeso() {
        return peso;
    }
    public void setPeso(long peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public Animal(String nome, long peso, int idade, int membros){
        this.setNome(nome);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public void descrever(){
        System.out.println("\n--------------------------------"
                + "\nNome: " + this.getNome()
                + "\nPeso: " + this.getPeso()
                + "\nIdade: " + this.getIdade()
                + "\nMembris: " + this.getMembros()
                + "");
    }
}
