package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1008 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroFuncionario = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + horasTrabalhadas * valorHora);
    }
}
