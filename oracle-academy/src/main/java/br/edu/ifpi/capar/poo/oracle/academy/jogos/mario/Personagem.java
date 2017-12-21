package br.edu.ifpi.capar.poo.oracle.academy.jogos.mario;

import java.util.Set;

/**
 *
 * @author Denylson Melo
 */
public class Personagem {

    private final String nome;
    private int vida;
    private boolean podeVoar;
    private boolean podePular;
    private int velocidade;
    private int largura;
    private int altura;
    private final Set<Habilidade> habilidades;

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }

    public void setPodePular(boolean podePular) {
        this.podePular = podePular;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        this.habilidades.add(habilidade);
    }
    
    public void removerHabilidade(Habilidade habilidade){
        this.habilidades.remove(nome);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public boolean isPodePular() {
        return podePular;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public Set<Habilidade> getHabilidades() {
        return habilidades;  //  como retornar um set, list imodificavel ?
    }

    public Personagem(String nome, int vida, boolean podeVoar, boolean podePular, int velocidade, int largura, int altura, Set<Habilidade> habilidades) {
        this.nome = nome;
        this.vida = vida;
        this.podeVoar = podeVoar;
        this.podePular = podePular;
        this.velocidade = velocidade;
        this.largura = largura;
        this.altura = altura;
        this.habilidades = habilidades;
    }
    
}
