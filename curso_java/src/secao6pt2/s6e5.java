package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 1;

		for (int i = 1; i <= n; i++) {
			x = x * i;
		}
		
		System.out.println(x);
		sc.close();
	}
}