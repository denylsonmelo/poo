package br.edu.ifpi.capar.poo.assunto.oo.bd.menu;

import br.edu.ifpi.capar.poo.assunto.oo.bd.menu.proprietario.ProprietarioMenu;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.LocacaoMenu.exibirMenuLocacao;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.adicionarLinha;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.exibirMensagemOpcaoInvalida;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.limparConsole;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.Principal.exibirMenuPrincipal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public final class CadastrosMenu implements Menu{

    private static final Scanner SCANNER = new Scanner(System.in);
    private final Map<String, Menu> mapaComandos = new HashMap<>();

    @Override
    public void exibir() {

        boolean voltarMenu = false;
        mapaComandos.put("1", new ProprietarioMenu());
        mapaComandos.put("2", new EstudanteMenu());

        for (; !voltarMenu;) {
            exibirMenuCadastros();
            String opcao = SCANNER.nextLine();

            Menu menu = mapaComandos.get(opcao);
            if (menu != null) {
                menu.exibir();
            } else if (opcao.equals("9")) {
                voltarMenu = true;
            } else {
                exibirMensagemOpcaoInvalida();
            }
        }
    }
    
    public static void exibirMenuCadastros() {
        limparConsole();

        adicionarLinha();
        System.out.println("  Compartilhamento de quartos ");
        System.out.println("  Cadastros ");
        adicionarLinha();
        System.out.println("");
        System.out.println("1. Proprietario");
        System.out.println("2. Estudante");
        System.out.println("9. Voltar");
        System.out.println("");
        adicionarLinha();
        System.out.print("Digite uma opção: ");
    }
}
