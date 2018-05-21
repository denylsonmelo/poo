package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1002 {
    public static void main(String[] args) {
        
        double area, raio, pi = 3.14159;
        
        Scanner teclado = new Scanner(System.in);
        
        raio = teclado.nextDouble();
        
        area = pi * Math.pow(raio, 2);
        
        //System.out.printf("A=%.4f\n", area);
        System.out.print(String.format("A=%.4f\n", area));
    }
    
}
