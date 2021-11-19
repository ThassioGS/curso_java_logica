package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int in = 0, out = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("in: %d%nout: %d", in, out);
		
		sc.close();
	}
}