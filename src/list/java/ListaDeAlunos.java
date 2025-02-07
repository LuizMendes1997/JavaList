package list.java;

import java.util.ArrayList;
import java.util.List;

public class ListaDeAlunos {
	public static void main(String[] args) {
		List<Double> Aluno1 = new ArrayList<>();
		List<Double> Aluno2 = new ArrayList<>();
		List<Double> Aluno3 = new ArrayList<>();
		
		Aluno1.add(5.0); Aluno1.add(9.0); Aluno1.add(3.5);
		Aluno2.add(6.0); Aluno2.add(6.5); Aluno2.add(3.0);
		Aluno3.add(7.0); Aluno3.add(5.5); Aluno3.add(8.0);
		
		boolean passou = false;
		
		double totalAluno1 =0, totalAluno2=0, totalAluno3 =0;
		double mediaAluno1 =0, mediaAluno2=0, mediaAluno3 =0;	
		
		for (double numero : Aluno1) {
			totalAluno1 += numero;
			mediaAluno1 = totalAluno1/3;
		}
		for (double numero : Aluno2) {
			totalAluno2 += numero;
			mediaAluno2 = totalAluno2/3;
		}
		for (double numero : Aluno3) {
			totalAluno3 += numero;
			mediaAluno3 = totalAluno3/3;
		}
		System.out.println("Aluno 1");
		System.out.println("Suas notas: "+ Aluno1);
		System.out.println("Total de suas notas: "+ totalAluno1);
		System.out.println("Sua media: "+ String.format("%.1f", mediaAluno1));
		if(mediaAluno1 > 6) {
			passou=true;
			System.out.println("o aluno passou? " + passou);
		}
		else {
			System.out.println("o aluno passou? " + passou);
		}
		System.out.println("Aluno 2");
		System.out.println("Suas notas: "+ Aluno2);
		System.out.println("Total de suas notas: "+ totalAluno2);
		System.out.println("Sua media: "+ String.format("%.1f", mediaAluno2));
		if(mediaAluno2 > 6) {
			passou=true;
			System.out.println("o aluno passou? " + passou);
		}
		else {
			System.out.println("o aluno passou? " + passou);
		}
		
		System.out.println("Aluno 3");
		System.out.println("Suas notas: "+ Aluno3);
		System.out.println("Total de suas notas: "+ totalAluno3);
		System.out.println("Aluno 1 e o total de suas notas: "+ totalAluno3);
		System.out.println("Sua media: "+ String.format("%.1f", mediaAluno3));
		if(mediaAluno3 > 6) {
			passou=true;
			System.out.println("o aluno passou? " + passou);
		}
		else {
			System.out.println("o aluno passou? " + passou);
		}
	}
}
