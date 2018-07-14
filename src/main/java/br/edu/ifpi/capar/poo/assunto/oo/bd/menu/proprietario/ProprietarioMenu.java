package br.edu.ifpi.capar.poo.assunto.oo.bd.menu.proprietario;

import br.edu.ifpi.capar.poo.assunto.oo.bd.menu.EstudanteMenu;
import br.edu.ifpi.capar.poo.assunto.oo.bd.menu.Menu;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.CadastrosMenu.exibirMenuCadastros;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.adicionarLinha;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.exibirMensagemOpcaoInvalida;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.limparConsole;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denylson Melo
 */
public final class ProprietarioMenu implements Menu {

    private static final Scanner SCANNER = new Scanner(System.in);
    private final Map<String, Menu> mapaComandos = new HashMap<>();

    @Override
    public void exibir() {
        try {
            boolean voltarMenu = false;
            mapaComandos.put("1", new ListarProprietarioMenu());
            mapaComandos.put("2", new InserirProprietarioMenu());
            mapaComandos.put("3", new EditarProprietarioMenu());
            mapaComandos.put("4", new ExcluirProprietarioMenu());
            
            for (; !voltarMenu;) {
                exibirMenuProprietario();
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProprietarioMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void exibirMenuProprietario() {
        limparConsole();

        adicionarLinha();
        System.out.println("  Compartilhamento de quartos ");
        System.out.println("  Cadastros > CRUD Proprietario ");
        adicionarLinha();
        System.out.println("");
        System.out.println("1. Listar");
        System.out.println("2. Inserir");
        System.out.println("3. Editar");
        System.out.println("4. Excluir");
        System.out.println("9. Voltar");
        System.out.println("");
        adicionarLinha();
        System.out.print("Digite uma opção: ");
    }
}
