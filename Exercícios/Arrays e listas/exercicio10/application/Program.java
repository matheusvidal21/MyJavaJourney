package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Student;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Student[] alunos = new Student[n];
		
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();

			alunos[i] = new Student(nome, nota1, nota2);
		}
		
		
		
		System.out.println("Alunos aprovados: ");

		for(int i = 0; i < alunos.length; i++) {
			double media = (alunos[i].getGrade1() + alunos[i].getGrade2()) / 2.0;
			if(media >= 6.0) {
				System.out.println(alunos[i].getName());
			}
		}
		
		
		
		sc.close();
	}

}
