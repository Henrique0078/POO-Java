/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author Henrique
 */
public class Aula09 {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        p[0] = new Pessoa("Thayna", 18, "Masculino");
        p[1] = new Pessoa("Henrique", 19, "Masculino");
        
        Livro[] l = new Livro[3];
        l[0] = new Livro("Anatomia do mal", "Desconhecido", 300);
        l[1] = new Livro("Medicina Macabra", "Tomas Morrys", 400);
        l[0].setLeitor(p[0]);
        l[1].setLeitor(p[1]);
        l[0].abrir();
        l[0].folhear(300);
        l[0].voltarPag();
        l[1].folhear(56);
        l[0].detalhes();
        l[1].detalhes();
    }
}
