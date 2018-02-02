package br.edu.ifpi.capar.poo.oracle.academy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Repeticao {

    public static void main(String[] args) {
        /*
        int contador = 1;
        do {
            System.out.println("arroz com pao");

            contador++;
        } while (contador < 5);
         */
 /*
        int contador = 0;
        while (contador > 5) {
            System.out.println("arroz com pao");
            contador++;
        }
         */

        // i++  -->  retorna e depois incrementa      (variavel + contador++)  ?
        // ++i  -->  incrementa e depois retorna      (variavel + ++contador)  ?
        /*
        for (int i = 0; i < 5; ++i) {
            System.out.println("arroz com pao > " + i);
        }
        
        
        
        
        for (;;) {}
        for (int contador =0;;) {}
        int contador =0;
        for(;;contador++){}
        for(;5>3;){}
         */
 /*
        for (int i = 0; i < 10; i++) {

            //operacoes
            // variaveis  -->   i
            for (int j = 0; j < 10; j++) {

                // variaveis  -->   j i
                for (int k = 0; k < 10; k++) {
                    // variaveis  -->   k j i

                }
            }

        }
        // variaveis  -->   nenhuma
         */
 /*
        for (int i = 0; i < 10; i++) {
            
            if(i > 7)
                break;
            
            System.out.println("imprimindo algo > " + i);
        }
        
        System.out.println("sai do laco");
         */
 /*
        for (int i = 0; i < 10; i++) {
            
            if(i % 2 == 0)
                continue;
            
            System.out.println("imprimindo algo > " + i);
        }
        
        System.out.println("sai do laco");
         */
 /*
        int variavel[] = new int[10];
        
        variavel[0] = 123;
        variavel[4] = 456;
        
        
        for (int i = 0; i < variavel.length; i++) {
            System.out.println(variavel[i]);            
        }
         */
        //diamond
        List<String> lista = new ArrayList();

        //lista.add(123);
        //lista.add(456);
        //lista.add(123.5);
        lista.add("tawan");
        lista.add("stefany");

        /*
        System.out.println(variavel.size());
        
        for (int i = 0; i < variavel.size(); i++) {
            System.out.println(variavel.get(i));
        }
         */
        
        //foreach
        for (String nome : lista) {
            System.out.println(nome); //variavel[i]
        }

        System.out.println(">>>>>>>>>>>>>>>>>>\n");

        //foreach funcional
        lista.forEach(nome -> {
            System.out.println(nome);
        });

    }
}
