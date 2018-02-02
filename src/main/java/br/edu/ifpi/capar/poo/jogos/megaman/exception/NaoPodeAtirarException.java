package br.edu.ifpi.capar.poo.jogos.megaman.exception;

/**
 *
 * @author Denylson Melo
 */
public class NaoPodeAtirarException extends RuntimeException{

    public NaoPodeAtirarException(String message) {
        StringBuilder builder = new StringBuilder();

        builder.append("NaoPodeAtirarException: ")
                .append(message)
                .append("\n Causada por isto aqui: ")
                .append(getCause());
        
        System.out.println(builder.toString());
    }
}
