package br.edu.ifpi.capar.poo.banco.dao;

import br.edu.ifpi.capar.poo.banco.bd.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denylson Melo
 */
public class AlunoDAO {

    public void consultar() {
        try {
            Connection conexao = Banco.getConexao();
            String consulta = "select id, nome from aluno";
            PreparedStatement declaracao = conexao.prepareStatement(consulta);
            ResultSet retorno = declaracao.executeQuery();
            System.out.println("Dados de aluno");
            for (; retorno.next();) {
                System.out.println(retorno.getInt(1));
                System.out.println(retorno.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Deu erro, vocÊ errrrrow");
        }
    }

    public void cadastrar() {
        
        try {
            String comando = "insert into aluno(matricula, nome, idade, sexo, curso_id) values(?, ?, ?, ?, ?)";
            Connection conexao = Banco.getConexao();
            
            PreparedStatement declaracao = conexao.prepareStatement(comando);
            
            declaracao.setString(1, "20161TIINF0001");
            declaracao.setString(2, "Luquinha Nunes");
            declaracao.setInt(3, 17);
            declaracao.setString(4, "X");
            declaracao.setInt(5, 3);
            
            
            declaracao.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
