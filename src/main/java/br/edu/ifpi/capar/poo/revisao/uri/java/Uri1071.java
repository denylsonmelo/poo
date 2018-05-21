package br.edu.ifpi.capar.poo.noite.uri;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Uri1071 {
    public static void main(String[] args) {
        int valor1, valor2, soma = 0, maior, menor;
        
        Scanner entrada = new Scanner(System.in);
        
        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();
        maior = Math.max(valor1, valor2);
        menor = Math.min(valor1, valor2);
        
        while(maior > menor){
            maior--; // maior = maior -1

            if(maior == menor) break; 
            
            if (maior % 2 != 0) 
                soma += maior;
        }
        
        
        System.out.println(soma);
        
    }
}
