/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula15.Visualizacao;

import Aula14.Pessoa.Gafanhoto;
import Aula14.Video.Video;

/**
 *
 * @author Henrique
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(1 + this.espectador.getTotAssistido());
        this.filme.setViews(1 + this.filme.getViews());
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(0);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        if (nota >= 8){
            this.filme.like();
        }
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 30){
            tot = 3;
        }else if(porc <= 60){
            tot = 6;
        }else if(porc <= 80){
            tot = 8;
            this.filme.like();
        }else{
            tot = 10;
            this.filme.like();
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + "}";
    }
    
    
}
