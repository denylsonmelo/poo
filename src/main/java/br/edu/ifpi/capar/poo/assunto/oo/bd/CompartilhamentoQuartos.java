package br.edu.ifpi.capar.poo.assunto.oo.bd;

import br.edu.ifpi.capar.poo.assunto.oo.bd.dao.ProprietarioDao;
import br.edu.ifpi.capar.poo.assunto.oo.bd.model.Proprietario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denylson Melo
 */
public class CompartilhamentoQuartos {

    public static void main(String[] args) {
        try {

            ProprietarioDao dao = new ProprietarioDao(ConexaoBanco.getConnection());
            
            Proprietario p = new Proprietario();
            
            p.setId(3);
            p.setNome("juvenaldo");
            
            dao.editar(p);
            
            dao.visualizar().forEach(System.out::println);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CompartilhamentoQuartos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
