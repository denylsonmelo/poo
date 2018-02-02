package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorLido = scanner.nextDouble();

        if (valorLido >= 0.0 && valorLido <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (valorLido > 25.0 && valorLido <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (valorLido > 50.0 && valorLido <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (valorLido > 75.0 && valorLido <= 100.0) {
            System.out.println("Intervalo (75,100]");
        } else if (valorLido < 0.0 || valorLido > 100.0) {
            System.out.println("Fora de intervalo");
        }

    }
}
