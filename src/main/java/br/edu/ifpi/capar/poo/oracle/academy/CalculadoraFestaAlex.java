package br.edu.ifpi.capar.poo.oracle.academy;

//from <nomePacote~Biblioteca~classe~arquivo> import <algumacoisa>
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFestaAlex {

    private static final double VALOR_IMPOSTO = 0.05;
    private static final double VALOR_GORJETA = 0.15;

    
    
    @Override
    public String toString() {

        return "CalculadoraFestaAlex: ValorImposto(" + VALOR_IMPOSTO + "), ValorGorjeta("+ VALOR_GORJETA +")";
        
    }
    
    
    
    
    
    public double encontrarTotalAPagar(double valor) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        return encontrarTotalAPagar(valor, VALOR_IMPOSTO);
    }

    public double encontrarTotalAPagar(int valor) {
        return encontrarTotalAPagar(valor, VALOR_IMPOSTO);
    }

    public double encontrarTotalAPagar(int valor, double valorImposto) {
        return encontrarTotalAPagar(new Double(valor), valorImposto);
    }

    //  double encontrarTotalAPagar(double, double)
    protected double encontrarTotalAPagar(double valor, double valorImposto){
        return valor * (1 + valorImposto + VALOR_GORJETA);
    }
    
    public void tentarRetornarVoid(){
        System.out.println("entrei no void");
        return ; 
    }
}
