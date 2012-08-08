
public class Exercicio1 {

	private int numeronota;
	private double nota;
	private double media;
	private double acumulador=0;
	
	
	public int getNumeronota() {
		return numeronota;
	}

	public void setNumeronota(int numeronota) {
		this.numeronota = numeronota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getMedia() {
		return media;
	}
	public void Acumulador(){
		acumulador= acumulador + nota;
	}
	public void Media() {
		
		media = acumulador/numeronota; 
	}

}
