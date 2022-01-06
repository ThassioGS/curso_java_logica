package util;

public class currencyConverter {
	
	public static double IOF = 0.06;

	public static double converted(double dollar, double bought) {
		return ((dollar * bought) * (1 + IOF));
	}
}
