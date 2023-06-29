/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.Animal.Mamifero;

/**
 *
 * @author Henrique
 */
public final class Cachorro extends Lobo{
    
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au!Au!Au!Au");
    }
    
    public void reagir(String frase){
        if(frase.equals("Oi") || frase.equals("Passear")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if (hora < 18){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Ignorar");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(){
        if(this.getIdade() <= 5){
            if(this.getPeso() < 50){
                System.out.println("Abanar"); //Leve e Novo
            }else{
                System.out.println("Latir"); //Pesado e Novo
            }
        }else{
            if(this.getPeso() < 50){
                System.out.println("Rosnar"); //Leve e Velho
            }else{
                System.out.println("Ignorar"); //Pesado e Velho
            }
        }
    }
}
