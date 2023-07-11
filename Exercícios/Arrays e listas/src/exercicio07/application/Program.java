package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		

		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.println();
		System.out.printf("MÉDIA DO VETOR = %.3f%n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
