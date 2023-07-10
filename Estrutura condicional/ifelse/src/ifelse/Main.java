package ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double horario;
		System.out.print("Digite o horário: ");
		horario = sc.nextDouble();

		if (horario < 12.00) {
			System.out.println("Bom dia!");
		} else if (horario >= 12.00 && horario < 18.00) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		sc.close();
	}

}
