/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula14.Pessoa;

/**
 *
 * @author Henrique
 */
public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + this.login + ", totAssistido=" + this.totAssistido + '}';
    }
    
    
}
