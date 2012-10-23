package NP_2;

import java.io.Serializable;

import javax.swing.JOptionPane;

/**
 * Método de Interpolação Polinomial.
 * 
 * @author Armando Couto Bibliografia:
 *         http://wwwp.fc.unesp.br/~arbalbo/Iniciacao_Cientifica
 *         /interpolacao/teoria/1_Interpol_polinomial_Met_Lagrange_Newton.pdf
 *         
 *         http://dexter-one.net/programacion/codigo-fuente-en-java-para-la-resolucion-de-metodos-numericos/
 */
public class InterpolacaoPolinomial implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer tamanhoVetor;
	double xx[][] = new double[3][3];
	// double x[];
	// double y[];
	// double a[];
	double x2[];
	double somatorio = 1;

	// Só para testes.
	double x[] = { -1, 0, 2 };
	double y[] = { 4, 1, -1 };
	double a[] = new double[3];

	private void solInterpolacaoPolinomial() {
		tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Tamanho dos Vetores:"));
		// x[] = new double[tamanhoVetor];
		// y[] = new double[tamanhoVetor];
		// a[] = new double[tamanhoVetor];
		// for (int i = 0; i < 3; i++) {
		// x[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
		// "Digite o valor X"+i+":"));
		// y[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
		// "Digite o valor Y"+i+":"));
		// }

		for (int i = 0; i < x.length; i++) {
			xx[i][0] = 1;
			for (int j = 1; j < y.length; j++)
				xx[i][j] = Math.pow(x[i], j);
		}

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				System.out.println("X" + i + "Y" + (j) + " = " + xx[i][j]);
	}

	public static void main(String[] args) {
		InterpolacaoPolinomial ip = new InterpolacaoPolinomial();
		ip.solInterpolacaoPolinomial();
	}
}