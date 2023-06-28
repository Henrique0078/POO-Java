/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.ave;

import aula12.Animal;

/**
 *
 * @author Henrique
 */
public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public Ave(String nome, long peso, int idade, int membros, String corPena) {
        super(nome, peso, idade, membros);
        this.setCorPena(corPena);
    }

    @Override
    public void locomover() {
        System.out.println("Voando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Bicando!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de passaro!!!");
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo Ninho!!!");
    }
    
    @Override
    public void descrever(){
        System.out.println("\n--------------------------------"
                + "\nNome: " + this.getNome()
                + "\nPeso: " + this.getPeso()
                + "\nIdade: " + this.getIdade()
                + "\nMembris: " + this.getMembros()
                + "\nCor da Pena: " + this.getCorPena()
                + "");
    }
}
