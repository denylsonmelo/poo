package br.edu.ifpi.capar.poo.assunto.oo.bd.menu;

import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.adicionarLinha;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.exibirMensagemOpcaoInvalida;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.limparConsole;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public final class Principal implements Menu {

    private static final Scanner SCANNER = new Scanner(System.in);
    private final Map<String, Menu> mapaComandos = new HashMap<>();

    @Override
    public void exibir() {

        boolean terminarPrograma = false;
        mapaComandos.put("1", new LocacaoMenu());
        mapaComandos.put("2", new CadastrosMenu());

        for (; !terminarPrograma;) {
            exibirMenuPrincipal();
            String opcao = SCANNER.nextLine();

            Menu menu = mapaComandos.get(opcao);
            if (menu != null) {
                menu.exibir();
            } else if (opcao.equals("9")) {
                terminarPrograma = true;
            } else {
                exibirMensagemOpcaoInvalida();
            }
        }
    }

    public static void exibirMenuPrincipal() {
        limparConsole();

        adicionarLinha();
        System.out.println("  Compartilhamento de quartos");
        adicionarLinha();
        System.out.println("");
        System.out.println("1. Locar um quarto (WIP)");
        System.out.println("2. Cadastros");
        System.out.println("9. Encerrar Programa");
        System.out.println("");
        adicionarLinha();
        System.out.print("Digite uma opção: ");
    }
}
