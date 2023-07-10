package application;

/*Faça um programa para ler dois valores 
 * inteiros, e depois mostrar na tela a 
 * soma desses números com uma mensagem 
 * explicativa, conforme exemplos.
 * */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("Informe um número: ");
		a = sc.nextInt();
		System.out.print("Informe mais um número: ");
		b = sc.nextInt();

		System.out.println("SOMA = " + (a+b));

		
		
		sc.close();
		

	}

}
