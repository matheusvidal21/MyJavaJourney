package application;

/* Fazer um programa que leia o número de um
 * funcionário, seu número de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário
 * desse funcionário. A seguir, mostre o número e o
 * salário do funcionário, com duas casas decimais.
 * */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, horas;
		double valor;
		number = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();

		double salario = horas * valor;
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
