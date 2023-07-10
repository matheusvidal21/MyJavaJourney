package exercicios02;

/* Fazer um programa para ler um número
 * inteiro e dizer se este número é par ou ímpar.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("NÚMERO PAR");
		} else {
			System.out.println("NÚMERO ÍMPAR");
		}

		sc.close();

	}

}
