package br.edu.ifpi.capar.poo.banco.dao;

import br.edu.ifpi.capar.poo.banco.model.Curso;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public interface DAO {
    
    // generics
    Curso atualizar(Curso curso);
    Curso cadastrar(Curso curso);
    List<Curso> consultar();
    Curso consultar(int id);
    boolean excluir(Curso curso);
}
