package list.java;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTimes {
	public static void main(String[] args) {
		List<String> listaTimes = new ArrayList<>();
		listaTimes.add("São Paulo");
		listaTimes.add("Santos");
		listaTimes.add("Palmeiras");
		listaTimes.add("Flamengo");
		listaTimes.add("Fluminense");
		
		//imprimindo times
		System.out.println(listaTimes);
		
		//imprimindo time na posição 1
		System.out.println("-----");
		System.out.println(listaTimes.get(1));
		
		//Alterando time da posição 2
		System.out.println("-----");
		System.out.println(listaTimes.get(2));
		listaTimes.set(2, "Botafogo");
		System.out.println("foi para -- " + listaTimes.get(2));
		
		//removendo time posição 2 e depois o fluminense
		listaTimes.remove(2);
		listaTimes.remove("fluminense");
		
		//imprimindo
		System.out.println("-----");
		System.out.println(listaTimes);
		
	}

}
