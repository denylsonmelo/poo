package br.edu.ifpi.capar.poo.atividades.sala;

/**
 *
 * @author Denylson Melo
 */
public class Professor extends Pessoa {

    //propriedades
    private String matricula;
    private String titulacao;
    private Curso curso;
    
    public Professor(String numeroDeMatricula) {
        this.matricula = numeroDeMatricula;
    }

    public Professor(String nome, String numeroDeMatricula) {
        this.matricula = numeroDeMatricula;
        this.setNome(nome);
    }
    
    
    
    //comportamentos
    public void darAula() {
        System.out.println("");
    }
    
    public void analisarSituacao(Aluno aluno) {
        if (aluno.getMedia() >= 7.0) {
            this.aprovar(aluno);
        } else {
            this.reprovar(aluno);
        }
    }
    
    private void imprimirSituacaoFinal(Aluno aluno, String situacao){
        System.out.println(this.getNome() + " declara que o aluno " + aluno.getNome()
                + ", de matricula " + aluno.getMatricula() + " estar " + situacao + ".");
    }
    
    private void reprovar(Aluno aluno) {
        this.imprimirSituacaoFinal(aluno, "reprovado");
    }
    
    private void aprovar(Aluno aluno) {
        this.imprimirSituacaoFinal(aluno, "aprovado");
    }
    
    /*
    lerSlides();
    prepararAula();
    corrigirAtividades();
    tirarOnda();
    
    fazerProva();
    corrigirProva();
    fazerChamada();
    retirarEsperanca();
     */
}
