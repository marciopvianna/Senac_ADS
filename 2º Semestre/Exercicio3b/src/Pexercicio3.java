import java.util.Scanner;


public class Pexercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int op=0;
		int cont=1;

		Exercicio3 exercicio = new Exercicio3();
		Scanner ledado = new Scanner(System.in);
		
		
		do{

			System.out.println("Digite o " + cont + " sal�rio: ");
			exercicio.setSalario(ledado.nextDouble());
			exercicio.AdicionaSalario(exercicio.getSalario());
	        
			
			System.out.println("Deseja adicionar mais sal�rios? digite '0' caso contr�rio digite '-1':");
			op = ledado.nextInt();
			cont++;

		} while (op!= -1);
			System.out.println("Digite o valor do reajuste (%): ");
			exercicio.setReajuste(ledado.nextDouble());
			
			exercicio.calculoReajuste();
			
			

	}

}
