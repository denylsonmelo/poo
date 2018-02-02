package br.edu.ifpi.capar.poo.jogos.clash.royale;

import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Construcao extends Carta{

    private final int vida;
    private final double velocidadeDeGeracao;
    private final int quantidadeTropas;

    public int getVida() {
        return vida * this.getNivel();
    }

    public double getVelocidadeDeGeracao() {
        return velocidadeDeGeracao;
    }

    public int getQuantidadeTropas() {
        return quantidadeTropas + this.getNivel();
    }

    public Construcao(int vida, double velocidadeDeGeracao, int quantidadeTropas, int elixir, Raridade raridade, int nivel, String nome, String descricao, int tempoRecarga, List<Alvo> alvos) {
        super(elixir, raridade, nivel, nome, descricao, tempoRecarga, alvos);
        this.vida = vida;
        this.velocidadeDeGeracao = velocidadeDeGeracao;
        this.quantidadeTropas = quantidadeTropas;
    }
}
