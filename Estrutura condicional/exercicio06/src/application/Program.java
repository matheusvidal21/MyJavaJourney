package application;

/* Você deve fazer um programa que leia um valor
 * qualquer e apresente uma mensagem dizendo em qual dos
 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
 * este valor se encontra. Obviamente se o valor não estiver em
 * nenhum destes intervalos, deverá ser impressa a mensagem
 * “Fora de intervalo”.
*/

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num = sc.nextDouble();

		if (num >= 0.0 && num <= 25.0) {
			System.out.println("Intervalo: [0,25]");
		} else if (num > 25.0 && num <= 50.0) {
			System.out.println("Intervalo: (25,50]");
		} else if (num > 50.0 && num <= 75.0) {
			System.out.println("Intervalo: (50,75]");
		} else if (num > 75.0 && num <= 100.0) {
			System.out.println("Intervalo: (75,100]");
		} else {
			System.out.println("Fora do intervalo.");
		}

		sc.close();

	}

}
