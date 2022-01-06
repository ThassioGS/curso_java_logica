package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.grade1 = sc.nextFloat();
		aluno.grade2 = sc.nextFloat();
		aluno.grade3 = sc.nextFloat();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());
		
		if (aluno.finalGrade()>60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.missingGrade());
		}
		
		sc.close();
	}

}
