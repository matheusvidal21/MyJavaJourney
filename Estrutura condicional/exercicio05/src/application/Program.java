package application;

/* Com base na tabela abaixo, escreva um programa
 * que leia o código de um item e a quantidade deste
 * item. A seguir, calcule e mostre o valor da conta a pagar.
*/

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do item: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = sc.nextInt();

		double preco = 0.0;
		
		if (codigo == 1) {
			preco = quantidade * 4.00;
		} else if (codigo == 2) {
			preco = quantidade * 4.50;
		} else if (codigo == 3) {
			preco = quantidade * 5.00;
		} else if (codigo == 4) {
			preco = quantidade * 2.00;
		} else if (codigo == 5) {
			preco = quantidade * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", preco);

		sc.close();

	}

}
