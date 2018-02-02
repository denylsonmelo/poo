package br.edu.ifpi.capar.poo.oracle.academy;

/**
 *
 * @author Denylson Melo
 */
public class FluxoPrograma {

    public static void metodo2(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("iniciando o metodo 2");
        System.out.println("terminando o metodo 2");

        System.out.println("printando o args --> " + args[0] + " " + args[1]);

        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("iniciamos o programa");
        System.out.println("iniciamos o metodo main");

        String[] strings = new String[2];
        strings[0] = "string boa";
        strings[1] = "string ruim";

        metodo2(strings);

        System.out.println("terminando o programa");
    }

}
