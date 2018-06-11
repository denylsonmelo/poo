package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        this.latir();
    }

    public void latirAgressivamente(){
        System.out.println(this.getNome() + " esta latindo agressivamente");
    }

    private void latir(){
        System.out.println(this.getNome() + " esta latindo");
    }
    
    public Cachorro(String nome) {
        super(nome);
    }
   
}
