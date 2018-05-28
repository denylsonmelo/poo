package br.edu.ifpi.capar.poo.assunto.oo.casa;

/**
 *
 * @author Denylson Melo
 */
public class Porta {

    // public, protected, private, 
    private String material;
    private String dono;
    private boolean aberta = true;
    private boolean trancado = false;

    void destrancar() {
        if (this.estiverTrancado()) {
            this.trancado = false;
            System.out.println("destrancado com sucesso");
        } else {
            System.out.println("nao esta trancado");
        }
    }

    private void trancar() {
        if (this.estiverFechada() && this.estiverDestrancado()) {
                System.out.println("trancado com sucesso");
        } else {
            System.out.println("a porta nao esta fechada");
        }
    }

    void abrir() {
        if (this.estiverFechada()) {
            this.aberta = true;
            System.out.println("abrindo a porta, weiiunh");
            System.out.println("porta foi aberta com sucesso");
        } else {
            System.out.println("a porta ja esta aberta");
        }
    }

    void fechar() {
        if (this.estiverAberta()) {
            this.aberta = false;
            System.out.println("fechando a porta");
            System.out.println("porta foi fechada com sucesso");
        } else {
            System.out.println("porta ja fechada");
        }
    }

    private boolean estiverAberta() {
        return aberta;
    }

    private boolean estiverFechada() {
        return !this.estiverAberta();
    }

    boolean estiverTrancado() {
        return trancado;
    }

    boolean estiverDestrancado() {
        return !this.estiverTrancado();
    }
}
