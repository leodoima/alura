package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Usando lista
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add("Português");
        aulas.add("Inglês");
        aulas.add("Matemática");
        aulas.add("Espanhol");

        // Aplicando forma de laço de repetição
        aulas.forEach(aula -> System.out.println(aula));

        // Trabalhando com index, tamanho e método de remoção de informação
        aulas.remove(aulas.size() - 1);

        // Ordenação de lista
        System.out.println(aulas.toString());
        Collections.sort(aulas);
        System.out.println(aulas.toString());

        // Criando lista de Drinks
        Drink johnnieWalkerRedlLabel = new Drink("Johnnie Walker Red Label");
        Drink ballantines = new Drink("Ballantines", 800.0);
        Drink johnnieWalkerBlueLabel = new Drink("Johnnie Walker Blue Label");
        Drink jackDaniels = new Drink("Jack Daniels", 1000);

        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(johnnieWalkerRedlLabel);
        drinks.add(ballantines);
        drinks.add(johnnieWalkerBlueLabel);
        drinks.add(jackDaniels);

        // Aplicando uso de método próprio criado
        System.out.println(drinks.toString());
        Collections.sort(drinks);
        System.out.println(drinks.toString());

        // Ordenando de forma diferente da padrão
        drinks.sort(Comparator.comparing(Drink::getAmount));
        System.out.println(drinks);
    }
}
