package br.edu.ifpi.capar.poo.revisao;

import java.util.Scanner;

public class uri1046 {

    public static void main(String[] args) {
        int horaInicio, horaFim, duracao;
        Scanner input = new Scanner(System.in);

        horaInicio = input.nextInt();
        horaFim = input.nextInt();

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else if (horaInicio > horaFim) {
            duracao = 24 - horaInicio + horaFim;
        } else {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
