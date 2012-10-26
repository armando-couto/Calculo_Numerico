package NP_2;

import java.io.Serializable;

import javax.swing.JOptionPane;

/**
 * Método de Interpolação de Newton.
 * @author Armando Couto
 * Bibliografia:
 * 
 */
public class InterpolacaoNewton implements Serializable {

	private static final long serialVersionUID = 1L;

	int n;
	double x[];
	double y[];
	double xx[];
	double valorX;
	
	public void metodoNewton() {

		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanho dos Vetores:"));
		x = new double[n];
		y = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor X" + i + ":"));
			y[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor Y" + i + ":"));
		}
		
//		valorX = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de X:"));
//		n = x.length - 1;
//		xx = (double[]) y.clone();
//		for (int i = 0; i < n; ++i) {
//			for (int j = 0; j < n - i; ++j) {
//				xx[j] = (valorX - x[j]) / (x[i + j + 1] - x[j]) * xx[j + 1]
//						+ (valorX - x[i + j + 1]) / (x[j] - x[i + j + 1]) * xx[j];
//			}
//		}
		System.out.println("Valor da Interpolação: " + xx[0]);
	}
	
	public static void main(String[] args) {
		new InterpolacaoNewton().metodoNewton();
	}
	
//	function [a b c]=lsquare(x,y,n)
//	  for i=1:n+1
//	    for j=1:n+1
//	      a(i,j)=sum(x.^(j+i-2));
//	    endfor
//	  endfor
//	  for i=1:n+1
//	    b(i)=sum(y.*x.^(i-1));
//	  endfor
//	  b=b';
//	  c=a\b;
//	  lsquarev=[a b c];
//	endfunction
}