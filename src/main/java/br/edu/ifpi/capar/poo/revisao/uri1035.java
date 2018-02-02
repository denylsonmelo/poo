package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1035 {

    public static void main(String[] args) {

        int valorA, valorB, valorC, valorD;
        Scanner input = new Scanner(System.in);

        valorA = input.nextInt();
        valorB = input.nextInt();
        valorC = input.nextInt();
        valorD = input.nextInt();

        /*
        se B for maior do que C e se D for maior do que A, 
        e a soma de C com D for maior que a soma de A e B 
        e se C e D, ambos, forem positivos e se 
        a variável A for par escrever a mensagem 
        "Valores aceitos", senão escrever "Valores nao aceitos".
         */
        if (valorB > valorC && valorD > valorA
                && (valorC + valorD) > (valorA + valorB)
                && (valorC > 0 && valorD > 0) && (valorA % 2 == 0)) {
            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
