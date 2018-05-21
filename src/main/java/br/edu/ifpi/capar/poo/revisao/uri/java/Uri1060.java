package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1060 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorLido;
        int valoresPositivos = 0;

        for (int i = 1; i <= 6; i++) {

            valorLido = scanner.nextDouble();
        
            if(valorLido > 0)
                valoresPositivos++;
        }
        
        System.out.println(valoresPositivos + " valores positivos");
    }
}
