package br.edu.ifpi.capar.poo.atividades.sala;

/**
 *
 * @author Denylson Melo
 */
public class Aluno extends Pessoa{

    private String matricula;
    private Curso curso;
    
    public Double getMedia(){
        return 7.;
    }
    
    public Aluno(String nome) {
        this.setNome(nome);
    }  
    
    @Override
    public String toString() {
        return "Aluno: Matricula(" + this.getMatricula() + "), Nome("+ this.getNome() +" ),cpf(" + this.getCpf() +") ,idade(" + this.getIdade() +")";
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
    
    /*
    //propriedades
    escolaOrigem;
    
    //comportamentos
    estudar();
    dormir();
    comer();
    conversar();
    pesquisar();
    chorar();
    desistir();
    persistir();
    */

    public void fazProva(Materia materia) {
        System.out.println("fazendo a prova: " + materia.getNome());
    }
}
