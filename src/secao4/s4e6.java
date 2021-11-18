package secao4;
import java.util.Locale;
import java.util.Scanner;

public class s4e6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double a, b, c, d, e;
		
		a = (A * C) / 2;
		b = Math.pow(C, 2.0) * 3.14159;
		c = ((A + B) * C ) / 2;
		d = Math.pow(B, 2.0);
		e = A * B;
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\n"
				+"TRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", a, b, c, d, e);
		
		sc.close();
	}

}