package NP_1;

import java.io.Serializable;

import javax.swing.JOptionPane;

/**
 * Método da Bisseccao.
 * @author Armando Couto
 * Bibliografia http://www.devmedia.com.br/resolucao-de-equacoes-metodo-da-bisseccao/24086
 */
public class Bisseccao implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		double inicio, fim, temporario, raiz;
		double precisao = 0.01;
		double erro = 1;
		int interacoes;
        int contador = 0;
		
		inicio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para iniciar"));
		fim = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para finalizar"));
		interacoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor de repetições"));
		
        raiz = inicio;
        
        /**
         * Se o erro > precisao (O valor do erro fica variando mas a precisao eu deixei fixa no código),
         * se contador < interacoes (Serve para sair do laço, e não ficar em loop infinito).
         */
        while (erro > precisao && contador < interacoes) {
            temporario = raiz;
            raiz = (inicio + fim) / 2;
            erro = Math.abs((raiz - temporario) / raiz);
            
            if (funcao((int) inicio) * funcao((int) raiz) < 0)
                fim = raiz;
            else
                inicio = raiz;
            
            contador++;
        }
        System.out.println("Valor da Raiz: "+raiz);
	}
	
	/**
	 * Método que calcula o valor da função.
	 * @param inicio ou raiz
	 * @return double
	 */
	public static double funcao(double inicio) {
		return inicio * Math.log(inicio) - 1;
//		return inicio - (Math.pow(inicio, 2) - (9*inicio) + 3) / (3*Math.pow(inicio, 2) - 9);
	}
}