package br.edu.ifpi.capar.poo.atividades.sala;

import java.math.BigDecimal;

/**
 *
 * @author Denylson Melo
 */
class Cliente {

    //propriedades
    String nome;
    String cpf;
    String rg;
    int idade;
    String nomePai;
    String nomeMae;
    BigDecimal dinheiro;
    boolean cartaoLoja;
    CartaoCredito cartaoCredito;
    boolean spc;
    boolean serasa;
    Dividas dividas;

    //comportamentos
    CompraRealizada comprar(Produto produto) {
        produto = "algo" + produto;
        return new CompraRealizada();
    }

    escolherProduto();

    pedirDesconto();

    fazerDivida();

    pagar();

    experimentar();

    fazerCartao();

    pedirGarantia();

   
}
