package br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.personagens;

/**
 *
 * @author Denylson Melo
 */
public class Inimigo extends Personagem{

    public Inimigo(String nome, int vida, int dano, int defesa) {
        super(nome, vida, dano, defesa);
    }

    public Inimigo(String nome, int vida, int dano, int defesa, boolean podeVoar, boolean podePlanar, boolean podeEscalarParedes, boolean podeAtirar, boolean podePular, int alcance) {
        super(nome, vida, dano, defesa, podeVoar, podePlanar, podeEscalarParedes, podeAtirar, podePular, alcance);
    }
    
}
