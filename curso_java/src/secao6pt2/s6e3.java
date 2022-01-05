package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {

			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double media = (x * 0.2) + (y * 0.3) + (z * 0.5);
			
			System.out.printf("%.1f%n", media);
			
		}
		sc.close();
	}
}