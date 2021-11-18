package secao4;
import java.util.Locale;
import java.util.Scanner;

public class s4e5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numPeca1, numPeca2;
		double valPeca1, valPeca2, total;
		
		numPeca1 = sc.nextInt();
		valPeca1 = sc.nextDouble();
		
		numPeca2 = sc.nextInt();
		valPeca2 = sc.nextDouble();
		total = numPeca1 * valPeca1 + numPeca2 * valPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
	}

}