package br.edu.ifpi.capar.poo.noite.animal;

import br.edu.ifpi.capar.poo.noite.animal.Gato;

/**
 *
 * @author Denylson Melo
 */
public class Teste {
    public static void main(String[] args) {
        
        Gato tom = new Gato("tom");
        Gato binLaden = new Gato("bin laden");
        Gato safira = new Gato("safira");
        
        tom.pedirComida();
        tom.miar();
        tom.dormir();
        
        binLaden.dormir();
        
        safira.miar();
        
        
        
    }
    
}
