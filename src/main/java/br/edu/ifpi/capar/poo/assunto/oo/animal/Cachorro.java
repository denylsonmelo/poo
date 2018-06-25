package br.edu.ifpi.capar.poo.assunto.oo.animal;

import java.util.Objects;

/**Classe que define um animal que late
 *
 * @see Animal
 * @author Denylson Melo
 */
public class Cachorro implements Animal{

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        this.latir();
    }

    public void latirAgressivamente(){
        System.out.println(this.getNome() + " esta latindo agressivamente");
    }

    private void latir(){
        System.out.println(this.getNome() + " esta latindo");
    }
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cachorro other = (Cachorro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
   
    
}
