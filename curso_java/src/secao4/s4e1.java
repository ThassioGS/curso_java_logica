package secao4;
import java.util.Locale;
import java.util.Scanner;

public class s4e1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("SOMA = %d%n", x+y);
				
		sc.close();
	}

}