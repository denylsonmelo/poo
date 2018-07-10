package br.edu.ifpi.capar.poo.assunto.oo.bd.dao;

import br.edu.ifpi.capar.poo.assunto.oo.bd.model.Proprietario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denylson Melo
 */
public class ProprietarioDao implements Crud<Proprietario> {

    private Connection conexao;

    @Override
    public List<Proprietario> visualizar() {
        List<Proprietario> list = new ArrayList<>();

        try {
            Statement consultaAoBanco
                    = conexao.createStatement();

            ResultSet doBanco
                    = consultaAoBanco.executeQuery("SELECT * FROM proprietario");

            while (doBanco.next()) {
                Proprietario proprietario = new Proprietario();
                proprietario.setId(doBanco.getInt("id"));
                proprietario.setNome(doBanco.getString("nome"));

                list.add(proprietario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Proprietario inserir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proprietario editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ProprietarioDao(Connection conexao) {
        this.conexao = conexao;
    }
}
