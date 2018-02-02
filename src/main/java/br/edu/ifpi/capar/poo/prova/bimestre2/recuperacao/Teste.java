package br.edu.ifpi.capar.poo.prova.bimestre2.recuperacao;

/**
 *
 * @author Denylson Melo
 */
public class Teste {

    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Cavalo();
        Animal animal3 = new Preguica();
        Animal animal4 = new Animal();
        
        animal1.emitirSom(); // auu ? som generico
        animal2.emitirSom(); // relinchar
        animal3.emitirSom(); // zzzz
        animal4.emitirSom(); // som generico
    }
}
