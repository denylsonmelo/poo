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
        if (null == this.sexo) {
            return "não especificado";
        } else {
            switch (this.sexo) { // this.null.FEMININO
                case FEMININO:
                    return "Feminino";
                case MASCULINO:
                    return "Masculino";
                default:
                    return "não especificado";
            }
        }
    }

    //setSexo(String)
    public void setSexo(String sexo) {
        // sexo == "feminino"
        // sexo.equals("feminino")
        
        //desafio1: comparar diversos valores, em um conjunto, com o sexo
        //desafio2: usando lambda 
        
        if (sexo.equalsIgnoreCase("feminino")) {
            this.sexo = Sexo.FEMININO;
        }
        else if (sexo.equalsIgnoreCase("masculino")) {
            this.sexo = Sexo.MASCULINO;
        }

    }

    //setSexo(Sexo)
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

    @Override
    public String toString() {
        // desafio3: 
        return "Proprietario[" + this.nome + "," + this.sexo + "," + this.endereco + "]";
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
