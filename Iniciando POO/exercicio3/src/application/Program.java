package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.print("ENTER STUDENT NAME: ");
		aluno.name = sc.nextLine();
		
		System.out.print("ENTER GRADE 1: ");
		aluno.grade1 = sc.nextDouble();	
		
		System.out.print("ENTER GRADE 2: ");
		aluno.grade2 = sc.nextDouble();	
		
		System.out.print("ENTER GRADE 3: ");
		aluno.grade3 = sc.nextDouble();	
		
		System.out.println("FINAL GRADE = " + aluno.finalGrade());
		
		if(aluno.missingPoints() == 0.0) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.missingPoints());
		}

		sc.close();
	}

}
