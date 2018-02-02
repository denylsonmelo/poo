package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1064 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNumerosPositivos = 0;
        double media = 0, valorLido;

        for (int quantidadeValoresLidos = 1; quantidadeValoresLidos <= 6; quantidadeValoresLidos++) {
            valorLido = scanner.nextDouble();
            if (valorLido > 0) {
                contadorNumerosPositivos++;
                media += valorLido;
                // media = media + valorLido;
            }
        }

        media /= contadorNumerosPositivos;
        // media = media / contadorNumerosPositivos;

        System.out.println(contadorNumerosPositivos + " valores positivos");
        System.out.println(media);
    }
}
