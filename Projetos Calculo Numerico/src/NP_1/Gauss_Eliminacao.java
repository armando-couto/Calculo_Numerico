package NP_1;

import java.io.Serializable;

/**
 * Método de Eliminação de Gauss. 
 * @author Armando Couto
 * Bibliografia:
 * http://introcs.cs.princeton.edu/java/95linear/GaussianElimination.java.html
 */
public class Gauss_Eliminacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		double EPSILON = 1e-10;
		int tamanho;

		/**
		 * Manual
		 */
//		tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho da matriz"));
		
		/**
		 * Inicializando a matriz eo vetor.
		 */
//		int[][] matriz = new int[tamanho][tamanho];
//		int[] vetor = new int[tamanho];
//		
//		/**
//		 * Popula a matriz.
//		 */
//		for(int i = 0; i < tamanho; i++) {
//			for(int j = 0; j < tamanho; j++) {
//				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "A("+i+","+j+")"));
//			}
//		}
//		for (int i = 0; i < tamanho; i++) {
//			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "B("+i+")"));
//		}
		
		/**
		 * Automático
		 */
		tamanho = 3;
		int[][] matriz = { { 0, 1, -91 }, { 2, 4, -2 }, { 0, 3, 15 } };
		int[] vetor = { 4, 2, 36 };
		
		int[] retorno = metodoEliminacao(matriz, vetor, EPSILON);

		/**
		 * Resultado
		 */
		System.out.println("Solução:");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("x("+i+") = "+retorno[i]);
		}
	}
	
	public static int[] metodoEliminacao(int[][] matriz, int[] vetor, double EPSILON) {
		int tamanho = vetor.length;

		for (int p = 0; p < tamanho; p++) {
			/**
			 * Encontrar linha pivô e trocar
			 */
			int max = p;
			for (int i = p + 1; i < tamanho; i++) {
				if (Math.abs(matriz[i][p]) > Math.abs(matriz[max][p])) {
					max = i;
				}
			}
			int[] temp = matriz[p];
			matriz[p] = matriz[max];
			matriz[max] = temp;
			int t = vetor[p];
			vetor[p] = vetor[max];
			vetor[max] = t;

			if (Math.abs(matriz[p][p]) <= EPSILON) {
				throw new RuntimeException("Matriz é singular ou quase singular");
			}

			/**
			 * Pivô dentro da matriz e do vetor.
			 */
			for (int i = p + 1; i < tamanho; i++) {
				int alpha = matriz[i][p] / matriz[p][p];
				vetor[i] -= alpha * vetor[p];
				for (int j = p; j < tamanho; j++) {
					matriz[i][j] -= alpha * matriz[p][j];
				}
			}
		}

		/**
		 * Vetor que retorna com os valores.
		 */
		int[] x = new int[tamanho];
		for (int i = tamanho - 1; i >= 0; i--) {
			int sum = 0;
			for (int j = i + 1; j < tamanho; j++) {
				sum += matriz[i][j] * x[j];
			}
			x[i] = (vetor[i] - sum) / matriz[i][i];
		}
		return x;
	}
}