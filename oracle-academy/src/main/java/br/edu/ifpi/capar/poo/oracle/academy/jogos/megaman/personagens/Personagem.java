package br.edu.ifpi.capar.poo.oracle.academy.jogos.megaman.personagens;

/**
 * informacao especial
 *
 * @author Denylson Melo
 */
public abstract class Personagem {

    private final String nome;
    private int vida;
    private final int dano;
    private final int defesa;
    private final boolean podeVoar;
    private final boolean podePlanar;
    private final boolean podeEscalarParedes;
    private final boolean podeAtirar;
    private final boolean podePular;
    private final int alcance;

    public Personagem(String nome, int vida, int dano, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
        this.podeVoar = false;
        this.podePlanar = false;
        this.podeEscalarParedes = false;
        this.podeAtirar = false;
        this.podePular = false;
        this.alcance = 0;
    }

    public Personagem(String nome, int vida, int dano, int defesa, boolean podeVoar, boolean podePlanar, boolean podeEscalarParedes, boolean podeAtirar,boolean podePular, int alcance) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
        this.podeVoar = podeVoar;
        this.podePlanar = podePlanar;
        this.podeEscalarParedes = podeEscalarParedes;
        this.podeAtirar = podeAtirar;
        this.podePular = podePular;
        this.alcance = alcance;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public boolean isPodePlanar() {
        return podePlanar;
    }

    public boolean isPodeEscalarParedes() {
        return podeEscalarParedes;
    }

    public boolean isPodeAtirar() {
        return podeAtirar;
    }

    public int getAlcance() {
        return alcance;
    }

}
