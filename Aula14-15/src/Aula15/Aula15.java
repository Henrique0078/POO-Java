/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula15;

import Aula14.Pessoa.Gafanhoto;
import Aula14.Video.Video;
import Aula15.Visualizacao.Visualizacao;

/**
 *
 * @author Henrique
 */
public class Aula15 {
    public static void main(String[] args){
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vis[] = new Visualizacao[2];
        
        v[0] = new Video("Sheltered", 10, 0, 100);
        v[1] = new Video("Mozao", 10, 1, 0);
        v[2] = new Video("Pauladentro", 15, 250, 1);
        
        g[0] = new Gafanhoto("Thayna", 18, "Feminino", "Thayna0078");
        g[1] = new Gafanhoto("Henrique", 19, "Masculino", "Henrique0078");
        
        vis[0] = new Visualizacao(g[0], v[0]);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
        vis[1].avaliar((float)67);
        System.out.println(vis[1].toString());
    }
}
