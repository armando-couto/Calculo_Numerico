package NP_2;

import java.io.Serializable;

/**
 * Método de Interpolação de Lagrange.
 * @author Armando Couto
 * Bibliografia:
 * http://wwwp.fc.unesp.br/~arbalbo/Iniciacao_Cientifica/interpolacao/teoria/1_Interpol_polinomial_Met_Lagrange_Newton.pdf
 */
public class InterpolacaoLagrange implements Serializable {

	private static final long serialVersionUID = 1L;

	double xx[][] = new double[3][3];
	double x[] = new double[3];
	double y[] = new double[3];
	double a[] = new double[3];
	
	private void metodoLagrange() {
		
	}
	
	public static void main(String[] args) {
		InterpolacaoLagrange il = new InterpolacaoLagrange();
		il.metodoLagrange();
	}
}