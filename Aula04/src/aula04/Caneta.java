/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author Henrique
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    /**
    public Caneta(){ //metodo construtor pois tem mesmo nome da classe
        this.tampar();
        this.setCor("Azul");
    }
    */
    public Caneta(String modelo, String cor, float ponta){ //metodo construtor pois tem mesmo nome da classe
        this.setCor(cor);
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void status(){
        System.out.println("Sobre a Caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}
