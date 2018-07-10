package br.edu.ifpi.capar.poo.assunto.oo.bd;

import br.edu.ifpi.capar.poo.assunto.oo.bd.model.Proprietario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Denylson Melo
 */
public class ConexaoBanco {

    private static final String DRIVER_BANCO = "com.mysql.jdbc.Driver";

    public static Connection conectar() throws ClassNotFoundException, SQLException {
        // Carregando o Driver do MySQL
        Class.forName(DRIVER_BANCO);
        return DriverManager.getConnection("jdbc:mysql://localhost/kitnet", "root", "root");
    }
}
