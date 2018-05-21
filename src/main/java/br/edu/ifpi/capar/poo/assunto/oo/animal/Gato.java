package br.edu.ifpi.capar.poo.noite.animal;

/**
 *
 * @author Denylson Melo
 */
public class Gato {
    
    int quantidadePatas = 4;
    int quantidadeRabo = 1;
    int quantidadeOrelha = 2;
    String corDePelo;
    String nome;

    public Gato(String nome) {
        this.nome = nome;
    }
    
    void pedirComida(){
        System.out.println(nome + " começa a adular");
        System.out.println(nome + " pedir comida");
    }
    
    void dormir(){
        System.out.println(nome + " dormindo");
        System.out.println(nome + " dormindo");
        System.out.println(nome + " dormindo");
        System.out.println(nome + " dormindo");
    }
    
    void miar(){
        System.out.println(nome + " miau");
    }
}
