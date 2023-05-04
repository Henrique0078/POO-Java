/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;
/**
 *
 * @author Henrique
 */
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic","amarela",0.5f);
        c1.status();
        System.out.println("----------------------------------------");
        Caneta c2 = new Caneta("Bic", "Vermelha", 1.0f);
        c2.status();
    }
}
