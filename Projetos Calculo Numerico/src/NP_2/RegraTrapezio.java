package NP_2;

import java.io.Serializable;

import javax.swing.JOptionPane;

/**
 * Método de Integração da Regra do Trapézio.
 * @author Armando Couto
 * Bibliografia:
 * http://penguin.ewu.edu/cscd543/Wint-2006/NumInt/Trapezoid.rtf
 * http://wood.mendelu.cz/math/maw-html/index.php?lang=pt&form=trap
 */
public class RegraTrapezio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		int tamanho;
		double[] x, y;
		
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do vetor: "));
		x = new double[tamanho];
		y = new double[tamanho];
		for (int i = 0; i < tamanho; i++) {
			x[i] = Double.parseDouble(JOptionPane.showInputDialog("X["+i+"]: "));
			y[i] = Double.parseDouble(JOptionPane.showInputDialog("Y["+i+"]: "));
		}
		JOptionPane.showMessageDialog(null, "Valor: "+new RegraTrapezio().trapezoidRule(tamanho, x, y));
	}
	
	public double trapezoidRule(int tamanho, double[] x, double[] y) {
		double soma = 0.0, auxiliar;
		for (int i = 1; i < tamanho; i++) {// Trapézio: 1/2 h * (f0 + f1)
			auxiliar = 0.5 * (x[i] - x[i - 1]) * (y[i] + y[i - 1]);
			soma += auxiliar;
		}
		return soma;
	}
}