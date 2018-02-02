package br.edu.ifpi.capar.poo.oracle.academy;

import br.edu.ifpi.capar.poo.oracle.academy.exemplos.Aluno;

/**
 *
 * @author Denylson Melo
 */
public class Booleano {

    public static void main(String[] args) {
        //                      true
        //           false           true
        //     true      false       true
        boolean valor1 = 20 == 20;
        boolean valor2 = 9 >= 33;
        boolean valor3 = 29 <= (39 - 10);// true - 10

        // parenteses
        // esquerda para direita
        // operadores matematicos  * /
        // operadores matematicos  + -
        // operadores logicos  == > < >= <= !=
        // operadores logicos  &&  ||  !
        boolean valorBooleano = valor1 && (valor2 || valor3);

        System.out.println("valor1: " + valor1);
        System.out.println("valor2: " + valor2);
        System.out.println("valor3: " + valor3);
        System.out.println("valorBool: " + valorBooleano);

        if (valorBooleano) {
            System.out.println("entrou no if");
            System.out.println("imprime isso");
        } else {
            System.out.println("entrou no else");
        }

        //boolean ternario =  expressaoLogica ?  valorSeVerdadeiro  :  valorSeFalso       ;
        boolean ternario = 20 > 120 ? true : false;

        if (ternario) {
            System.out.println("imprimiu ternario");
        } else {
            System.out.println("nao imprimiu ternario");
        }

        String nome = valor1 || valor2 ? "Vanessa" : "Tawan";

        int nota = 10;
        Aluno aluno = nota > 7 ? new Aluno("Tawan") : new Aluno("Vanessa");

        System.out.println("Nome do aluno: " + nome);

        int numeroMes = 3;

        switch (numeroMes) {
            case 1:
                System.out.println("janeiro: 31 dias");
                break;
            case 2:
                System.out.println("fevereiro: 28 dias");
                break;
            default:
                System.out.println("valor de mes nao encontrado");
        }

    }
}
