import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		// mensagem inicial
		System.out.println("==================================");
		System.out.println("            Aula 5");
		System.out.println("==================================");
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		// exercicio 1
		System.out.println("Exerc�cio 1");
		ExercicioDeAlgoritmos ex = new ExercicioDeAlgoritmos();
		System.out.println("Digite abaixo o nome do funcion�rio:");
		entrada.next();
		System.out.println("Digite abaixo o n�mero de horas trabalhadas (float):");
		entrada.nextFloat();
		
		
	}

}
