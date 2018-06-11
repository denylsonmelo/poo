package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Papagaio extends Animal{

    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        this.falar();
    }
    
    private void falar(){
        System.out.println(this.getNome() + " esta falando como gente");
    }
    
}
