package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle a = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		a.width = sc.nextDouble();
		a.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", a.area());
		System.out.printf("PERIMETER = %.2f%n", a.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", a.diagonal());

		
		sc.close();
	}

}