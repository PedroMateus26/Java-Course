package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItens;
import entities.Products;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client c = new Client(name, email, birthDate);
		
		
		System.out.println("Enter order status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, c);
		
		System.out.println("How many itens to this order: ");
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
			
			System.out.println("Enter #"+(i+1)+" item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextInt();
			System.out.println("Product quantity: ");
			Integer productQuantity = sc.nextInt();
			
			Products product = new Products(productName, productPrice);
			OrderItens orderItens=new OrderItens(productQuantity, productPrice, product);
			order.addItem(orderItens);
		}
		System.out.println(order);
		sc.close();

	}

}
