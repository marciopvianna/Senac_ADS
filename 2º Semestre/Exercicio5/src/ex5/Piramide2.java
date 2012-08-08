package ex5;

import java.util.Scanner;

public class Piramide2 {
	private int linhas;

	public void linhas() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero de linhas: ");
		linhas = ler.nextInt();

		for (int i = 0; i < linhas; i++) {
			for (int x = 0; x <= i; x++) {
				
				int v = x+1;
				
				if (v < 10) {
					System.out.print("0"+ v + " ");
				}else{
					System.out.print(v + " ");
				}
			}
			System.out.println("\n");
		}

	}
}
