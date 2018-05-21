package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1075 {
    public static void main(String[] args) {
        
        int valor = new Scanner(System.in).nextInt();
        
        /*
        int contador = 1;
        while(contador < 10000){
            if(contador % valor == 2)
                System.out.println(valor);
            
            contador++;
        }*/
        
        /*
        int contador = 1;
        do {            
            if(contador % valor == 2)
                System.out.println(valor);
            
            contador++;
            
        } while (contador < 10000);*/
        
        for(int contador = 1 ; contador < 10000 ; contador++)
            if(contador % valor == 2)
                System.out.println(contador);
        
    }
    
}
