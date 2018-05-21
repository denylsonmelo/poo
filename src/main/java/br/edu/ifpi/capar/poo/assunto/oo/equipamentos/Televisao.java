package br.edu.ifpi.capar.poo.noite.equipamentos;

/**
 *
 * @author Denylson Melo
 */
public class Televisao {

    //String marca = "CCE";
    Marca marca = Marca.LG;
    
    double dimensaoEmPolegadas = 32.0;
    
    //String cor = "Preta";
    
    Cor cor = Cor.PRETA;
    
    boolean eSmartTV = false;
    boolean slotPendrive = true;
    boolean slotVGA = true;
    boolean slotHDMI = true;
    boolean entradaRCA = true;
    //double pontenciaOperacaoMinimaVolts = 110;
    //double pontenciaOperacaoMaximaVolts = 220;
    
    Voltagem voltagemDaTelevisao = Voltagem.BIVOLT ;
    
    int canaisAbertos = 25;

    
}
