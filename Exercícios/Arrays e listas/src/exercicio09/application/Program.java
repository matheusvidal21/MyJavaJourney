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
		
		
		People[] peoples = new People[n];
		
		for(int i = 0; i < peoples.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			peoples[i] = new People(nome, idade);
		}
		
		int maisVelha = 0;
		for(int i = 0; i < peoples.length - 1; i++) {
			if(peoples[i].getAge() > peoples[i+1].getAge()) {
				maisVelha = i;
			}
		}
		
		
		System.out.println("PESSOA MAIS VELHA: " + peoples[maisVelha].getName());
		
	
		
		
		sc.close();
	}

}
