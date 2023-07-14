package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		int[] C = new int[n];
		int sum = 0;
		for(int i = 0; i < C.length; i++) {
			sum = A[i] + B[i];
			C[i] = sum;
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}

		
		
		sc.close();
	}

}
