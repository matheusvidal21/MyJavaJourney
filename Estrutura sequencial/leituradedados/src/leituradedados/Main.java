package leituradedados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.print("Escreva seu nome: ");
		x = sc.next();
		System.out.printf("Seu nome é: %s%n", x);
		
		int y;
		System.out.print("Escreva um número: ");
		y = sc.nextInt();		
		System.out.printf("Seu número é: %d%n", y);
		
		double z;
		System.out.print("Escreva um número double: ");
		z = sc.nextDouble();		
		System.out.printf("Seu número é: %.2f%n", z);

		char i;
		System.out.print("Escreva uma letra: ");
		i = sc.next().charAt(0);
		System.out.printf("Sua letra é: %c%n", i);

		sc.close();

	}

}
