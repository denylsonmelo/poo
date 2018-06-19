package br.edu.ifpi.capar.poo.assunto.oo.animal;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

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

        builder.append(StringUtils.leftPad("\n", 54, "="))
                .append(StringUtils.center("***"+this.nome+"***", 54))
                .append("\n")
                .append(StringUtils.leftPad("\n", 54, "="));

        this.animals.forEach((animal) -> {
            
            builder.append(StringUtils.leftPad(String.valueOf(this.animals.indexOf(animal)+1), 10))
                    .append(". ")
                    .append(StringUtils.leftPad(" " + animal.getNome(), 36, "-"))
                    .append("\n");
        });

        builder.append(StringUtils.leftPad("\n", 54, "="));

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
