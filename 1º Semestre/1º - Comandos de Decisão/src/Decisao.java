import java.util.Scanner;

public class Decisao {

	public Decisao() {
		System.out.println("Exexmplos de Comandos de Decis�o");
		System.out.println("=================================");
	}

	public void decisaoIf() {
		int valor = 0;

		System.out.println("Programa que l� um valor do teclado e averigua se "
				+ " � par ou �mpar.");

		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("Qual Numero ?");
		valor = entrada.nextInt();

		if ((valor % 2) == 0) {
			System.out.printf("%d � par. \n", valor);
		} else {
			System.out.printf("%d � �mpar. \n", valor);
		}

		System.out.println("Fim do programa");

	}

	public void decisaoSwitch() {

		System.out.println("C�digos:");
		System.out.println("1 - Caderno");
		System.out.println("2 - L�pis");
		System.out.println("3 - Borracha");

		System.out.println("Digite o c�digo : ");
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Caderno");
			break;
		case 2:
			System.out.println("L�pis");
			break;
		case 3:
			System.out.println("Borracha");
			break;
		default:
			System.out.println("C�digo inv�lido");
		}
		
		System.out.println("Fim do programa");
	}
}
