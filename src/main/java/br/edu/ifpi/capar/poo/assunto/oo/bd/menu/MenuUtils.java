package br.edu.ifpi.capar.poo.assunto.oo.bd.menu;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public final class MenuUtils {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void adicionarLinha() {
        System.out.println("*********************************");
    }

    public final static void limparConsole() {
        //gambs
        for (int i = 0; i < 100; ++i) {
            System.out.println();
        }
    }

    public static void exibirMensagemOpcaoInvalida() {
        exibirMensagemOpcaoInvalida("Opção Inválida");
    }

    public static void exibirMensagemOpcaoInvalida(String mensagem) {
        limparConsole();
        adicionarLinha();
        System.out.println(mensagem);
        adicionarLinha();

        SCANNER.nextLine();
    }
}
