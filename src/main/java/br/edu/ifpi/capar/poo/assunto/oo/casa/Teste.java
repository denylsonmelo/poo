package br.edu.ifpi.capar.poo.assunto.oo.casa;

/**
 *
 * @author Denylson Melo
 */
public class Teste {
    public static void main(String[] args) {
        
        Porta porta = new Porta();
        
        
        //porta.aberta = false; // quer dizer que vai estar fechada
        //porta.fechar();
        
          
        Dono proprietario1 = new Dono("Vitoria");
        Dono proprietario2 = new Dono("Luzia", Sexo.FEMININO);
        Dono proprietario3 = new Dono("Davi", "");
        Dono proprietario4 = proprietario1;
        
        
        /*
        System.out.println(proprietario1.getNome() + " " + proprietario1.getSexo());
        System.out.println(proprietario2.getNome() + " " + proprietario2.getSexo());
        System.out.println(proprietario3.getNome() + " " + proprietario3.getSexo() + " " + proprietario3.getEndereco());
        
        */
          
        proprietario2.setSexo("texto qualquer");
        
        
        //System.out.println(proprietario1);
}
}
