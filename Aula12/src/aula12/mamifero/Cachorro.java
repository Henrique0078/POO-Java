/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.mamifero;

/**
 *
 * @author Henrique
 */
public final class Cachorro extends Mamifero{
    
    public Cachorro(String nome, long peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros, corPelo);
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando Osso!!!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando Rabo!!!");
    }
}
