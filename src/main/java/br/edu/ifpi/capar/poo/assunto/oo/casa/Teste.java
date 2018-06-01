package br.edu.ifpi.capar.poo.assunto.oo.casa;

/**
 *
 * @author Denylson Melo
 */
public class Teste {
    public static void main(String[] args) {
        
        Porta porta = new Porta();
        
        
        //porta.aberta = false; // quer dizer que vai estar fechada
        //porta.fechar();
        
          
        Proprietario proprietario1 = new Proprietario("Vitoria");
        Proprietario proprietario2 = new Proprietario("Luzia");
        Proprietario proprietario3 = null;
        Proprietario proprietario4 = proprietario1;
        
        proprietario4.mudar("Geyssyele");
        
        proprietario1.imprimirNome();
        proprietario2.imprimirNome();
        //proprietario3.imprimirNome();
        proprietario4.imprimirNome();
        
        
        System.out.println(proprietario1);
        System.out.println(proprietario2);
        System.out.println(proprietario3);
        System.out.println(proprietario4);
    }
}
