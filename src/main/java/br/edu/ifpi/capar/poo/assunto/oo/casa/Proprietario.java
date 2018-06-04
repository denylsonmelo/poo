package br.edu.ifpi.capar.poo.assunto.oo.casa;

/**
 *
 * @author Denylson Melo
 */
public class Proprietario {
    
    private String nome;
    private Sexo sexo;
    private String endereco;

    public String getSexo() {
        if(this.sexo == Sexo.FEMININO)
            return "F";
        return "M";
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
   
    public void imprimirNome(){
        System.out.println("meu nome é: " + this.nome);
    }
    
    // Propietario(String)
     public Proprietario(String nome) {
        this.nome = nome;
        this.endereco = "parnaiba";
    }
    
    // Propietario(String, String)
    public Proprietario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Propietario(String, Sexo)
    public Proprietario(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
}
