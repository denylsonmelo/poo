package br.edu.ifpi.capar.poo.prova.bimestre2.recuperacao;

/**
 *
 * @author Denylson Melo
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;

    public String getCep() {
        return ""; //logica para pegar o cep do endereco
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    
    public String getNome(){
        return this.nome;
    }
    
    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    
}
