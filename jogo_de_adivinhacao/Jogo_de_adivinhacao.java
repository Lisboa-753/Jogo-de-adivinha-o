/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo_de_adivinhacao;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Jogo_de_adivinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        // Gera um número aleatório entre 1 e 1000
        int numeroSorteado = (int) (Math.random() * 1000) + 1;
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Bem Vindo a Roleta!!!");
        System.out.println("Tente adivinhar o numero sorteado entre 1 e 1000!");

        // Loop que continua até o usuário acertar
        while (palpite != numeroSorteado) {
            System.out.print("Digite seu palpite para ver acertara o nessa nova tentativa : ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O numero sorteado eh maior!");
            } else if (palpite > numeroSorteado) {
                System.out.println("O numero sorteado eh menor!");
            }
        }

        // Exibe o número de tentativas após o usuário acertar
        System.out.println("Parabens! Voce acertou o numero sorteado em " + tentativas + " tentativas.");

        sc.close();
    }
    
}
