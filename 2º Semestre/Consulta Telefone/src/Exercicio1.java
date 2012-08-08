import java.util.Scanner;

public class Exercicio1 {

	/**
	 * 1-Fa�a um programa de consulta de telefones a partir de um nome informado
	 * por uma chave de dados: leia nomes de pessoas com seus respectivos
	 * telefones, sendo a quantidade determinada pelo usu�rio. Em seguida
	 * pergunte ao usu�rio qual o nome que ele deseja consultar o telefone. Ap�s
	 * sua resposta, exiba o telefone da pessoa procurada. Informe tamb�m se o
	 * nome � inexistente no banco de dados.
	 */

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a quantidade desejada de dados: ");

		qtde = new ler.nextInt();
		listaTelefones = new int[qtde];
		listaNomes = new String[qtde];
		
		for (int i = 0; i < qtde; i++) {
			System.out.println("Nome: ");
			listaNomes[i] = ler.next();
			System.out.println("Telefone: ");
			listaTelefones[i] = ler.nextInt();
		}
		do {
			achou = false;
			System.out.println("Entre com o nome para consulta: ");
			consulta = ler.next();
			for (int i = 0; i < qtde; i++) {
				if (listaNomes[i].equalsIgnoreCase(consulta)) {
					System.out.println("Telefone: ");
					System.out.println(listaTelefones[i]);
					achou = true;
				}
			}
			if (consulta.equalsIgnoreCase("sair")) {
				achou = true; // apensas para tratar, mensagem n�o ser
								// apresentada
				System.out.println("O programa foi finalizado!");
			}
			if (achou == false)
				System.out
						.println("Esta nome n�o existe na sua lista de dados, ");
		} while (!(consulta.equalsIgnoreCase("sair")));

	}
}