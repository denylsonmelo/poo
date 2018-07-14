package br.edu.ifpi.capar.poo.assunto.oo.bd.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Denylson Melo
 */
public final class ConexaoBanco {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String NOME = "kitnet";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final String SERVIDOR = "localhost";
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            // Carregando o Driver do MySQL
            Class.forName(DRIVER);
            connection = DriverManager
                    .getConnection("jdbc:mysql://"+ SERVIDOR +"/" + NOME, USUARIO, SENHA);
        }        
        return connection;
    }
}
