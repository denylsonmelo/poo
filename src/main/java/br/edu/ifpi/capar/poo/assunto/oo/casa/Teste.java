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
        
          
        Proprietario proprietario1 = new Proprietario("Vitoria");
        Proprietario proprietario2 = new Proprietario("Luzia", Sexo.FEMININO);
        Proprietario proprietario3 = new Proprietario("Davi", "na brenha");
        Proprietario proprietario4 = proprietario1;
        
        
        /*
        System.out.println(proprietario1.getNome() + " " + proprietario1.getSexo());
        System.out.println(proprietario2.getNome() + " " + proprietario2.getSexo());
        System.out.println(proprietario3.getNome() + " " + proprietario3.getSexo() + " " + proprietario3.getEndereco());
        
        */
                
        System.out.println(proprietario1);
        System.out.println(proprietario2);
        System.out.println(proprietario3);
        System.out.println(proprietario4);
}
}
