package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		
		
		double maior = 0.0;
		int pos = 0;
		for(int i = 0; i < vect.length - 1; i++) {
			if(vect[i] < vect[i+1]) {
				maior = vect[i + 1];
				pos = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.println("POSICÃO DO MAIOR VALOR = " + (pos+1));
		
		
		sc.close();
	}

}
