/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.Animal;

/**
 *
 * @author Henrique
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public Animal(float peso, int idade, int membros){
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    public abstract void emitirSom();
    
    public final void s(){
        System.out.println("--------------------");
    }
}
