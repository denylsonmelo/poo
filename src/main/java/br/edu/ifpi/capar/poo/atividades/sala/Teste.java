package br.edu.ifpi.capar.poo.atividades.sala;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Teste {

    public static void main(String[] args) {
        //Professor professor = new Professor("2015tinf0013");

        //professor.analisarSituacao(new Aluno("Tawan"));
        /* Produto produto = new Produto(new BigDecimal(45), "lagarto", LocalDate.now(), 
                LocalDate.now(), "FriBoi", TipoProduto.CARNE);
        
        produto.getCodigoBarras();
        produto.getDataFabricacao();*/
 /*
       Aluno aluno = new Aluno("Robert");
       
       List<Materia> materias = new ArrayList<>();
       
       Materia poo = new Materia("Poo"); 
       Materia bd = new Materia("BD"); 
       Materia matematica = new Materia("Matematica"); 
       Materia analise = new Materia("Analise"); 
       Materia quimica = new Materia("Quimica"); 
       
       materias.add(poo);
       materias.add(bd);
       materias.add(matematica);
       materias.add(analise);
       materias.add(quimica);
        
        
       Ano ano = new Ano();
       ano.setMaterias(materias);
       
       Matricula matricula = new Matricula(aluno, ano, Situacao.CURSANDO);
       
       aluno.fazProva(poo);
       aluno.fazProva(poo);
       aluno.fazProva(poo);
       
       aluno.fazProva(quimica);
       aluno.fazProva(quimica);
       aluno.fazProva(quimica);
       aluno.fazProva(quimica);
       aluno.fazProva(quimica);
       
       matricula.setSituacao(Situacao.RECUPERACAO);
       matricula.setSituacao(Situacao.EXAME_FINAL);
       matricula.setSituacao(Situacao.REPROVADO);
         */
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("021827473");
        pessoa.setIdade(20);
        pessoa.setNome("Luquita");
        pessoa.setRg("95784667");
        pessoa.setCivil(EstadoCivil.CASADO);
        
        System.out.println("infeliz -->  " + pessoa);
        

    }
}
