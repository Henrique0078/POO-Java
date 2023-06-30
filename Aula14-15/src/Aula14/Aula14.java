/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula14;

import Aula14.Pessoa.Gafanhoto;
import Aula14.Video.Video;

/**
 *
 * @author Henrique
 */
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v[0] = new Video("Sheltered", 10, 500, 100);
        v[1] = new Video("Mozao", 10, 400, 0);
        v[2] = new Video("Pauladentro", 15, 250, 1);
        
        g[0] = new Gafanhoto("Thayna", 18, "Feminino", "Thayna0078");
        g[1] = new Gafanhoto("Henrique", 19, "Masculino", "Henrique0078");
        
        v[0].play();
        v[1].like();
        v[2].play();
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        g[0].viuMaisUm();
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
                
    }
}
