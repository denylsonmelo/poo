package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1038 {
    public static void main(String[] args) {
        int codigo, quantidade;
        double total;
        
        Scanner entrada = new Scanner(System.in);
        
        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();
        
        switch(codigo) {
            case 1:
                total = quantidade * 4.;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5.;
                break;
            case 4:
                total = quantidade * 2.0;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                total = 0;
        }
        
        System.out.printf("Total: R$ %.2f\n", total);
    }
    
}
