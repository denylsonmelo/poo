package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1013 {

    public static void main(String[] args) {
        int numero1, numero2, numero3, maior;
        Scanner input = new Scanner(System.in);

        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();
        
        maior = (numero1 + numero2 + Math.abs(numero1 - numero2)) / 2;
        maior = (maior + numero3 + Math.abs(maior - numero3)) / 2;

        System.out.println(maior + " eh o maior");

    }
}
