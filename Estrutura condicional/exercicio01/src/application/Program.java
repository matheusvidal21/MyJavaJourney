package application;


/* Fazer um programa para ler um número inteiro, e
 * depois dizer se este número é negativo ou não.
 * */


import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("NÚMERO NEGATIVO");
		} else {
			System.out.println("NÚMERO NÃO NEGATIVO");
		}

		sc.close();
	}

}
