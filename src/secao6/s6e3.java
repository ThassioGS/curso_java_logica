package secao6;

import java.util.Locale;
import java.util.Scanner;

public class s6e3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int x = sc.nextInt();

		while (x != 4) {

			switch (x) {
			case 1:
				alcool++;
				x = sc.nextInt();
				break;

			case 2:
				gasolina++;
				x = sc.nextInt();
				break;

			case 3:
				diesel++;
				x = sc.nextInt();
				break;

			default:
				x = sc.nextInt();
				break;

			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
		sc.close();
	}
}