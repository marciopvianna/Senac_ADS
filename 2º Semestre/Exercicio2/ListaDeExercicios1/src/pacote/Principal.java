package pacote;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int tamanho;
		double soma = 0;
		Scanner le = new Scanner(System.in);
		System.out.print("Digite a quantidade desejada de notas: ");
		tamanho = le.nextInt();
		Notas obj = new Notas(tamanho);
		obj.setQtdN(tamanho);

		for (int i = 0; i < obj.getQtdN(); i++) {
			System.out.print("NOTA:");
			obj.notas[i] = le.nextDouble();
			soma += obj.notas[i];
		}
		obj.setMedia(obj.getQtdN(), soma);
		System.out.println("M�DIA DAS NOTAS: " + obj.getMedia());

		System.out.println("ACIMA DA M�DIA: ");
		for (int j = 0; j < obj.getQtdN(); j++) {
			if (obj.notas[j] > obj.getMedia()) {
				System.out.println(obj.notas[j]);
			}
		}
		System.out.println("ABAIXO DA M�DIA: ");
		for (int x = 0; x < obj.getQtdN(); x++) {
			if (obj.notas[x] < obj.getMedia()) {
				System.out.println(obj.notas[x]);
			}

		}
		System.out.println("NA M�DIA: ");
		for (int z = 0; z < obj.getQtdN(); z++) {
			if (obj.notas[z] == obj.getMedia()) {
				System.out.println(obj.notas[z]);
			}
		}
	}
}
