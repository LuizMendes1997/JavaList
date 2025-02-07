package list.java;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
	public static void main(String[] args) {
		//Criando a lista
		List<String> tarefas = new ArrayList<>();
		
		//adicionar itens na lista
		tarefas.add("Gravar aula");
		tarefas.add("Lavar o carro");
		tarefas.add("Estudar");
		
		//Consultando itens da lista
		System.out.println(tarefas);
		
		//imprimindo um item da lista 
		System.out.println(tarefas.get(1)); //imprimi o segundo item, a lista começa do 0
		
		//editar itens da lista
		tarefas.set(2, "Estudar Java");
		
		//imprimir a lista
		System.out.println(tarefas);
		
		//Removendo item da lista
		tarefas.remove(1);
		tarefas.remove("Gravar aula");
		
		//imprimindo
		System.out.println("-----");
		System.out.println(tarefas);
	}
}
