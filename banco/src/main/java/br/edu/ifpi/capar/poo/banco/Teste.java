package br.edu.ifpi.capar.poo.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Denylson Melo
 */
public class Teste {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Connection conexao = Banco.getConexao();
        
        // DataAccessObject
        
        
        String consulta = "select id, nome as 'Nome do Curso', carga_horaria, descricao  from curso";
        
        PreparedStatement declaracao = conexao.prepareStatement(consulta);
        
        ResultSet retorno = declaracao.executeQuery();
        
        System.out.println("dados do banco:");
        while(retorno.next()){
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
        
        System.out.println("rodando");
    }
    
}
