package NP_2;

import java.io.Serializable;

import javax.swing.JOptionPane;

/**
 * Método de Interpolação Polinomial.
 * @author Armando Couto 
 * Bibliografia:
 * http://dexter-one.net/programacion/codigo-fuente-en-java-para-la-resolucion-de-metodos-numericos/
 */
public class InterpolacaoPolinomial implements Serializable {

	private static final long serialVersionUID = 1L;

	int n;
	double x[];
	double y[];
	double xx[];
	double valorX;
	
	private void metodoPolinomial() {
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanho dos Vetores:"));
		x = new double[n];
		y = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor X" + i + ":"));
			y[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor Y" + i + ":"));
		}
		valorX = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de X:"));
		n = x.length - 1;
		xx = (double[]) y.clone();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i; ++j) {
				xx[j] = (valorX - x[j]) / (x[i + j + 1] - x[j]) * xx[j + 1]
						+ (valorX - x[i + j + 1]) / (x[j] - x[i + j + 1]) * xx[j];
			}
		}
		System.out.println("Valor da Interpolação: " + xx[0]);
	}

	public static void main(String[] args) {
		new InterpolacaoPolinomial().metodoPolinomial();
	}
}