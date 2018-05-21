package br.edu.ifpi.capar.poo.teste;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class AlunoTest {
  
    @Test(expected = NullPointerException.class)
    public void deveLancarErroListaNaoInicializada(){
        Aluno aluno = new Aluno("Roberrt", "matricula massa", "curso foda");
        
        aluno.adicionarNota(0);
    }
    
    @Test
    public void deveAdicionarNota(){
        //cenario
        double nota = 10;
        Aluno aluno = new Aluno("Roberrt", "matricula massa", "curso foda");
        
        //acao
        Assert.assertEquals(0, aluno.getNotas().size());
        aluno.adicionarNota(nota);

        //verificacao
        Assert.assertEquals(1, aluno.getNotas().size());
        Assert.assertTrue(aluno.getNotas().contains(nota));
        
    }
}
