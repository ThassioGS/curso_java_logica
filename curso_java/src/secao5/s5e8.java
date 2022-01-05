package secao5;
import java.util.Locale;
import java.util.Scanner;

public class s5e8 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double sal = sc.nextDouble();
		double imp = 0;
		
		if (sal < 0) {
			System.out.println("Invalido");
		}
		if (sal <= 2000) {
			System.out.println("Isento");
		}
		else {
			if (sal > 4500) {
				imp = (sal - 4500) * 0.28;
				sal = 4500;
			}
			if (sal > 3000) {
				imp = imp + ((sal - 3000) * 0.18);
				sal = 3000;
			}
			if (sal > 2000) {
				imp += ((sal - 2000) * 0.08);
			}
			System.out.printf("R$ %.2f\n", imp);
		}
		
		sc.close();
	}
}