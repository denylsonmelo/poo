package br.edu.ifpi.capar.poo.prova.bimestre1.pratica;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class KageBushin_2544 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeVezesTecnicaUtilizada, quantidadeNinjas;

        quantidadeNinjas = scanner.nextInt();

        System.out.println(Math.log(quantidadeNinjas)/Math.log(2));
        
        
        
        System.out.println((quantidadeNinjas/2)-1);
    }
}
