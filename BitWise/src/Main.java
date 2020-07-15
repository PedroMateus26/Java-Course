import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int testBit=32;//0b00100000
		if((n & testBit) !=0){
			System.out.println("6 bit é verdadeiro");
		}
		else {
			System.out.println("6 bit é falso");
		}
		sc.close();
	}

}
