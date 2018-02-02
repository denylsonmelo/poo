package br.edu.ifpi.capar.poo.oracle.academy;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFestaAlexTest {
    public static void main(String[] args) {
        
        CalculadoraFestaAlex galas = new CalculadoraFestaAlex();
        CalculadoraFestaAlex tawan = new CalculadoraFestaAlex();
        CalculadoraFestaAlex eric = new CalculadoraFestaAlex();
       
        
        
        double totalTawan = tawan.encontrarTotalAPagar(2000, 0.05);
        double totalEric = eric.encontrarTotalAPagar(1000.2, 0.4);
        
        
        
        //imprimir o total
        System.out.println(totalEric + totalTawan);
        
        
    }
}
