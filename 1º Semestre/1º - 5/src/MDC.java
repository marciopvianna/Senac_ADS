
import java.util.Scanner;

public class MDC {

	/**
	 * @param args
	 * 
	 * 5.	Calcular o m�nimo m�ltiplo comum (MMC) de dois n�meros inteiros.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		int n3;
		
		System.out.println("Exercicio 5");
		
		// ler 3 n�meros
		Scanner scanner = new Scanner(System.in);
		String str;
		
		// calcular o MDC entre os dois inteiros
		if (n1 >= n2)
		{
			do 
			{
				n3 = n1 % n2;
				n1 = n2;
				n2 = n3;
			} 
			while (n3 != 0);
			System.out.println("o MDC �: " + n1);
			
		}
		else
			System.out.println(" **** O programa s� calcula se incluir o maior inteiro inicialmente! ****");
		
		}
		
}
