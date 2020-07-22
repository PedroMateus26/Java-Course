package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.enums.TipoPessoa;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		TipoPessoa tipoPessoa = null;
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Entre com a quantidade de pessoas a ser cadastrada: ");
		int numeroPessoa = sc.nextInt();
		for (int i = 1; i <= numeroPessoa; i++) {
			System.out.print("Entre com o tipo de pessoa (FISICA/JURIDICA): ");
			tipoPessoa = tipoPessoa.valueOf(sc.next());
			if (tipoPessoa == tipoPessoa.FISICA) {
				System.out.print("Entre com o nome da pessoa: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Entre com a renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("A pessoa teve gastos com saúde no último ano? (s/n) ");
				char confirmacao = sc.next().charAt(0);
				if (confirmacao == 's') {
					System.out.print("Quanto foram os gastos com saúde: $");
					double gastoSaude = sc.nextDouble();
					list.add( new PessoaFisica(nome, rendaAnual, confirmacao, gastoSaude));

				} else {
					list.add(new PessoaFisica(nome, rendaAnual, confirmacao));

				}
			} else {
				System.out.print("Entre com o nome da empresa: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Entre com a renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Entre com o número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios)) ;
			}
		}
		for (Pessoa pessoa : list)
			System.out.println(pessoa);
		sc.close();

	}

}
