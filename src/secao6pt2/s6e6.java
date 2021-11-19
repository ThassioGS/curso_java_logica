package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			if(n % i == 0 ) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}