package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Gato implements Animal {

    int quantidadePatas = 4;
    int quantidadeRabo = 1;
    int quantidadeOrelha = 2;
    private String nome;

    public String getNome() {
        return nome;
    }

    public Gato(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        this.miar();
    }

    private void miar() {
        System.out.println(this.getNome() + " miau");
    }
}
