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
        
        String banco = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost";
        String porta = "3306";
        String nomeDoBanco = "segundo_ano";
        String usuario = "root";
        String senha = "root";
        
        //tentar achar a classe do driver
        Class.forName(banco);
        
        String urlDeConexao = url + ":" + porta + "/" + nomeDoBanco + "?serverTimezone=America/New_York";
        System.out.println(urlDeConexao);
        
        //tentar conectar
        Connection conexao = DriverManager.getConnection(urlDeConexao, usuario, senha);
        
        String consulta = "select id, nome as 'Nome do Curso'  from cursoas";
        
        PreparedStatement declaracao = conexao.prepareStatement(consulta);
        
        ResultSet retorno = declaracao.executeQuery();
        
        System.out.println("dados do banco:");
        while(retorno.next()){
            System.out.println(retorno.getInt("id"));
            System.out.println(retorno.getString("Nome do Curso"));
            System.out.println("-------------------------");
        }
        
        System.out.println("rodando");
    }
    
}
