/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.Animal.Mamifero;

import aula13.Animal.Animal;

/**
 *
 * @author Henrique
 */
public class Mamifero extends Animal{
    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
