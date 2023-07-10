package application;

/* Leia a hora inicial e a hora final de um jogo.
 * A seguir calcule a duração do jogo, sabendo que
 * o mesmo pode começar em um dia e terminar em outro,
 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int inicio, fim;
		System.out.print("Digite o início e fim do jogo: ");
		inicio = sc.nextInt();
		fim = sc.nextInt();

		int duracao;

		if (inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = (24 - inicio) + fim;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}
