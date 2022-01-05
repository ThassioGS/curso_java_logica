package secao4;
import java.util.Locale;
import java.util.Scanner;

public class s4e3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		System.out.printf("DIFERENCA = %d%n", (A * B - C * D));
		
		sc.close();
	}

}