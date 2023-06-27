/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Henrique
 */
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("eu", 15, "macho");
        Aluno a1 = new Aluno("sou", 17, "femea", "N8754", "Nada", 510);
        Bolsista b1 = new Bolsista("Thayna", 18, "mulher", "H1265", "Medicina", 650);
        Tecnico t1 = new Tecnico("Henrique", 19, "homem", "N87145", "Ciencia", 150, "NADA");
        Professor p1 = new Professor("Antonio", 45, "macho", "Ciencia", 15000);
        
        v1.descrever();
        a1.descrever();
        b1.descrever();
        t1.descrever();
        p1.descrever();
    }
}
