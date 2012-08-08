package pacote;

public class Notas {

	private int qtdN;
	public double[] notas;
	private double media;

	public Notas(int tam) {
		notas = new double[tam];
	}

	public void setQtdN(int qtdN) {
		this.qtdN = qtdN;
	}

	public int getQtdN() {
		return this.qtdN;
	}

	public void setMedia(int qtd, double soma) {
		this.media = soma / qtd;
	}

	public double getMedia() {
		return this.media;
	}
}
