package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Animal {

    private String nome;
    private String cor;

    public void emitirSom(){
        System.out.println(this.getNome() + " emitindo um som");
    }
    
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Animal(String nome) {
        this.nome = nome;
    }
}
