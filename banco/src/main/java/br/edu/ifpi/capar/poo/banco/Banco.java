package br.edu.ifpi.capar.poo.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Denylson Melo
 */
public abstract class Banco {

    private static final String DRIVER_BANCO = "com.mysql.cj.jdbc.Driver";
    private static final String SERVIDOR = "jdbc:mysql://localhost";
    private static final String PORTA = "3306";
    private static final String NOME_DO_BANCO = "segundo_ano";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final boolean USAR_TIME_ZONE = true;
    private static final String TIME_ZONE = "?serverTimezone=America/New_York";

    
    public static Connection getConexao(){
        try {
            Class.forName(DRIVER_BANCO);
            
            String urlDeConexao = SERVIDOR + ":" + PORTA + "/" + NOME_DO_BANCO;
            if(USAR_TIME_ZONE){
                urlDeConexao += TIME_ZONE;
            }
            
            // falta padrao de projeto -> Singleton
            return DriverManager.getConnection(urlDeConexao, USUARIO, SENHA);
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe do Banco não encontrada");
        } catch (SQLException ex) {
            System.out.println("Deu erro, veja abaixo uma das possibilidades");
            System.out.println("Erro de conexão");
            System.out.println("Conexao não realizada");
            System.out.println("Erro de autenticacao");
        }
        
        return null;
    }
        
    
}
