package br.edu.ifpi.capar.poo.assunto.oo.animal;

/**
 *
 * @author Denylson Melo
 */
public interface Animal {

    void emitirSom();
    String getNome();
    
    /*default void emitirSom(){
        System.out.println("barulhando ....");
    }*/

}
