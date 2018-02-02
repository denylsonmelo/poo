package br.edu.ifpi.capar.poo.oracle.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class Exception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        //System.out.println(scanner.nextInt());

        try {

            scanner.close();
            System.out.println(scanner.nextInt());
        
        } catch (InputMismatchException erro) {
            
            System.out.println("dignissimo usuario, informe o numero decente");
            //erro.printStackTrace();
            
        } catch (IllegalStateException erro){
            
            System.out.println("cara, o scanner esta fechado, voce esta fazendo algo errado");
        }

    }
}
