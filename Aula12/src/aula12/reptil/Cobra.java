/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.reptil;

/**
 *
 * @author Henrique
 */
public class Cobra extends Reptil{
    
    public Cobra(String nome, long peso, int idade, int membros, String corEscama) {
        super(nome, peso, idade, membros, corEscama);
    }
    
    public void darBote(){
        System.out.println("Dando bote!!!");
    }
}
