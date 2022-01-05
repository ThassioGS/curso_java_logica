package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, i*i, i*i*i);
		}
		sc.close();
	}
}