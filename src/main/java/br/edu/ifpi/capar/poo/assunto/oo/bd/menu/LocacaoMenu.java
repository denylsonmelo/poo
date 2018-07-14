package br.edu.ifpi.capar.poo.assunto.oo.bd.menu;

import static br.edu.ifpi.capar.poo.assunto.oo.bd.menu.MenuUtils.exibirMensagemOpcaoInvalida;

/**
 *
 * @author Denylson Melo
 */
public final class LocacaoMenu implements Menu{
    public static void exibirMenuLocacao() {
        exibirMensagemOpcaoInvalida("Locação de Quartos\nFunção ainda não disponivel");
    }

    @Override
    public void exibir() {
        exibirMenuLocacao();
    }
}
