package br.edu.ifpi.capar.poo.atividades.sala;

/**
 *
 * @author Denylson Melo
 */
public enum EstadoCivil {
    
    SOLTEIRO(1, "Solteiro"),
    CASADO(2, "teje lascado"),
    VIUVO(3, "Viúvo"),
    DIVORCIADO(4, "Divorciado"),
    UNIAO_ESTAVEL(5, "União Estável");

    private final int numero;
    private final String nome;
    
    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }
    
    public static EstadoCivil getCASADO() {
        return CASADO;
    }
    
    EstadoCivil(int numero, String nome){
        this.nome = nome;
        this.numero = numero;
    }
}
