package br.edu.ifpi.capar.poo.assunto.oo.bd;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denylson Melo
 */
public class CompartilhamentoQuartos {

    public static void main(String[] args) {
        try {
            ConexaoBanco banco1 = new ConexaoBanco();
            ConexaoBanco banco2 = new ConexaoBanco();
            
            ConexaoBanco.conectar();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CompartilhamentoQuartos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
