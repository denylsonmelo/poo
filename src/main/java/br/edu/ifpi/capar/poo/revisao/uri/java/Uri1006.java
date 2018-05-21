package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1006 {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, media;
        int peso1 =2, peso2 = 3, peso3 = 5;
        Scanner entrada = new Scanner(System.in);
        
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();
        
        media = (nota1*peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.println(String.format("MEDIA = %.1f", media));
    }

}
