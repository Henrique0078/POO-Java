/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.ave;

/**
 *
 * @author Henrique
 */
public final class Calopsita extends Ave{
    
    public Calopsita(String nome, long peso, int idade, int membros, String corPena) {
        super(nome, peso, idade, membros, corPena);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Falando!!!");
    }
}
