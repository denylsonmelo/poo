package br.edu.ifpi.capar.poo.revisao;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class uri1021 {

    public static void main(String[] args) throws IOException {
        int notas100, notas50, notas20, notas10, notas5, notas2, moedas1real, moedas50, moedas25, moedas10, moedas5;
        Scanner scanner = new Scanner(System.in);
        double moedas1, valor = scanner.nextDouble();

        notas100 = (int) (valor / 100);
        notas50 = (int) (valor % 100 / 50);
        notas20 = (int) (valor % 100 % 50 / 20);
        notas10 = (int) (valor % 100 % 50 % 20 / 10);
        notas5 = (int) (valor % 100 % 50 % 20 % 10 / 5);
        notas2 = (int) (valor % 100 % 50 % 20 % 10 % 5 / 2);
        moedas1real = (int) (valor % 100 % 50 % 20 % 10 % 5 % 2 / 1);
        moedas50 = (int) (valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 / 0.5);
        moedas25 = (int) (valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 / 0.25);
        moedas10 = (int) (valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 % 0.25 / 0.1);
        moedas5 = (int) (valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 % 0.25 % 0.1 / 0.05);
        moedas1 = (double) (valor % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 % 0.25 % 0.1 % 0.05 / 0.01);

        System.out.println("NOTAS:\n"
                + notas100 + " nota(s) de R$ 100.00\n"
                + notas50 + " nota(s) de R$ 50.00\n"
                + notas20 + " nota(s) de R$ 20.00\n"
                + notas10 + " nota(s) de R$ 10.00\n"
                + notas5 + " nota(s) de R$ 5.00\n"
                + notas2 + " nota(s) de R$ 2.00\n"
                + "MOEDAS:\n"
                + moedas1real + " moeda(s) de R$ 1.00\n"
                + moedas50 + " moeda(s) de R$ 0.50\n"
                + moedas25 + " moeda(s) de R$ 0.25\n"
                + moedas10 + " moeda(s) de R$ 0.10\n"
                + moedas5 + " moeda(s) de R$ 0.05");
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", moedas1);
    }
}
