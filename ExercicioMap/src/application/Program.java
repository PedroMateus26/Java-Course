package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Users\\pedro\\Desktop\\in.txt";
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votos = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(",");
				String nome = campos[0];
				int numeroVotos = Integer.parseInt(campos[1]);
				if (votos.containsKey(nome)) {
					int votosSoma = votos.get(nome);
					votos.put(nome, numeroVotos+votosSoma);
				} else {
					votos.put(nome, numeroVotos);
				}
				line = br.readLine();

			}

			for (String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
