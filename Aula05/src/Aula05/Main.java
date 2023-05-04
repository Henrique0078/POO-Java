/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Henrique
 */
public class Main {
    public static void main(String[] args) {
        ContaBanco henrique = new ContaBanco(1, "Henrique", "CC");
        henrique.status();
        henrique.fecharConta();
        henrique.sacar(50);
        henrique.status();
        henrique.fecharConta();
        henrique.status();
        henrique.sacar(50);
    }
}
