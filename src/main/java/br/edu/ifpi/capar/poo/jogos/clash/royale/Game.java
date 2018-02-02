package br.edu.ifpi.capar.poo.jogos.clash.royale;

import java.util.Arrays;

/**
 *
 * @author Denylson Melo
 */
public class Game {

    public static void main(String[] args) {
            
        Construcao cabanaDeGoblins = new Construcao(150, 2, 3, 5, Raridade.RARA, 1, "Cabana de Goblins", 
                "Cabana que gera goblins chatos", 1, Arrays.asList(Alvo.TERRESTRE, Alvo.AEREO, Alvo.CONSTRUCAO));


        imprimirInformacoesConstrucoes(cabanaDeGoblins);
        
        System.out.println(">>>>  Carta upou um nivel!!!");
        cabanaDeGoblins.setNivel(2);
        
        imprimirInformacoesConstrucoes(cabanaDeGoblins);
        
    }
    
    public static void imprimirInformacoesConstrucoes(Construcao construcao){
        System.out.println("########################");
        System.out.println(construcao.getNome() + ":");
        System.out.println("Vida:  " + construcao.getVida());
        System.out.println("QuantidadeTropas:  " + construcao.getQuantidadeTropas());
        System.out.println("Raridade:  " + construcao.getRaridade());
        System.out.println("VelocidadeDeGeracao:  " + construcao.getVelocidadeDeGeracao() + " segs");
        System.out.println("Elixir:  " + construcao.getElixir());
        System.out.println("########################");
    }

}
