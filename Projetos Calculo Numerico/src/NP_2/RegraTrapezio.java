package NP_2;

import java.util.Scanner;

/**
 * Método de Integração da Regra do Trapézio.
 * @author Armando Couto
 * Bibliografia:
 * http://penguin.ewu.edu/cscd543/Wint-2006/NumInt/Trapezoid.rtf
 * http://wood.mendelu.cz/math/maw-html/index.php?lang=pt&form=trap
 */
public class RegraTrapezio {
	static double trapezoidRule(int size, double[] x, double[] y) {
		double sum = 0.0, increment;
		for (int k = 1; k < size; k++) {// Trapezoid rule: 1/2 h * (f0 + f1)
			increment = 0.5 * (x[k] - x[k - 1]) * (y[k] + y[k - 1]);
			sum += increment;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		Scanner inp = new Scanner(System.in);
		int k, size;
		double[] x, y;
		double integral;
		size = inp.nextInt();
		System.out.println("Number of points: " + size);
		x = new double[size];
		y = new double[size];
		for (k = 0; k < size; k++) {
			x[k] = inp.nextDouble();
			y[k] = inp.nextDouble();
		}
		integral = trapezoidRule(size, x, y);
		System.out.printf("Integral: %4.4f\n", integral);
	}
}
