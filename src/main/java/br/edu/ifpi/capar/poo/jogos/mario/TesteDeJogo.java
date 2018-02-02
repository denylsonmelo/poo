package br.edu.ifpi.capar.poo.jogos.mario;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Denylson Melo
 */
public class TesteDeJogo {

    public static void main(String[] args) {
        
        Habilidade habilidade1 = new Habilidade("correr mais rapido");
        Habilidade habilidade2 = new Habilidade("pular mais rapido");
        
        Set<Habilidade> habilidades = new HashSet<>();
        habilidades.add(habilidade1);
        habilidades.add(habilidade2);
        
        
        Personagem personagem = new Personagem("Mario", 1, false, true, 3, 1, 1, habilidades);
        
        System.out.println(personagem.getNome());
        System.out.println("-----------------------------------------------");
        
        /*for (Habilidade habilidade : habilidades) {
            System.out.println(habilidade.getNome());
        }*/
        
        Set<Habilidade> habilidadesNovas = personagem.getHabilidades();
        
        habilidadesNovas.add(new Habilidade("                florzinha"));
        habilidadesNovas.add(new Habilidade("                invencivel sem tempo"));
        
        habilidadesNovas.forEach(habilidade -> {  //  lambda expressions
            System.out.println(habilidade.getNome());
        });
        
    }
    
}
