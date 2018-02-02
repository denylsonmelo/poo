package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class uri1051 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double impostoDevido, excesso, primeiraAliquota = 0.08;
        double salario = scanner.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario >= 2000.01 && salario <= 3000.00) {
                excesso = salario - 2000.00;
                impostoDevido = excesso * primeiraAliquota;
                System.out.printf("R$ %.2f\n", impostoDevido);

            } else if (salario >= 3000.01 && salario <= 4500.00) {
                impostoDevido = 1000 * primeiraAliquota;

                excesso = salario - 3000.00;
                impostoDevido = impostoDevido + excesso * 0.18;
                System.out.printf("R$ %.2f\n", impostoDevido);

            } else if (salario > 4500.00) {
                impostoDevido = 1000 * primeiraAliquota;
                impostoDevido = impostoDevido + 1500 * 0.18;

                excesso = salario - 4500.00;
                impostoDevido = impostoDevido + excesso * 0.28;
                System.out.printf("R$ %.2f\n", impostoDevido);

            }

        }
    }
