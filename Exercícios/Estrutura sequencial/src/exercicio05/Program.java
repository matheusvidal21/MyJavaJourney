package exercicio05;

/* Fazer um programa para ler o código de uma
 * peça 1, o número de peças 1, o valor unitário
 * de cada peça 1, o código de uma peça 2, o número
 * de peças 2 e o valor unitário de cada peça 2.
 * Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, num1, num2;
		double valor1, valor2, total;
	
		codigo1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();


		total = (num1 * valor1) + (num2 * valor2);
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);


		sc.close();

	}

}
