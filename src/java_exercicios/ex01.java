package java_exercicios;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
