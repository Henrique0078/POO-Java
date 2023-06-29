/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.Animal.Mamifero;

/**
 *
 * @author Henrique
 */
public class Lobo extends Mamifero{
    
    public Lobo(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuuuuuuuuuu!");
    }
    
}
