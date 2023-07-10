package exercicio06;

/* Fazer um programa que leia três valores
 * com ponto flutuante de dupla precisão: A, B e C.
 * Em seguida, calcule e mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float a, b, c, pi = 3.14159f;

		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		float areaTriangulo = (a * c) / 2;
		float areaCirculo = (pi * (float) Math.pow(c, 2.0));
		float areaTrapezio = ((a + b) * c) / 2;
		float areaQuadrado = (float) Math.pow(b, 2.0);
		float areaRetangulo = a * b;

		System.out.printf("TRIÂNGULO: %.3f%n", areaTriangulo);
		System.out.printf("CÍRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);

		sc.close();

	}

}
