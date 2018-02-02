package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1002 {

    public static void main(String[] args) {
        double raio, pi = 3.14159;

        Scanner input = new Scanner(System.in);

        raio = input.nextDouble();

        System.out.println("A=" + (pi * Math.pow(raio, 2)));
    }
}
