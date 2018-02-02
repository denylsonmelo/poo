package br.edu.ifpi.capar.poo.jogos.clash.royale;

/**
 *
 * @author Denylson Melo
 */
public enum Raridade {

    COMUM(1, "cinza", 5),
    RARA(2, "laranja", 10),
    EPICA(3, "roxo", 15),
    LENDARIA(4, "rainbow", 30);
    
    private final int numero;
    private final String cor;
    private final int multiplicador;

    public int getNumero() {
        return numero;
    }

    public String getCor() {
        return cor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }
    
    Raridade(int numero, String cor, int multiplicador){
        this.numero = numero;
        this.cor = cor;
        this.multiplicador = multiplicador;
    }
}
