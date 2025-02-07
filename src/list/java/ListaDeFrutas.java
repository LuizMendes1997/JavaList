package list.java;

import java.util.ArrayList;
import java.util.List;

public class ListaDeFrutas {
    public static void main(String[] args) {
        // Lista de Frutas
        List<String> Frutas = new ArrayList<>();
        Frutas.add("Maçã");
        Frutas.add("Banana");
        Frutas.add("Laranja");
        Frutas.add("Uva");
        Frutas.add("Melancia");

        // Imprimindo a lista de frutas
        System.out.println("Lista de Frutas: " + Frutas);

        // Imprimindo o produto na posição 3
        System.out.println(Frutas.get(3));

        // Alterando fruta na posição 1
        Frutas.set(1, "Pera");
        System.out.println("Fruta alterada para: " + Frutas.get(1));

        // Removendo fruta Laranja
        Frutas.remove("Laranja");

        // Imprimindo a lista 
        System.out.println("Lista de Frutas após remoção: " + Frutas);
    }
}
