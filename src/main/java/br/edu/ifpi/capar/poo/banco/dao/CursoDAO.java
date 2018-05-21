package br.edu.ifpi.capar.poo.banco.dao;

import br.edu.ifpi.capar.poo.banco.model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class CursoDAO implements DAO<Curso>{

    @Override
    public Curso atualizar(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Curso cadastrar(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Curso> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Curso consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
    
    /*
    public List<Curso> consultar(){
        return new ArrayList<>();
    }
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

    @Override
    public boolean excluir(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
