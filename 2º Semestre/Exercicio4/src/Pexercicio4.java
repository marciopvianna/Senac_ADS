import java.util.Scanner;


public class Pexercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercicio4 exercicio = new Exercicio4();
		Scanner ledado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		exercicio.setNumero(ledado.nextInt());
		
		exercicio.piramide();

	}

}
