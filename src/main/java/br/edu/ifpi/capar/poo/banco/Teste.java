package br.edu.ifpi.capar.poo.banco;

import br.edu.ifpi.capar.poo.banco.dao.AlunoDAO;
import br.edu.ifpi.capar.poo.banco.dao.CursoDAO;
import br.edu.ifpi.capar.poo.banco.dao.DAO;
import br.edu.ifpi.capar.poo.banco.model.Aluno;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Teste {

    public static void main(String[] args) {

        /*
        CursoDAO cursoDAO = new CursoDAO();
        cursoDAO.consultar();
         */
        AlunoDAO alunoDAO = new AlunoDAO();
        //  Aluno aluno = new Aluno(3, "", "", Short.parseShort("0"), ' ', null);

        List<Aluno> alunosPesquisados = alunoDAO.consultar("robert");

        alunosPesquisados.forEach(aluno -> {
            System.out.print(aluno.getMatricula() + "  ");
            System.out.println(aluno.getNome());
        });
        
        DAO dao = new CursoDAO();

        /*for (Aluno alunosPesquisado : alunosPesquisados) {
            System.out.println(alunosPesquisado.getNome());
        }*/
 /*alunoDAO.consultar();
        
        alunoDAO.cadastrar();
        
        alunoDAO.atualizarNome();
        
        alunoDAO.excluir(aluno);
        
        alunoDAO.consultar();
         */
    }

}
