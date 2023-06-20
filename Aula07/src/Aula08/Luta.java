/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08;

import Aula07.Lutador;
import java.lang.Math;

/**
 *
 * @author Henrique
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1 != l2){
            if(l1.getCategoria().equals(l2.getCategoria())){
                this.setAprovada(true);
                System.out.println("Luta aprovada!!!");
                desafiado = l1;
                desafiante = l2;
            }
            else{
                System.out.println("Somente lutadores de mesma categoria podem lutar.");
            }
        }
        else{
            System.out.println("Luta so pode ser feita com duas pessoas diferentes.");
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            System.out.println("\n==========Resultado==========");
            int ganhador = (int)(Math.random() * 3 ); //Randomiza numeros de 0 a 2, o tres ali delimita o maior numero possivel
            switch(ganhador){
            case 0 -> {
                System.out.println("\nEmpate!!!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                }
                        
            case 1 -> {
                System.out.println("\nVitoria de " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                }
                        
            case 2 -> {
                System.out.println("\nVitoria de " + desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                }
            }
        }
        else{
            System.out.println("\nLuta não marcada");
        }
    }
}
