package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;


/**
 *
 * @author Denylson Melo
 */
class Uri1001 {
    public static void main(String[] args) {
        int a, b, soma;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        soma = a + b;
        
        System.out.println("X = " + soma);
        
    }
}
