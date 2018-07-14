package br.edu.ifpi.capar.poo.assunto.oo.bd.dao;

import br.edu.ifpi.capar.poo.assunto.oo.bd.model.Proprietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    public boolean inserir(Proprietario proprietario) {

        try {
            PreparedStatement instrucaoParaBanco = conexao
                    .prepareStatement("insert into proprietario(nome) values (?)");

            instrucaoParaBanco.setString(1, proprietario.getNome());

            return instrucaoParaBanco.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deletar(int id) {
        try {
            PreparedStatement instrucaoParaBanco = conexao
                    .prepareStatement("delete from proprietario where id=?");
            
            instrucaoParaBanco.setInt(1, id);
            
            return instrucaoParaBanco.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar(Proprietario proprietario) {
        try {
            PreparedStatement instrucaoParaBanco = conexao
                    .prepareStatement("update proprietario set nome=? where id=?");
            
            instrucaoParaBanco.setString(1, proprietario.getNome());
            instrucaoParaBanco.setInt(2, proprietario.getId());
            
            return instrucaoParaBanco.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ProprietarioDao(Connection conexao) {
        this.conexao = conexao;
    }
}
