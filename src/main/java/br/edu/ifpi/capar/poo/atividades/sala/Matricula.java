package br.edu.ifpi.capar.poo.atividades.sala;

/**
 *
 * @author Denylson Melo
 */
public class Matricula {

    private final Aluno aluno;
    private final Ano ano;
    private Situacao situacao;

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Ano getAno() {
        return ano;
    }

    public Situacao getSituacao() {
        return situacao;
    }
    
    public Matricula(Aluno aluno, Ano ano, Situacao situacao) {
        this.aluno = aluno;
        this.ano = ano;
        this.situacao = situacao;
    }
    
}
