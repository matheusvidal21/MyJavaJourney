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

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("VALORES = ");
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			sum += vect[i];
		}
		
		System.out.println();
		System.out.println();

		double avg = sum / n;
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MÉDIA = %.2f%n", avg);

		sc.close();
	}

}
