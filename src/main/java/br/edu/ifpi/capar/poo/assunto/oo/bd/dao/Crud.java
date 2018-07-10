package br.edu.ifpi.capar.poo.assunto.oo.bd.dao;

import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public interface Crud<T extends Object> {

    T inserir();

    boolean deletar();

    T editar();

    List<T> visualizar();
}
