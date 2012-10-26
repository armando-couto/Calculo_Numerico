package NP_2;

import java.io.Serializable;

/**
 * Método de Gauss Jaboci.
 * @author Armando Couto
 * Bibliografia:
 * http://www.raymundodeoliveira.eng.br/Metodo_Jacobi.htm
 */
public class Gauss_Jacobi implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
//	double matriz[][] = {{4,-2,1}, {1,-5,3}, {2,1,4}};
	double matriz[][] = {{10,2,-3,2}, {2,-15,3,-2}, {1,-3,20,2}, {2,2,-1,30}};
//	double vector[] = {2,1,3};
	double vector[] = {32,-59,-38,160};
	double vectorR[] = new double[4];
	double x2[] = new double[4];
	double somatorio = 1;
	
	public void metodoJabobi() {
		System.out.println("Pegando os Termos da Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			vectorR[i] = matriz[i][i];
			System.out.println(vectorR[i]);
		}
		System.out.println("Calculando:");
		for (int i = 0; i < vectorR.length; i++) {
			x2[i] = Math.round(vector[i] / vectorR[i]);
			System.out.println(x2[i]);
		}
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println("\n Vetor "+i+"\n");
//			x2 = vectorR.clone();
//			for (int j = 0; j < tam; j++) {
//				somatorio = 0;
//				for (int l = 0; l < tam; l++) {
//					if (j != 1)
//						somatorio += matriz[j][l] * x2[j];
//				}
//				vectorR[j] = (vector[j]-somatorio) / matriz[j][j];
//				System.out.println(" "+vectorR[i]);
//			}
//		}
	}
	
	public static void main(String[] args) {
		new Gauss_Jacobi().metodoJabobi();
	}
}