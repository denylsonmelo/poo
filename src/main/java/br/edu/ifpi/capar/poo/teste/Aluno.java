package br.edu.ifpi.capar.poo.teste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Aluno {
    private final String nome;
    private final String matricula;
    private final String curso;
    private final List<Double> notas;

    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
