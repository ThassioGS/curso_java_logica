package secao5;
import java.util.Locale;
import java.util.Scanner;

public class s5e4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int hI = sc.nextInt();
		int hF = sc.nextInt();
		int hT = hF - hI;
		
		if (hT <= 0)
			System.out.println("O JOGO DUROU " + (hT + 24) + " HORA(S)\n");
		else
			System.out.println("O JOGO DUROU " + hT + " HORA(S)\n");
		
		sc.close();
	}
}