package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1035 {

    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD;
        
        Scanner entrada = new Scanner(System.in);
        
        valorA = entrada.nextInt();
        valorB = entrada.nextInt();
        valorC = entrada.nextInt();
        valorD = entrada.nextInt();
        
        if ((valorB > valorC) && 
            (valorD > valorA) &&
            ((valorC + valorD) > (valorB + valorA)) &&
            (valorC > 0) &&
            (valorD > 0) &&
            (valorA % 2 == 0)) {
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }
    }

}
