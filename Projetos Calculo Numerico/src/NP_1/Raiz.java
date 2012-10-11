package NP_1;

import java.io.Serializable;

import javax.swing.JOptionPane;

/**
 * Método que tira a raiz.
 * @author Armando Couto
 *
 */
public class Raiz implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de x?"));
		Double intervalo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do intervalo?"));
		Integer n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de repetições?"));
		System.out.println("X        |        f(x)");
		System.out.println("______________________");
		for (int i = 1; i <= n; i++) {
			Double fx = (Double) (Math.pow(x, 3) - (9*x) + 3);
			System.out.println(x + " | " + fx);
			x = x + intervalo;
		}
		System.out.println("____________________________");
	}
}
