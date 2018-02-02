package br.edu.ifpi.capar.poo.prova.bimestre1.pratica;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Dama_1087 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhaA, colunaA, linhaB, colunaB;
        String linhaLida;
        String[] valores;

        for (;;) {
            linhaLida = scanner.nextLine();
            if (linhaLida.equals("0 0 0 0"))
                break;

            valores = linhaLida.split(" ");
            
            linhaA = Integer.parseInt(valores[0]);
            colunaA = Integer.parseInt(valores[1]);
            linhaB = Integer.parseInt(valores[2]);
            colunaB = Integer.parseInt(valores[3]);
            
            if(linhaA == linhaB && colunaA == colunaB)
                System.out.println("0");
            else if(linhaA == linhaB || colunaA == colunaB
                    || Math.abs(linhaA-linhaB) == Math.abs(colunaA-colunaB)   )
                System.out.println("1");
            else
                System.out.println("2");
            
        }
    }
}
