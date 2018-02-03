package br.edu.ifpi.capar.poo.banco.dao;

import br.edu.ifpi.capar.poo.banco.model.Curso;
import br.edu.ifpi.capar.poo.banco.model.Aluno;
import br.edu.ifpi.capar.poo.banco.bd.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denylson Melo
 */
public class AlunoDAO {

    public void consultar() {
        try {
            Connection conexao = Banco.getConexao();
            String consulta = "select id, nome from aluno";
            PreparedStatement declaracao = conexao.prepareStatement(consulta);
            ResultSet retorno = declaracao.executeQuery();
            System.out.println("Dados de aluno");
            for (; retorno.next();) {
                System.out.println(retorno.getInt(1));
                System.out.println(retorno.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Deu erro, vocÊ errrrrow");
        }
    }

    public List<Aluno> consultar(String nome){
        List<Aluno> alunos = new ArrayList<>();
        try {
            int id;
            short idade;
            String matricula, nomePesquisado, sexo;
            Connection conexao = Banco.getConexao();

            String consulta = "select * from aluno where nome like ?";

            PreparedStatement declaracao = conexao.prepareStatement(consulta);
            declaracao.setString(1, "%" + nome + "%");

            ResultSet retorno = declaracao.executeQuery();

            for (; retorno.next();) {
                id = retorno.getInt(1);
                matricula = retorno.getString(2);
                nome = retorno.getString(3);
                idade = retorno.getShort(4);
                sexo = retorno.getString(5);
                alunos.add(new Aluno(id, matricula, nome, idade, sexo.charAt(0), new Curso()));
            }

        } catch (SQLException ex) {
            System.out.println("Erro na pesquisa");
        }

        return alunos;
    }
    
    public Aluno consultar(Aluno aluno) {
        Aluno alunoPesquisado = null;
        
        try {
            int id;
            short idade;
            String matricula, nome, sexo;
            Connection conexao = Banco.getConexao();

            String consulta = "select * from aluno where id = ?";

            PreparedStatement declaracao = conexao.prepareStatement(consulta);
            declaracao.setInt(1, aluno.getId());

            ResultSet retorno = declaracao.executeQuery();

            for (; retorno.next();) {
                id = retorno.getInt(1);
                matricula = retorno.getString(2);
                nome = retorno.getString(3);
                idade = retorno.getShort(4);
                sexo = retorno.getString(5);
                alunoPesquisado = new Aluno(id, matricula, nome, idade, sexo.charAt(0), new Curso());

            }

        } catch (SQLException ex) {
            System.out.println("Erro na pesquisa");
        }

        return alunoPesquisado;
    }

    public void cadastrar() {

        try {
            String comando = "insert into aluno(matricula, nome, idade, sexo, curso_id) values(?, ?, ?, ?, ?)";
            Connection conexao = Banco.getConexao();

            PreparedStatement declaracao = conexao.prepareStatement(comando);

            declaracao.setString(1, "20161TIINF0001");
            declaracao.setString(2, "Luquinha Nunes");
            declaracao.setInt(3, 17);
            declaracao.setString(4, "X");
            declaracao.setInt(5, 3);

            declaracao.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizarNome() {
        try {
            Connection conexao = Banco.getConexao();

            String comando = "update aluno set nome=? where id=?";

            PreparedStatement declaracao = conexao.prepareStatement(comando);
            declaracao.setString(1, "Isabele");
            declaracao.setInt(2, 1);

            declaracao.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(Aluno aluno) {
        //TODO colocar uma logica
        this.excluir(aluno.getId());
        this.excluir(aluno.getMatricula());
    }

    private void excluir(int id) {
        try {
            Connection conexao = Banco.getConexao();

            String comando = "delete from aluno where id = ?";

            PreparedStatement declaracao = conexao.prepareStatement(comando);
            declaracao.setInt(1, id);

            declaracao.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void excluir(String matricula) {
        try {
            Connection conexao = Banco.getConexao();

            String comando = "delete from aluno where matricula = ?";

            PreparedStatement declaracao = conexao.prepareStatement(comando);
            declaracao.setString(1, matricula);

            declaracao.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
