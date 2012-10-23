package NP_2;

import java.io.Serializable;

/**
 * Método de Gauss Jaboci.
 * @author Armando Couto
 * Bibliografia:
 * http://www.das.ufsc.br/~camponog/Disciplinas/DAS-5103/Slides/l16-linsys-iterative-methods.pdf
 */
public class Gauss_Jacobi implements Serializable {
	
	private static final long serialVersionUID = 1L;

	double matriz[][] = {{4,-2,1}, {1,-5,3}, {2,1,4}};
	double vector[] = {2,1,3};
	double vectorR[] = {1,2,3};
	double x2[];
	double somatorio = 1;
	
	public void solJabobi() {
		int tam = matriz.length;
		for (int i = 0; i < 3; i++) {
			System.out.println("\n Vetor "+i+"\n");
			x2 = vectorR.clone();
			for (int j = 0; j < tam; j++) {
				somatorio = 0;
				for (int l = 0; l < tam; l++) {
					if (j != 1)
						somatorio += matriz[j][l] * x2[j];
				}
				vectorR[j] = (vector[j]-somatorio) / matriz[j][j];
				System.out.println(" "+vectorR[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Gauss_Jacobi gj = new Gauss_Jacobi();
		gj.solJabobi();
	}
}