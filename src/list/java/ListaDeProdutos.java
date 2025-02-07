package list.java;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {
	public static void main(String[] args) {
		List<String> Produtos = new ArrayList<>();
		
		Produtos.add("Leite");
		Produtos.add("Agua");
		Produtos.add("Suco");
		Produtos.add("Refrigerante");
		Produtos.add("Cha");
		
		//imprimindo
		System.out.println(Produtos);
		
		//imprimindo produto na posição 2
		System.out.println(Produtos.get(2));
		
		//Alterando produto na posição 1
		System.out.println("---------");
		System.out.println(Produtos.get(2));
		Produtos.set(2, "Suco de Laranja");
		System.out.println("foi para - " + Produtos.get(2) );
		
		
		//removendo produto na posição 1 e Cha
		Produtos.remove(1);
		Produtos.remove("Cha");
		System.out.println("---------");
		System.out.println(Produtos);
		
	}
}
