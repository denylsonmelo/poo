package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1065 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePares = 0;
        
        for (int quantidadeValoresLidos = 1; quantidadeValoresLidos <= 5; quantidadeValoresLidos++) {
            if(scanner.nextDouble()%2 == 0)
                quantidadePares++;
        }
        
        System.out.println(quantidadePares + " valores pares");
    }
}
