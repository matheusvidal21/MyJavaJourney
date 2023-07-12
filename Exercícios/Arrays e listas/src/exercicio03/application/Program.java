package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		People[] people = new People[n];
		
		for(int i = 0; i < people.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			people[i] = new People(nome, idade, altura);
			
		}
		
		int menores = 0;
		double sum = 0.0;
		for(int i = 0; i < people.length; i++) {
			sum += people[i].getHeight();
			if(people[i].getAge() < 16) {
				menores++;
			}
		}
		
		double avg = sum / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);
		
				 
		double percentualMenores = ((double) menores / n) * 100.0;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%n", percentualMenores);
		for(int i = 0; i < people.length; i++) {
			if(people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		
		sc.close();
	}

}
