import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Exercicio3 exe3 = new Exercicio3();

				System.out.println("Informe a quantidade de salário deseja cadastrar");
				exe3.recebeQtdeSalario();
				exe3.recebeSalario();
				System.out.println("Informe o valor de reajuste salarial");
				exe3.recebeReajuste();
				System.out.println("Salários reajustados:");
				exe3.exibeSalarios();
	}
}