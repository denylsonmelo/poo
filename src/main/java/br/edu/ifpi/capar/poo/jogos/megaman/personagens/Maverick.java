package br.edu.ifpi.capar.poo.jogos.megaman.personagens;

import br.edu.ifpi.capar.poo.jogos.megaman.enums.Habilidade;
import br.edu.ifpi.capar.poo.jogos.megaman.exception.NaoPodeAtirarException;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Maverick extends Personagem {

    private Habilidade habilidadeEscolhida;
    private List<Habilidade> habilidades;

    public int atirar() throws NaoPodeAtirarException{
        if(isPodeAtirar()){
            return this.getDano();
        }
        throw new NaoPodeAtirarException("O " + this.getClass().getSimpleName() + " <" + this.getNome() + "> não pode atirar");
    }

    public void escolherHabilidade(Habilidade habilidade) {
        this.habilidadeEscolhida = habilidade;
    }

    public void conseguirHabilidade(Habilidade habilidade) {
        this.habilidades.add(habilidade);
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public Maverick(String nome, int vida, int dano, int defesa, boolean podeVoar, boolean podePlanar, int alcance, List<Habilidade> habilidades) {
        super(nome, vida, dano, defesa, podeVoar = true, podePlanar, true, true, true, alcance);
        this.habilidades = habilidades;
    }
}
