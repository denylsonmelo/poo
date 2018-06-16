package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Cachorro implements Animal{

    public Cachorro(String nome) {
        this.nome = nome;
    }

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
    
    private String nome;

    public String getNome() {
        return nome;
    }
   
}
