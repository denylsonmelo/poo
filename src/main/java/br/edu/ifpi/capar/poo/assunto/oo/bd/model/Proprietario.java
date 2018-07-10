package br.edu.ifpi.capar.poo.assunto.oo.bd.model;

/**
 *
 * @author Denylson Melo
 */
public class Proprietario {
    
    private int id;
    private String nome;

    @Override
    public String toString() {
        return "Proprietario{" + "id=" + id + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final Proprietario other = (Proprietario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Proprietario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Proprietario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
