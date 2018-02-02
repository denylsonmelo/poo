package br.edu.ifpi.capar.poo.prova.bimestre1.escrita;

import java.util.Scanner;

/**Questão retirada do site AprovaConcursos
 * do concurso FCC - 2015 - TRT - 9ª REGIÃO (PR) - Técnico Judiciário - Tecnologia da Informação 
 * (com modificações)
 * @see <a href="https://www.aprovaconcursos.com.br/questoes-de-concurso/questao/439640">Link da questão no AprovaConcursos</a>
 */
public class Questao02 {
    public static void main(String[] args) {
        int n, c, i;
        n = new Scanner(System.in).nextInt();
        c = 0;
        i = 2;
        while( i <= (n-1)){
            if((n % i) == 0){
                c++;
            }
            i++;
        }
        if(c == 0){
            System.out.println(" atende.");
        }else{
            System.out.println(c + " não atende.");
        }
    }
}
