/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author Henrique
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    private void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    private void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    private void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    private void setPeso(double peso){
        this.peso = peso;
        this.setCategoria();
    }
    public double getPeso(){
        return this.peso;
    }
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }  
    }
    public String getCategoria(){
        return this.categoria;
    }
    private void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public int getVitorias(){
        return this.vitorias;
    }
    private void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    private void setEmpates(int empates){
        this.empates = empates;
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public int getEmpates(){
        return this.empates;
    }
    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println("Medindo " + this.getAltura());
        System.out.println("Pesando " + this.getPeso());
        System.out.println("Categoria " + this.getCategoria());
        System.out.println("Com " + this.getVitorias() + " Vitorias, "  + this.getDerrotas() + " Derrotas e " + this.getEmpates() + " Empates.");
    }
    public void status(){
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + "Derrotas");
        System.out.println(this.getEmpates() + "Empates");
    }
}
