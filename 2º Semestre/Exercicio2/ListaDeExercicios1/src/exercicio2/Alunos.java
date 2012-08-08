package exercicio2;

public class Alunos {
	public String[] nome;
	public double[] nota;
	private double media;
	private double soma = 0;

	public Alunos(int qtd) {
		nome = new String[qtd];
		nota = new double[qtd];
	}

	public void setSoma(double num) {
		soma = num + soma;
	}

	public double getSoma() {
		return this.soma;
	}

	public void setMedia(double total, int div) {
		this.media = total / div;
	}

	public double getMedia() {
		return this.media;

	}

}
