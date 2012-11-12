package NP_2;

import java.io.Serializable;

/**
 * Método de 1/3 de Simpson.
 * @author Armando Couto
 * Bibliografia:
 * http://introcs.cs.princeton.edu/java/93integration/SimpsonsRule.java.html
 */
public class RegraSimpson implements Serializable {

	private static final long serialVersionUID = 1L;

	public static double f(double x) {
		return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
	}

	public static double integrate(double a, double b) {
		int N = 10000; // precision parameter
		double h = (b - a) / (N - 1); // step size

		// 1/3 terms
		double sum = 1.0 / 3.0 * (f(a) + f(b));

		// 4/3 terms
		for (int i = 1; i < N - 1; i += 2) {
			double x = a + h * i;
			sum += 4.0 / 3.0 * f(x);
		}

		// 2/3 terms
		for (int i = 2; i < N - 1; i += 2) {
			double x = a + h * i;
			sum += 2.0 / 3.0 * f(x);
		}

		return sum * h;
	}

	public static void main(String[] args) {
		double a = 0;
		double b = 1;
		System.out.println(integrate(a, b));
	}
}