package br.edu.ifpi.capar.poo.assunto.oo.bd.menu.proprietario;

import br.edu.ifpi.capar.poo.assunto.oo.bd.conexao.ConexaoBanco;
import br.edu.ifpi.capar.poo.assunto.oo.bd.dao.ProprietarioDao;
import br.edu.ifpi.capar.poo.assunto.oo.bd.menu.Menu;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.adicionarLinha;
import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.limparConsole;
import br.edu.ifpi.capar.poo.assunto.oo.bd.model.Proprietario;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class ExcluirProprietarioMenu implements Menu {

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
        System.out.println("  Cadastros > CRUD Proprietario > Excluir");
        adicionarLinha();
        System.out.println("");
        this.excluir();
        System.out.println("");
        adicionarLinha();
    }

    public void excluir() {
        System.out.print("Insira o ID do proprietario: ");
        try {
            int id = SCANNER.nextInt();
            dao.deletar(id);
        } catch (InputMismatchException exception) {
            System.out.println("informe um numero");
        }
    }

    public ExcluirProprietarioMenu() throws ClassNotFoundException, SQLException {
        this.dao = new ProprietarioDao(ConexaoBanco.getConnection());
    }

}
