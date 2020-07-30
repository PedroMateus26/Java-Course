package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		List<Products> list = new ArrayList<>();
		
		Products p1 = new Products("TV", 1, 1290.99);
		Products p2 = new Products("Video Game Chair", 3, 350.50);
		Products p3 = new Products("IPhone X", 2, 900.00);
		Products p4 = new Products("Sansung Galaxy", 2, 850.00);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);*/
		
		String path="C:\\Users\\pedro\\Desktop\\out.txt";
		
		try(BufferedWriter bw= new BufferedWriter(new FileWriter(path, true))){
			for(Products product:list) {
				bw.newLine();
				bw.write(product.toString());
				bw.newLine();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
