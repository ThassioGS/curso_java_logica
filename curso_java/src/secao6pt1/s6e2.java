package secao6pt1;

import java.util.Locale;
import java.util.Scanner;

public class s6e2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		

			while (x != 0.0 && y != 0.0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			}
		
		sc.close();
	}
}