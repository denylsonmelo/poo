package br.edu.ifpi.capar.poo.prova.bimestre1.pratica;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class CrescimentoPopulacional_1160 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAnos, numeroCasosTeste, populacaoA, populacaoB;
        double crescimentoA, crescimentoB;

        numeroCasosTeste = scanner.nextInt();

        for (int i = 0; i < numeroCasosTeste; i++) {
            populacaoA = scanner.nextInt();
            populacaoB = scanner.nextInt();

            crescimentoA = scanner.nextDouble();
            crescimentoB = scanner.nextDouble();

            
            for (quantidadeAnos = 1; quantidadeAnos < 100; quantidadeAnos++) {
                
                // 570*0,3 = 171   5,2     0,052
                // 570+171 = 741
                // 741 = 570 + (570*30/100)
                //741 = 570 * 1,30
                //741 = 570 * 0,70
                populacaoA *= 1 + crescimentoA/100;
                populacaoB *= 1 + crescimentoB/100;
                
                if (populacaoA > populacaoB) {
                    break;
                }
            }     
            
            if (quantidadeAnos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(quantidadeAnos + " anos.");
            }
        }
    }
}
