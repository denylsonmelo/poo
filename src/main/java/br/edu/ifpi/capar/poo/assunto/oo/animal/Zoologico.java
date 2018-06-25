package br.edu.ifpi.capar.poo.assunto.oo.animal;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Classe que simboliza um conjunto de animais
 * 
 * 
 * @author Denylson Melo
 */
public class Zoologico {

    private String nome;
    private List<Animal> animals;

    /**Define uma representação textual do Zoologico como se fosse uma nota fiscal
     * 
     * @return String que representa a listagem do zoologico
     */
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

    /**Transfere um determinado animal do zoologico baseado no numero da jaula recebido
     * 
     * @param jaula Inteiro que representa o número da jaula do animal a ser transferido
     */
    public void transferir(int jaula) {
        System.out.println("tranferindo animal ... "
                + this.animals.get(jaula).getNome());
        this.animals.remove(jaula);
    }

    /**Transfere um determinado animal do zoologico baseado no animal passado para o método
     * 
     * @param animal Animal a ser transferido
     * @see Animal
     */
    public void transferir(Animal animal) {
        System.out.println("tranferindo animal ... " + animal.getNome());
        this.animals.remove(animal);
    }

    /**Metodo utiizado para dar entrada de um animal no zoologico
     * O animal recebido vai ser adicionado em uma lista interna
     * 
     * @param animal Animal a entrar no zoologico
     * @see List
     * @see Animal
     */
    public void darEntrada(Animal animal) {
        System.out.print("tentando adicionar um novo animal: " + animal.getNome());
        this.animals.add(animal);
        System.out.println("  ........ ok");
    }

    /**Metodo de criacao do zoologico atraves da atribuicao de um nome para ele.
     * Por baixo dos panos é criado uma Lista para armazenar os animais que 
     * pertecem a este zoologico
     * 
     * @param nome Nome a ser dado ao zoologico
     * @see List
     * @see Animal
     */
    public Zoologico(String nome) {
        this.nome = nome;
        this.animals = new ArrayList<>();
    }

}
