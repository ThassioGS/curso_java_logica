package secao5;
import java.util.Locale;
import java.util.Scanner;

public class s5e3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao Sao Multiplos");
		
		sc.close();
	}
}