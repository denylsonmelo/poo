package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1036 {

    public static void main(String[] args) {
        double valorA, valorB, valorC;
        Scanner scanner = new Scanner(System.in);

        valorA = scanner.nextDouble();
        valorB = scanner.nextDouble();
        valorC = scanner.nextDouble();

        if (valorA == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                double raiz1 = (-1 * valorB + Math.sqrt(delta)) / (2 * valorA);
                double raiz2 = (-1 * valorB - Math.sqrt(delta)) / (2 * valorA);
                System.out.printf("R1 = %.5f\n", raiz1);
                System.out.printf("R2 = %.5f\n", raiz2);
            }
        }
    }
}
