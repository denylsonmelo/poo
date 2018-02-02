package br.edu.ifpi.capar.poo.jogos.megaman.personagens;

import br.edu.ifpi.capar.poo.jogos.megaman.fase.Fase;
import br.edu.ifpi.capar.poo.jogos.megaman.enums.Habilidade;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Boss extends Inimigo{
    
    private final Fase fase;
    private final List<Habilidade> habilidades;

    public Boss(Fase fase, List<Habilidade> habilidades, String nome, int vida, int dano, int defesa, boolean podeVoar, boolean podePlanar, boolean podeEscalarParedes, boolean podeAtirar, boolean podePular, int alcance) {
        super(nome, vida, dano, defesa, podeVoar, podePlanar, podeEscalarParedes, podeAtirar, podePular, alcance);
        this.fase = fase;
        this.habilidades = habilidades;
    }

    /**
     * Construtor simples para se criar um Boss de maneira rápida
     *
     * @param fase Fase em que o Boss se encontra
     * @param habilidades Lista de habilidades que o Boss executa
     * @param nome Nome do referido Boss
     * @param vida
     * @param dano
     * @param defesa
     * @see Inimigo
     * @since 0.0.1
     */
    public Boss(Fase fase, List<Habilidade> habilidades, String nome, int vida, int dano, int defesa) {
        super(nome, vida, dano, defesa);
        this.fase = fase;
        this.habilidades = habilidades;
    }

    public Fase getFase() {
        return fase;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

}
