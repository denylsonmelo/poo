package br.edu.ifpi.capar.poo.prova.bimestre2.recuperacao;

/**
 *
 * @author Denylson Melo
 */
public class Animal {

    private String nome;
    private Integer idade;
    
    public void emitirSom(){
        System.out.println("som generico de animal");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
}
