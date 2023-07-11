package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] pessoas = new People[n];
		
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			pessoas[i] = new People(altura, genero);
		}
		
		
		double menor = pessoas[0].getHeight();
		double maior = pessoas[0].getHeight();
		int mans = 0, womens = 0;
		double sumWomens = 0.0;
		
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getHeight() > maior) {
				maior = pessoas[i].getHeight();
				
			}else if(pessoas[i].getHeight() < menor) {
				menor = pessoas[i].getHeight();
			}
			
			if(pessoas[i].getGender() == 'F') {
				sumWomens += pessoas[i].getHeight();
				womens++;
			}

			if(pessoas[i].getGender() == 'M') {
				mans++;
			}
		}
		
		double avgWomens = sumWomens / womens;
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Média das alturas das mulhres = %.2f%n", avgWomens);
		System.out.printf("Múmero de homens = %d%n", mans);

		
		sc.close();
	}

}
