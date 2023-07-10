package application;

/* Uma operadora de telefonia cobra R$ 50.00 por
 * um plano básico que dá direito a 100 minutos de
 * telefone. Cada minuto que exceder a franquia de 100
 * minutos custa R$ 2.00. Fazer um programa para ler a
 * quantidade de minutos que uma pessoa consumiu, daí
 * mostrar o valor a ser pago. */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe quantos minutos você consumiu: ");
		int minutos = sc.nextInt();

		double valor = 50.0;
		int minutosExcedidos;
		if (minutos > 100) {
			minutosExcedidos = minutos - 100;
			valor += (minutosExcedidos*2.0);
		}

		
		System.out.printf("Valor a pagar: R$%.2f%n", valor);


		sc.close();

	}

}