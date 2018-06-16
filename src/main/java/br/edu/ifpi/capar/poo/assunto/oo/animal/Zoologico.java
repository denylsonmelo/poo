package br.edu.ifpi.capar.poo.assunto.oo.animal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Zoologico {

    private String nome;
    private List<Animal> animals;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("-----------------------------------------------------\n")
                .append("          ***   ")
                .append(this.nome)
                .append("   ***          \n")
                .append("-----------------------------------------------------\n");

        
        builder.append("-----------------------------------------------------\n");

        return builder.toString();
    }

    public void transferir(int jaula) {
        System.out.println("tranferindo animal ... "
                + this.animals.get(jaula).getNome());
        this.animals.remove(jaula);
    }

    public void transferir(Animal animal) {
        System.out.println("tranferindo animal ... " + animal.getNome());
        this.animals.remove(animal);
    }

    public void darEntrada(Animal animal) {
        System.out.print("tentando adicionar um novo animal: " + animal.getNome());
        this.animals.add(animal);
        System.out.println("  ........ ok");
    }

    public Zoologico(String nome) {
        this.nome = nome;
        this.animals = new ArrayList<>();
    }

}
