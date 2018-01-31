package br.edu.ifpi.capar.poo.banco.bd;

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
    private static Connection connection;

    public static Connection getConexao() {
        try {
            Class.forName(DRIVER_BANCO);

            String urlDeConexao = SERVIDOR + ":" + PORTA + "/" + NOME_DO_BANCO;
            if (USAR_TIME_ZONE) {
                urlDeConexao += TIME_ZONE;
            }

            // Singleton
            if (connection == null) {
                connection = DriverManager.getConnection(urlDeConexao, USUARIO, SENHA);
            }

            return connection;

        } catch (ClassNotFoundException ex) {
            System.out.println("Classe do Banco não encontrada");
        } catch (SQLException ex) {
            System.out.println("Deu erro, veja abaixo uma das possibilidades: ");
            System.out.println(" 1) Erro de conexão");
            System.out.println(" 2) Conexao não realizada");
            System.out.println(" 3) Erro de autenticacao");
        }

        return null;
    }

}
