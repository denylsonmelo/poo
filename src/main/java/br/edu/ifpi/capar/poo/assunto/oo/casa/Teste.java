package br.edu.ifpi.capar.poo.noite.casa;

/**
 *
 * @author Denylson Melo
 */
public class Teste {
    public static void main(String[] args) {
        
        Porta porta = new Porta();
        
        if(porta.verificarEstarFechada())
            System.out.println("porta fechada");
        else
            System.out.println("porta aberta");
    }
}
