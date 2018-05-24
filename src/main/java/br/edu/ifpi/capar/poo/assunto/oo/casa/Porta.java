package br.edu.ifpi.capar.poo.assunto.oo.casa;

/**
 *
 * @author Denylson Melo
 */
public class Porta {
    
    String material;
    String dono;
    boolean aberta = true;
    
    boolean verificarEstarFechada(){
        return !aberta;
    }
}
