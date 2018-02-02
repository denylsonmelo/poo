package br.edu.ifpi.capar.poo.oracle.academy;

import br.edu.ifpi.capar.poo.oracle.academy.exemplos.Aluno;
import java.util.Random;

/**
 *
 * @author Denylson Melo
 */                   //herdar
public class Randomico {
    
    
    
    
    public static void main(String[] args) {
        
        CalculadoraFestaAlex calculadoraFestaAlex = new CalculadoraFestaAlex();
        Aluno tawan = new Aluno();
        
        tawan.setNome("tawan");
        tawan.setCpf("123456789");
        tawan.setIdade(15);
        tawan.setMatricula("2016eponto");
        
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
        
        System.out.println(tawan);
        
        System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        
        
        
        
        
        /*
        Random randomico = new Random(20L);
        
        System.out.println("primeiro numero: " + randomico.nextInt(100));
        System.out.println("segundo numero: " + randomico.nextInt(100));
        System.out.println("terceiro numero: " + randomico.nextInt(100));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        randomico.setSeed(20L);
        System.out.println("primeiro numero: " + randomico.nextInt(100));
        System.out.println("segundo numero: " + randomico.nextInt(100));
        System.out.println("terceiro numero: " + randomico.nextInt(100));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        randomico.setSeed(48L);
        System.out.println("primeiro numero: " + randomico.nextInt(100));
        System.out.println("segundo numero: " + randomico.nextInt(100));
        System.out.println("terceiro numero: " + randomico.nextInt(100));
        */
    }
}
