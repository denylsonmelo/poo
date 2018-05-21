package br.edu.ifpi.capar.poo.banco.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Denylson Melo
 * @param <T>
 */
public interface DAO <T extends Object, ID extends Serializable> {
    
    // generics
    T atualizar(T t);
    T cadastrar(T t);
    List<T> consultar();
    T consultar(int id);
    boolean excluir(T t);
}
