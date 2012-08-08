package exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos: ");
		int qtd = input.nextInt();
		
		Alunos al = new Alunos(qtd);
		
		for (int i = 0; i < al.nome.length; i++) {
			System.out.print("Aluno: ");
			al.nome[i] = input.next();

			System.out.print("Nota: ");
			al.nota[i] = input.nextDouble();

			al.setSoma(al.nota[i]);
		}

		al.setMedia(al.getSoma(), al.nota.length);
		System.out.println("Alunos acima da média: (" + al.getMedia() + ")");

		for (int j = 0; j < al.nome.length; j++) {
			if (al.nota[j] >= al.getMedia()) {
				System.out.println(al.nome[j]);
			}

		}

	}

}
