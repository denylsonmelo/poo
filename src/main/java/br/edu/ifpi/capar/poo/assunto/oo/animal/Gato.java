package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public class Gato extends Animal{
    
    int quantidadePatas = 4;
    int quantidadeRabo = 1;
    int quantidadeOrelha = 2;

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        this.miar();
    }
    
    private void miar(){
        System.out.println(this.getNome() + " miau");
    }
}
