package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1005 {

    public static void main(String[] args) {
        double peso1, peso2, nota1, nota2;
        peso1 = 3.5;
        peso2 = 7.5;

        Scanner input = new Scanner(System.in);

        nota1 = input.nextDouble();
        nota2 = input.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        System.out.printf("MEDIA = %.5f", media);
    }
}
