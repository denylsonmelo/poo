package br.edu.ifpi.capar.poo.oracle.academy;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class DebugSomaDoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int soma = a + b;

        // comentario de linha
        /*
        comentario de bloco
         */
        System.out.println("soma de " + a + " eh " + soma);
    }
}
