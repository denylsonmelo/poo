package br.edu.ifpi.capar.poo.assunto.oo.casa;

/**
 *
 * @author Denylson Melo
 */
public class Proprietario {
    
    private String nome;
    private Sexo sexo;
    private String endereco;

    public void mudar(String nome){
        this.nome = nome;
    }
    
    public void imprimirNome(){
        System.out.println("meu nome é: " + this.nome);
    }
    
    public Proprietario(String nome) {
        this.nome = nome;
    }
}
