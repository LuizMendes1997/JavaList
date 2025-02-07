package list.java;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {
	public static void main(String[] args) {
		//Criando a lista
		List<String> Marcas = new ArrayList<>();
		
		//adicionar itens na lista
		Marcas.add("Audi");
		Marcas.add("Chevrolet");
		Marcas.add("Mercedes");
		Marcas.add("Ferrari");
		
		//Consultando itens da lista
		System.out.println(Marcas);
		
		//imprimindo um item da lista 
		System.out.println(Marcas.get(1)); //imprimi o segundo item, a lista começa do 0
		
		//editar itens da lista
		Marcas.set(2, "Lamborguini");
		
		//imprimir a lista
		System.out.println(Marcas);
		
		//Removendo item da lista
		Marcas.remove(1);
		Marcas.remove("Chevrolet");
		
		//imprimindo
		System.out.println("-----");
		System.out.println(Marcas);
	}
}
