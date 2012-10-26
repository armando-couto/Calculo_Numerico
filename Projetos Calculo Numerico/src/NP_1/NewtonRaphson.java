package NP_1;

import javax.swing.JOptionPane;

/**
 * Método de Newton Raphson.
 * @author Armando Couto
 * Bibliografia:
 */
public class NewtonRaphson {

	public static void main(String[] args) {
		
		double e = 0.01;
		double d, x0, x1;
		
		/**
		 * Valores para x0 estão no intervalo de (-5, -3), (0, +1) e (+2, +3).
		 * Os que eu testei fica nesse intervalo (-1, +3).
		 */
		x0 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para X inicial"));
		
		x1 = funcao(x0);
		d = Math.abs(x1 - x0);

		/**
		 * Se o d >= e (Enquanto o d for maior ou igual continua no loop).
		 */
		while(d >= e) {
			x0 = x1;
			x1 = funcao(x0);
			d = Math.abs(x1 - x0);
			System.out.println("Valor da raiz: " + x1);
		}
	}
	
	/**
	 * Método que calcula o valor da função.
	 * @param x0
	 * @return double
	 */
	public static double funcao(double x0) {
		return Math.exp(Math.pow(-x0, 2)) - Math.cos(x0);
//		return x0 - (Math.pow(x0, 2) - (9*x0) + 3) / (3*Math.pow(x0, 2) - 9);
	}
}