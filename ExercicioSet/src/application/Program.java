package application;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("Entre com o número de estudantes para o grupo A: ");
		int cursoA = sc.nextInt();
		for(int i=0;i<cursoA;i++) {
			System.out.println("Entre com a matricula do aluno #"+(i+1)+" ");
			int number = sc.nextInt();
			a.add(number);
		}
		System.out.print("Entre com o número de estudantes para o grupo B: ");
		int cursoB = sc.nextInt();
		for(int i=0;i<cursoB;i++) {
			System.out.print("Entre com a matricula do aluno #"+(i+1)+" ");
			int number = sc.nextInt();
			b.add(number);
		}
		System.out.print("Entre com o número de estudantes para o grupo C: ");
		int cursoC = sc.nextInt();
		for(int i=0;i<cursoC;i++) {
			System.out.println("Entre com a matricula do aluno #"+(i+1)+" ");
			int number = sc.nextInt();
			c.add(number);
		}
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		System.out.print("A quantidade de alunos nos cursos são: "+total.size());
		sc.close();
	}

}
