//Aula de Laborat�rio de Programa��o I
/* Estrutura Maior para Descri��o */

public class Conta {
	private int numero;
	private double saldo;
	private int totalOperacoes;
	private int totalOperacoesDeposito;
	private int totalOperacoesRetirada;

	// m�todo construtor
	public Conta(int n) {
		numero = n;
		saldo = 0;
		totalOperacoes = 0;
		totalOperacoesDeposito = 0;
		totalOperacoesRetirada = 0;

	}

	// m�todo para realizar dep�sito
	public void depositar(double quantia) {
		saldo = saldo + quantia;
		totalOperacoes = totalOperacoes + 1;
		totalOperacoesDeposito = totalOperacoesDeposito + 1;
	}

	// m�todo para realizar retirada
	public void retirar(double quantia) {
		saldo = saldo - quantia;
		totalOperacoes = totalOperacoes + 1;
		totalOperacoesRetirada = totalOperacoesRetirada + 1;

	}

	// m�todo main /ponto de entrada
	public static void main(String args[]) {
		System.out.println("Programa de Controle de Saldo");
		Conta c1 = new Conta(22);
		System.out.println("conta: " + c1.numero);
		System.out.println("Saldo Atual: " + c1.saldo);
		c1.depositar(300.50);
		System.out.println("Saldo Atual: " + c1.saldo);
		c1.retirar(123.50);
		System.out.println("Saldo Atual: " + c1.saldo);
		System.out.println("Saldo Atual: " + c1.saldo);
		c1.depositar(200.00);
		System.out.println("Total de Opera��es Realizadas :"
				+ c1.totalOperacoes);
		System.out.println("Total de Depositos Realizados:"
				+ c1.totalOperacoesDeposito);
		System.out.println("Total de Depositos Retirados:"
				+ c1.totalOperacoesRetirada);

		Conta contaX = new Conta(666);
		System.out.println("conta:" + contaX.numero);
		System.out.println("Saldo Atual:" + contaX.saldo);
		contaX.depositar(500.00);
		System.out.println("Saldo Atual:" + contaX.saldo);
		contaX.retirar(150.00);
		System.out.println("Saldo Atual:" + contaX.saldo);
		System.out.println("Opera��es Realizadas:" + contaX.totalOperacoes);

	}

}