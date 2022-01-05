package secao5;
import java.util.Locale;
import java.util.Scanner;

public class s5e1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		
		if (a >= 0)
			System.out.println("Positivo");
		else
			System.out.println("Negativo");
		
		sc.close();
	}
}