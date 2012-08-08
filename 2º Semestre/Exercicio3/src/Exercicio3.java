import java.util.Scanner;

public class Exercicio3 {
	private float[] salario;
	private int qtdeSalario;
	private float reajuste;
	
	Scanner ler = new Scanner(System.in);
	
	public void recebeQtdeSalario() {
		qtdeSalario = ler.nextInt();
	}

	public void recebeSalario() {
		
		salario = new float[qtdeSalario];
		for (int i = 0; i < salario.length; i++) {
			System.out.println("Digite o salário da " + (i + 1) + "ª pessoa ");
			salario[i] = ler.nextFloat();
			
		}
	}
	
	public void recebeReajuste() {
		reajuste = ler.nextFloat();
	}
	
	public void exibeSalarios() {
		
		for (int i = 0; i < salario.length; i++) {
			System.out.println((salario[i]+reajuste));			
			
		}
		
	}

}

