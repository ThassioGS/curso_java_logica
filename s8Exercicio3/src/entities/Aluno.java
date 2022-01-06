package entities;

public class Aluno {

	public String name;
	public float grade1;
	public float grade2;
	public float grade3;

	public float finalGrade() {
		return (float) (grade1 + grade2 + grade3);
	}

	public float missingGrade() {
		return (float) 60 - finalGrade();
	}
}
