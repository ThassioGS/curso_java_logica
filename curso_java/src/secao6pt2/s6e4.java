package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double x = sc.nextDouble();
			double y = sc.nextDouble();

			if (y == 0) {
				System.out.println("Divisao impossivel");
			} 
			else {
				double div = x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();
	}
}