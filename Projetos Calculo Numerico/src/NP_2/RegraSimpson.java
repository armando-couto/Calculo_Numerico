package NP_2;

import java.io.Serializable;

/**
 * Método de 1/3 de Simpson.
 * @author Armando Couto
 * Bibliografia:
 * http://introcs.cs.princeton.edu/java/93integration/SimpsonsRule.java.html
 * http://www.univasf.edu.br/~jorge.cavalcanti/8CN_integracao.pdf
 */
public class RegraSimpson implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 *	function I=intsimpson(a,b,n)
	 *    k=[0:n];
	 *	  h=(b-a)/(n);
	 *	  x=[a:h:b];
	 *	  aux1=sum(mod(k,2).*f(x));
	 *	  aux2=sum((1-mod(k,2)).*f(x));
	 *	  I=h/3.*(2*aux2+4*aux1-f(a)-f(b));
	 *	endfunction
	 */
	
	private double vetor[] = {0.000, 0.125, 0.250, 0.375, 0.500, 0.625, 0.750, 0.875, 1.000};
	private double resposta[] = new double[9];
	
	public static double f(double x) {
		return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
	}

	public static double integrate(double a, double b) {
		int N = 10000; // precision parameter
		double h = (b - a) / (N - 1); // step size

		// 1/3 terms
		double sum = 1.0 / 3.0 * (f(a) + f(b));

//		// 4/3 terms
//		for (int i = 1; i < N - 1; i += 2) {
//			double x = a + h * i;
//			sum += 4.0 / 3.0 * f(x);
//		}
//
//		// 2/3 terms
//		for (int i = 2; i < N - 1; i += 2) {
//			double x = a + h * i;
//			sum += 2.0 / 3.0 * f(x);
//		}

		return sum * h;
	}

	public void calcular() {
		for (int i = 0; i < 9; i++) {
			resposta[i] = Math.exp(vetor[i]);
		}
		System.out.println("Resposta:");
		for (int i = 0; i < 9; i++) {
			System.out.println(resposta[i]);
		}
	}
	
	public static void main(String[] args) {
		double a = 0;
		double b = 1;
		System.out.println(integrate(a, b));
		new RegraSimpson().calcular();
	}
}