package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Papagaio implements Animal{

    private String nome;

    public String getNome() {
        return nome;
    }
    
    public Papagaio(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        this.falar();
    }
    
    private void falar(){
        System.out.println(this.getNome() + " esta falando como gente");
    }
    
}
