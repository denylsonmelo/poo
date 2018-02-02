package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1040 {

    public static void main(String[] args) {
        //leitura
        double nota1, nota2, nota3, nota4, media;
        int peso1 = 2, peso2 = 3, peso3 = 4, peso4 = 1, somaDosPesos;
        Scanner input = new Scanner(System.in);

        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();
        // fim da leitura

        //calculo da media
        somaDosPesos = peso1 + peso2 + peso3 + peso4;
        media = (float)(nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) / somaDosPesos;
        //fim do calculo da media

        //verificacao de aprovacao
        System.out.println(String.format("Media: %.1f", media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 || media <= 6.9) {
            System.out.println("Aluno em exame.");

            double notaExame = input.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", notaExame));

            media = (float) (media + notaExame) / 2;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println(String.format("Media final: %.1f", media));
        }
        //fim da verificacao de aprovacao

    }
}
