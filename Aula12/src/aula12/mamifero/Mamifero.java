/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.mamifero;

import aula12.Animal;

/**
 *
 * @author Henrique
 */
public class Mamifero extends Animal{
    
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero(String nome, long peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros);
        this.setCorPelo(corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Andando!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero!!!");
    }
    
    @Override
    public void descrever(){
        System.out.println("\n--------------------------------"
                + "\nNome: " + this.getNome()
                + "\nPeso: " + this.getPeso()
                + "\nIdade: " + this.getIdade()
                + "\nMembris: " + this.getMembros()
                + "\nCor do pelo: " + this.getCorPelo()
                + "");
    }
}
