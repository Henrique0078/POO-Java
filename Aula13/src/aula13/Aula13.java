/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

import aula13.Animal.Mamifero.Cachorro;
import aula13.Animal.Mamifero.Lobo;
import aula13.Animal.Mamifero.Mamifero;

/**
 *
 * @author Henrique
 */
public class Aula13 {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero(15, 25, 4, "Marrom");
        Lobo l1 = new Lobo(20, 14, 5, "Cinza");
        Cachorro c1 = new Cachorro(10, 1, 6, "Cinza");
        m1.emitirSom();
        m1.s();
        l1.emitirSom();
        l1.s();
        c1.emitirSom();
        c1.s();
        c1.reagir("Oi");
        c1.s();
        c1.reagir(15, 25);
        c1.s();
        c1.reagir(true);
        c1.s();
        c1.reagir();
    }
    
}
