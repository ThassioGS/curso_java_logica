package secao5;
import java.util.Locale;
import java.util.Scanner;

public class s5e2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		
		if (a % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("Impar");
		
		sc.close();
	}
}