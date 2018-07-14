package br.edu.ifpi.capar.poo.assunto.oo.bd.menu;

import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.exibirMensagemOpcaoInvalida;

/**
 *
 * @author Denylson Melo
 */
public final class EstudanteMenu implements Menu {

    public static void exibirMenuEstudante() {
        exibirMensagemOpcaoInvalida("Crud de Estudantes\nFunção ainda não disponivel");
    }

    @Override
    public void exibir() {
        exibirMenuEstudante();
    }

}
