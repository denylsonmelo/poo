package br.edu.ifpi.capar.poo.jogos.clash.royale;

import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public abstract class Carta {

    private int nivel;
    private final int elixir;
    private final Raridade raridade;
    private final String nome;
    private final String descricao;
    private final int tempoRecarga;
    private final List<Alvo> alvos;

    public List<Alvo> getAlvos() {
        return alvos;
    }

    public int getQuantidadeParaUpar(){
        return nivel * raridade.getMultiplicador();
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getElixir() {
        return elixir;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTempoRecarga() {
        return tempoRecarga;
    }

    public Carta(int elixir, Raridade raridade, int nivel, String nome, 
            String descricao, int tempoRecarga, List<Alvo> alvos) {
        this.elixir = elixir;
        this.raridade = raridade;
        this.nivel = nivel;
        this.nome = nome;
        this.descricao = descricao;
        this.tempoRecarga = tempoRecarga;
        this.alvos = alvos;
    }
}
