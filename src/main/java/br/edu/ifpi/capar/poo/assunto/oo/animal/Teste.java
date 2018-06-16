package br.edu.ifpi.capar.poo.assunto.oo.animal;


/**
 *
 * @author Denylson Melo
 */
public class Teste {
    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico("zooinfo");
        
        zoo.darEntrada(new Cachorro("bin ladin"));
        zoo.darEntrada(new Gato("nome de gato"));
        zoo.darEntrada(new Papagaio("nome de papagaio"));

        zoo.transferir(0);
        
        System.out.println(zoo);
        
        /*
        //Gato tom = new Gato("tom");
        Cachorro binLaden = new Cachorro("bin laden");
        //Papagaio safira = new Papagaio("safira");
        Animal sabrina = new Cachorro("sabrina");
        
        //tom.emitirSom();
        binLaden.emitirSom();
        //binLaden.latirAgressivamente();
        //safira.emitirSom();
        sabrina.emitirSom();
        */
    }
    
}
