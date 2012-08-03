package Exercicio2;

/**
 * 
 * @author Consultoria
 * 
 * Continua��o do Exerc�cio 1:
 * Com a implementa��o da classe Pessoa execute os seguintes comandos:
 * 
 * 1. Crie um objeto pessoa de nome pessoa1;
 * 2. Especifique um nome para o objeto pessoa1;
 * 3. Especifique uma idade para pessoa1;
 * 4. A pessoa1 fez anivers�rio;
 * 5. Crie uma segunda pessoa de nome pessoa2;
 * 6. Realize as a��es (2, 3 e 4)com a pessoa2
 *
 */

public class Principal 
{

	public static void main(String[] args) 
	{
		Pessoa a1 = new Pessoa(); // (1)
		a1.setNome("M�rcio Pereira Vianna"); // (2)
		System.out.println("Nome da pessoa 1 �: " + a1.getNome());
		a1.setIdade(26); // (3)
		System.out.println("Idade de " + a1.getNome() + " �: " + a1.getIdade());
		a1.facaAniversario();
		System.out.printf(a1.getNome() + " fez anivers�rio? %b\n", a1.aniversario);
		
		System.out.println("");
				
		Pessoa a2 = new Pessoa(); // (5)
		a2.setNome("Fulano de Tal"); // (6)
		System.out.println("Nome da pessoa 2 �: " + a2.getNome());
		a2.setIdade(79); // (6)
		System.out.println("Idade de " + a2.getNome() + " �: " + a2.getIdade());
		a2.facaAniversario();
		System.out.printf(a2.getNome() + " fez anivers�rio? %b\n", a2.aniversario);
		
	}

}
