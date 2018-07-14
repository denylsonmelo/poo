package br.edu.ifpi.capar.poo.assunto.oo.bd.menu.proprietario;

import br.edu.ifpi.capar.poo.assunto.oo.bd.conexao.ConexaoBanco;
import br.edu.ifpi.capar.poo.assunto.oo.bd.dao.ProprietarioDao;
import br.edu.ifpi.capar.poo.assunto.oo.bd.menu.Menu;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.adicionarLinha;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.limparConsole;
import br.edu.ifpi.capar.poo.assunto.oo.bd.model.Proprietario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public final class ListarProprietarioMenu implements Menu {

    private final ProprietarioDao dao;
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void exibir() {
        this.exibirListarProprietarioMenu();
        SCANNER.nextLine();
    }

    public void exibirListarProprietarioMenu() {
        limparConsole();

        adicionarLinha();
        System.out.println("  Compartilhamento de quartos ");
        System.out.println("  Cadastros > CRUD Proprietario > Listar");
        adicionarLinha();
        System.out.println("");
        this.exibirProprietarios();
        System.out.println("");
        adicionarLinha();
    }

    public void exibirProprietarios() {
        List<Proprietario> proprietarios = dao.visualizar();

        System.out.print("    ID");
        System.out.println("    Nome");
        proprietarios.forEach(proprietario -> {
            System.out.print("     " + proprietario.getId());
            System.out.println("     " + proprietario.getNome());
        });
    }

    public ListarProprietarioMenu() throws ClassNotFoundException, SQLException {
        this.dao = new ProprietarioDao(ConexaoBanco.getConnection());
    }

}
