package NP_1;

/**
 * Método que mostra a precisão do computador.
 * @author Armando Couto
 * Bibliografia:
 */
public class Precisao {

	public static void main(String[] args) {
		
		float a = 1;
		float s = 2;
		double aa = 1;
		double ss = 2;
		
		while(s > 1) {
			a = a/2;
			s = 1+a;
		}
		System.out.println("Com Float: " + 2*a);
		
		while(ss > 1) {
			aa = aa/2;
			ss = 1+aa;
		}
		System.out.println("Com Double: " + 2*aa);
	}
}