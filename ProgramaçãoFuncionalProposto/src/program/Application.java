package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\pedro\\Desktop\\in.txt";
		
		
	    System.out.print("Entre com o n�vel de sal�rio m�nimo as ser filtrado: ");
	    double salario = sc.nextDouble();
	    System.out.print("Informa a letra para procurar: ");
	    char letra = sc.next().charAt(0);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Funcionario> list = new ArrayList<>();
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line=br.readLine();
			}
			List<String>listName=list.stream()
					.filter(p->p.getSalario()>salario)
					.map(p->p.getEmail())
					.sorted((s1,s2)->s1.toUpperCase().compareTo(s2))
					.collect(Collectors.toList());
			
			Double somaSalario=list.stream()
					.filter(p->p.getNome().charAt(0)=='M')
					.map(p->p.getSalario())
					.reduce((double) 0, (x,y)->x+y);
			
			Double mediaSalario=list.stream()
					.filter(p->p.getSalario()<2500)
					.mapToDouble(p->p.getSalario()).average().getAsDouble();
			
			boolean todosAcimaSalario=list.stream().allMatch(p->p.getSalario()>salario);
			
			
			long quantidadeElementos=list.stream().filter(p->p.getSalario()>salario).count();
			boolean letraInformada=list.stream().anyMatch(p->p.getNome().charAt(0)==letra);
			Optional<Funcionario> nome=list.stream().filter(p->p.getSalario()<salario).findFirst();	
			
			Optional<Funcionario> primeiroNome=list.stream().findAny();
			if(primeiroNome.isPresent())
				System.out.println("Primeiro nome da lista: "+primeiroNome.get().getNome());
			System.out.println();
			
			System.out.println("Pessoas com sal�rio acima de "+salario+":");
			listName.forEach(System.out::println);
			System.out.println();
			System.out.println("Soma dos salarios dos funcion�rios cujo a letra inicial seja 'M': "+somaSalario);
			System.out.println("A quantidade dos funcion�rios cujo a letra inicial seja 'M' e � maior que o sal�rio informado: "+quantidadeElementos);
			System.out.println("M�dia dos sal�rios menores que 2500 �: "+mediaSalario);
			System.out.println("Todos ganham acima do sal�rio informado? "+(todosAcimaSalario==true?"Sim":"N�o"));
			System.out.println("Algu�m na lista come�a com a letra informada? "+(letraInformada==true?"Sim":"N�o"));
			System.out.println("O primeiro da lista que ganha menor que o sal�rio informado �: "+nome.get().getNome());
			

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
