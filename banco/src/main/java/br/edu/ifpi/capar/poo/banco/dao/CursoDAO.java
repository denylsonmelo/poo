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
public class CursoDAO {
 
    public void consultar(){
        try {
            // DataAccessObject
            String consulta = "select id, nome as 'Nome do Curso', carga_horaria, descricao  from cuerso";
            
            Connection conexao = Banco.getConexao();
            
            PreparedStatement declaracao = conexao.prepareStatement(consulta);
            
            ResultSet retorno = declaracao.executeQuery();
            
            System.out.println("dados do banco:");
            while (retorno.next()) {
                System.out.print(retorno.getInt("id"));
                System.out.print("      ");
                System.out.print(retorno.getString("Nome do Curso"));
                System.out.print("      ");
                System.out.print(retorno.getString(3));
                System.out.print("      ");
                System.out.println(retorno.getString(4));
                System.out.print("      ");
                System.out.println("-------------------------");
            }
        } catch (SQLException ex) {
            System.out.println("voce nao eh capaz");
        }
    }
}
