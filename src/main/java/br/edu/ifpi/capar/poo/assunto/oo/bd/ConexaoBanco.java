package br.edu.ifpi.capar.poo.assunto.oo.bd;

/**
 *
 * @author Denylson Melo
 */
public class ConexaoBanco {

    private static final String DRIVER_BANCO = "com.mysql.jdbc.Driver";
    
    public static void conectar() throws ClassNotFoundException{
        System.out.println("entrou no banco");
    
        // Carregando o Driver do MySQL
        Class.forName(DRIVER_BANCO);
        
        System.out.println("pegou a classe ");
        
        /*
        // Conectando ao Banco
        Connection conexaoAoBanco = 
                DriverManager
                        .getConnection("jdbc:mysql://localhost/ada",
                                "ada","ada");
                                */
}
}
