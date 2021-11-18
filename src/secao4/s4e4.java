package secao4;
import java.util.Locale;
import java.util.Scanner;

public class s4e4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int nFunc = sc.nextInt();
		double horast = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", nFunc, horast*valorPorHora);
		
		sc.close();
	}

}