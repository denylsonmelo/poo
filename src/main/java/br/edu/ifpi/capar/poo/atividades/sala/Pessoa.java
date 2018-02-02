package br.edu.ifpi.capar.poo.atividades.sala;

/**
 *
 * @author Denylson Melo
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private EstadoCivil civil;
    private Sexo sexo;

    public EstadoCivil getCivil() {
        return civil;
    }

    public void setCivil(EstadoCivil civil) {
        this.civil = civil;
    }

    @Override
    public String toString() {
        return "Pessoa: Nome("+ nome +"), cpf(" + cpf +"), idade(" + idade 
                +"), \nEstado Civil Enum(" + civil + ")"
                +"), \nEstado Civil Nome Bunitim(" + civil.getNome() + ")"
                +"), \nEstado Civil valor(" + civil.getNumero() + ")";
    }    
    
    public String getRg(){
        return this.rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
