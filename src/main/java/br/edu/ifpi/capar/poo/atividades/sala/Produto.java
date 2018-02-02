package br.edu.ifpi.capar.poo.atividades.sala;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Denylson Melo
 */
public class Produto {
    
    private BigDecimal preco;
    private String nome;
    private LocalDate dataValidade; // antigo
    private LocalDate dataQueFoiFeito; // novo
    private String marca; // Marca
    private TipoProduto tipo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public LocalDate getDataFabricacao() {
        return dataQueFoiFeito;
    }

    public String getMarca() {
        return marca;
    }

    public String getCodigoBarras() {
        return this.getNome() + this.getPreco()
                + this.getDataFabricacao() + this.getDataValidade()
                + "BR";
    }

    public TipoProduto getTipo() {
        return tipo;
    }
    
    public Produto(BigDecimal preco, String nome, LocalDate dataValidade, LocalDate dataFabricacao, String marca, TipoProduto tipo) {
        this.preco = preco;
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.dataQueFoiFeito = dataFabricacao;
        this.marca = marca;
        this.tipo = tipo;
    }
     
    
}
