/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.reptil;

/**
 *
 * @author Henrique
 */
public final class Tartaruga extends Reptil{
    
    public Tartaruga(String nome, long peso, int idade, int membros, String corEscama) {
        super(nome, peso, idade, membros, corEscama);
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando bem devagar!!!");
    }
}
