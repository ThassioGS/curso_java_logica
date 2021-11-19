package secao6pt2;

import java.util.Locale;
import java.util.Scanner;

public class s6e1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		
		for(int i = 1; i < X; i +=2) {
			System.out.println(i);
		}
		sc.close();
	}
}