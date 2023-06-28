/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.mamifero;

/**
 *
 * @author Henrique
 */
public final class Canguru extends Mamifero{
    
    public Canguru(String nome, long peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros, corPelo);
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando!!!");
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa!!!");
    }
    
}
