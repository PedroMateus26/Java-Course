package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.*;
import model.services.*;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US)
		;
		System.out.print("Entre com o número do contrato: ");
		Integer numeroContrato = sc.nextInt();
		System.out.print("Entre com a data do contrato(dd/MM/yyyy): ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Entre com o valor do contrato: ");
		Double valorTotalContrato = sc.nextDouble();
		System.out.print("Entre com a quantidade de meses: ");
		Integer meses = sc.nextInt();
		
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorTotalContrato);
		ServicoPagamento servicoPagamento = new ServicoPagamento(new SevicoPagamanetoPaypal());
		servicoPagamento.pagamentoParcelamento(contrato, meses);
		System.out.println("Parcelas: ");
		for(Parcela parcela:contrato.getList())
			System.out.println(parcela);
		sc.close();
	}

}
