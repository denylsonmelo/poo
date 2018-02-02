package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePar, quantidadeImpar, quantidadePositivo, quantidadeNegativo, valorLido;
        
        quantidadePar = quantidadeImpar = quantidadePositivo = quantidadeNegativo = 0;
        
        for (int quantidadeValoresLidos = 1; quantidadeValoresLidos <= 5; quantidadeValoresLidos++) {
            valorLido = scanner.nextInt();
            
            if( valorLido%2 == 0)
                quantidadePar++;
            else
                quantidadeImpar++;
            
            if(valorLido > 0)
                quantidadePositivo++;
            else if(valorLido < 0)
                quantidadeNegativo++;
        }
        
        System.out.println(quantidadePar + " valor(es) par(es)");
        System.out.println(quantidadeImpar + " valor(es) impar(es)");
        System.out.println(quantidadePositivo + " valor(es) positivo(s)");
        System.out.println(quantidadeNegativo + " valor(es) negativo(s)");
    }
}
