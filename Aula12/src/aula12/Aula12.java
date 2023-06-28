/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

import aula12.ave.Arara;
import aula12.ave.Calopsita;
import aula12.mamifero.Cachorro;
import aula12.mamifero.Canguru;
import aula12.peixe.Beta;
import aula12.peixe.Tubarao;
import aula12.reptil.Cobra;
import aula12.reptil.Tartaruga;

/**
 *
 * @author Henrique
 */
public class Aula12 {

    public static void main(String[] args) {
        Canguru c1 = new Canguru("Jorgin", 78, 18, 5, "Laranja Escuro");
        Cachorro c2 = new Cachorro("Toby", (long) 2.5, 11, 4, "Preta");
        Cobra c3 = new Cobra("Snikkers", 15, 6, 2, "Verde");
        Tartaruga t1 = new Tartaruga("Romeu", 5, 45, 5, "Marrom");
        Beta b1 = new Beta("Peixonauta", 6, 3, 2, "Laranja");
        Tubarao t2 = new Tubarao("Shark", 250, 15, 4, "Cinza");
        Arara a1 = new Arara("Henrique", 3, 7, 5, "Azul");
        Calopsita c4 = new Calopsita("Pituco", 8, 5, 6, "Cinza e branco");
   
        c1.descrever();
        c1.usarBolsa();
        c1.locomover();
        c2.descrever();
        c2.enterrarOsso();
        c2.abanarRabo();
        c3.descrever();
        c3.darBote();
        c4.descrever();
        c4.emitirSom();
        t1.descrever();
        t1.locomover();
        t2.descrever();
        t2.darBote();
        b1.descrever();
        b1.soltarBolha();
        a1.descrever();
    }
    
}
