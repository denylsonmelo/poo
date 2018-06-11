package br.edu.ifpi.capar.poo.assunto.oo.casa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Dono {

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
        
        List<String> lista = Arrays.asList("f", "feminino", "mulher");
        /*
        for (String elemento : lista) {
            if(elemento.equalsIgnoreCase(sexo))
                this.sexo = Sexo.FEMININO;
        }
        
        //  coisa.funcao(variavel -> {});
        //  coisa.funcao((variavel1, variavel2, ...) -> {});
        lista.forEach(elemento -> {
            if(elemento.equalsIgnoreCase(sexo))
                this.sexo = Sexo.FEMININO;
        });
       */
        
        
        if (lista.contains(sexo.toLowerCase())) {
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
        if(this.endereco == null || this.endereco.isEmpty()){
            return "Endereço não especificado";
        }
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
        return  this.getClass().getSimpleName() + "[" 
                + this.getNome() + ", " 
                + this.getSexo() + ", " 
                + this.getEndereco() + "]";
    }
 

    // Propietario(String)
    public Dono(String nome) {
        this.nome = nome;
        this.endereco = "parnaiba";
    }

    // Propietario(String, String)
    public Dono(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Propietario(String, Sexo)
    public Dono(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
}
