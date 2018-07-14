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
public class EditarProprietarioMenu implements Menu {

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
        System.out.println("  Cadastros > CRUD Proprietario > Editar");
        adicionarLinha();
        System.out.println("");
        this.editar();
        System.out.println("");
        adicionarLinha();
    }

    public void editar() {
        try {
            System.out.print("Insira o ID do proprietario: ");
            int id = SCANNER.nextInt();

            System.out.print("\nInsira um nome: ");
            String nome = SCANNER.nextLine();

            Proprietario p = new Proprietario();
            p.setId(id);
            p.setNome(nome);
            dao.editar(p);
        } catch (InputMismatchException exception) {
            System.out.println("informe um numero");
        }
    }

    public EditarProprietarioMenu() throws ClassNotFoundException, SQLException {
        this.dao = new ProprietarioDao(ConexaoBanco.getConnection());
    }

}
