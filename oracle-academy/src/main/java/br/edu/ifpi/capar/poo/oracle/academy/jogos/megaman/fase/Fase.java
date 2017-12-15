package br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.fase;

import br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.personagens.Boss;
import br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.personagens.Inimigo;
import br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.personagens.InimigoEstatico;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Fase {
    
    private String nome;
    private List<String> arquivoMusica;
    private String arquivoModelagem;
    private int ordem;
    private List<Inimigo> inimigos;
    private List<InimigoEstatico> estaticos;
    private Boss miniboss;
    private Boss boss;

    public String getNome() {
        return nome;
    }

    public List<String> getArquivoMusica() {
        return arquivoMusica;
    }

    public String getArquivoModelagem() {
        return arquivoModelagem;
    }

    public int getOrdem() {
        return ordem;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public List<InimigoEstatico> getEstaticos() {
        return estaticos;
    }

    public Boss getMiniboss() {
        return miniboss;
    }

    public Boss getBoss() {
        return boss;
    }
}
