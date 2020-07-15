package program;

import java.util.Scanner;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Aluno[] vect = new Aluno[10];

		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Inform the name: ");
			String name = sc.nextLine();
			System.out.println("Inform email: ");
			String email = sc.nextLine();
			System.out.println("inform the number of the room: ");
			int j = sc.nextInt();
			vect[j] = new Aluno(name, email);

		}
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null)
				System.out.println("Room: "+i+", Data: "+vect[i]);
		}
		sc.close();
	}

}
