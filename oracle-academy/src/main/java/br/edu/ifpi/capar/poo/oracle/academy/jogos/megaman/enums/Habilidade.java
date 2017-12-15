package br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.enums;

/**
 *
 * @author Denylson Melo
 */
public enum Habilidade {

    TIRO_BASICO("tiro comum", Efeito.NORMAL, "arquivo001", "som001"),
    TIRO_CARREGADO("tiro carregado", Efeito.NORMAL, "arquivo002", "som002"),
    TIRO_TRIPLO("tiro triplo", Efeito.NORMAL, "arquivo003", "som003"),
    EXPLOSAO_FOGO("Explosão de Fogo", Efeito.FOGO, "arquivo004", "som004"),
    BLOCO_GELO("Bolco de Gelo em forma de pinguim", Efeito.GELO, "arquivo005", "som005"),
    BOLA_ESPINHO("Bola de Espinho", Efeito.NORMAL, "arquivo006", "som006"),
    MORDIDA("Mordida tosca", Efeito.LENTIDAO, "arquivo007", "som007"),
    BEIJINHO_OMBRO("Beijinho no ombro que o reclaque passa longe", Efeito.NORMAL, "arquivo008", "som008"),
    TIRO_BOLHAS("tiro de bolhas", Efeito.LENTIDAO, "arquivo009", "som009"),
    TIRO_TELEGUIADO("tiro teleguiado", Efeito.NORMAL, "arquivo010", "som010"),
    BUMERANGUE("bumerangue", Efeito.NORMAL, "arquivo011", "som011"),
    TIRO_ELETRICO("tiro eletrico", Efeito.ELETRICO, "arquivo012", "som012");

    private final String nome;
    private final Efeito efeito;
    private final String arquivoVisual;
    private final String som;

    public String getNome() {
        return nome;
    }

    public Efeito getEfeito() {
        return efeito;
    }

    public String getArquivoVisual() {
        return arquivoVisual;
    }

    public String getSom() {
        return som;
    }

    private Habilidade(String nome, Efeito efeito, String arquivoVisual, String som) {
        this.nome = nome;
        this.efeito = efeito;
        this.arquivoVisual = arquivoVisual;
        this.som = som;
    }
}
