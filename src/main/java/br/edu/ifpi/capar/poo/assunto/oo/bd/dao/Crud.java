package br.edu.ifpi.capar.poo.assunto.oo.bd.dao;

import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public interface Crud<T extends Object> {

    boolean inserir(T t);

    boolean deletar(int id);

    boolean editar(T t);

    List<T> visualizar();
}
