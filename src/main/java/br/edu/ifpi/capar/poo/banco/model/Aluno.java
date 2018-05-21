package br.edu.ifpi.capar.poo.banco.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Denylson Melo
 */
public class Aluno implements Serializable{
    //pojo =|= dto
    private final int id;
    private final String matricula;
    private String nome;
    private short idade;
    private char sexo;
    private final Curso curso;

    /** Construtor padrão para criação de aluno
     *
     * @param id Id registrada no banco
     * @param matricula Matricula única do aluno dada pelo Controle Acadêmico, seguindo um padrão de ANO PERIODO CURSO ZERO ZERO NUMERO_MATRICULA
     * @param nome
     * @param idade
     * @param sexo
     * @param curso
     */
    public Aluno(int id, String matricula, String nome, short idade, char sexo, Curso curso) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public short getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.matricula);
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
        final Aluno other = (Aluno) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
}
