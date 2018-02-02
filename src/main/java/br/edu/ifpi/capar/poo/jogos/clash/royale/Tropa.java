package br.edu.ifpi.capar.poo.jogos.clash.royale;

import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Tropa extends Carta{

    private final int ataque;
    private final int vida;
    private final int alcance;
    private final int velocidadeDeMovimento;

    public int getAtaque() {
        return ataque * this.getNivel();
    }

    public int getVida() {
        return vida * this.getNivel();
    }

    public int getAlcance() {
        return alcance;
    }

    public int getVelocidadeDeMovimento() {
        return velocidadeDeMovimento;
    }

    public Tropa(int ataque, int vida, int alcance, int velocidadeDeMovimento, int elixir, 
            Raridade raridade, int nivel, String nome, String descricao, int tempoRecarga, List<Alvo> alvos) {
        
        super(elixir, raridade, nivel, nome, descricao, tempoRecarga, alvos);
        this.ataque = ataque;
        this.vida = vida;
        this.alcance = alcance;
        this.velocidadeDeMovimento = velocidadeDeMovimento;
    }
}
