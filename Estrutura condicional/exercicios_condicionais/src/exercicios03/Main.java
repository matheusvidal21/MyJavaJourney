package exercicios03;

/* Leia 2 valores inteiros (A e B). Após, o programa
 * deve mostrar uma mensagem "Sao Multiplos" ou
 * "Nao sao mMultiplos", indicando se os valores lidos
 * são múltiplos entre si. Atenção: os números devem poder
 * ser digitados em ordem crescente ou decrescente.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Digite dois números: ");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		} else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}

		sc.close();

	}

}
