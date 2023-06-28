/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.reptil;

import aula12.Animal;

/**
 *
 * @author Henrique
 */
public class Reptil extends Animal{
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }   

    public Reptil(String nome, long peso, int idade, int membros, String corEscama) {
        super(nome, peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mastigando!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil!!!");
    }
    
    @Override
    public void descrever(){
        System.out.println("\n--------------------------------"
                + "\nNome: " + this.getNome()
                + "\nPeso: " + this.getPeso()
                + "\nIdade: " + this.getIdade()
                + "\nMembris: " + this.getMembros()
                + "\nCor da escama: " + this.getCorEscama()
                + "");
    }
}
