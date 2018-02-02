package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValoresLidos = 1, contadorNumerosPositivos = 0;
        
        do {            
            if(scanner.nextDouble() > 0)
                contadorNumerosPositivos++;
            quantidadeValoresLidos++;
        } while (quantidadeValoresLidos <= 6);
        System.out.println(contadorNumerosPositivos + " valores positivos");
    }
}
