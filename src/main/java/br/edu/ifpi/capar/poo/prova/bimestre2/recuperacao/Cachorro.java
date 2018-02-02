package br.edu.ifpi.capar.poo.prova.bimestre2.recuperacao;

/**
 *
 * @author Denylson Melo
 */
public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("au au au");
    }
    
    public void correr(){
        System.out.println("correndo o cachorro");
    }
    
}
