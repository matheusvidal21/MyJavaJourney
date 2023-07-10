package impressaodedados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30, code = 5290;
		char gender = 'F';

		double price1 = 2100.0, price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n");
		System.out.printf("%s, whice price is $%.2f%n", product1, price1);
		System.out.printf("%s, whice price is $%.2f%n%n", product2, price2);

		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);

		System.out.printf("Measue with eihjt decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}
