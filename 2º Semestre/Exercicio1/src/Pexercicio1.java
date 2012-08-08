import java.util.Scanner;


public class Pexercicio1 {
	
		
	public static void main(String[] args) {
		
		double notas[];
		int cont = 0;
		Exercicio1 exercicio = new Exercicio1();
		Scanner ledado = new Scanner(System.in);
		
		
		System.out.println("Digite o numero de notas: ");
		exercicio.setNumeronota(ledado.nextInt());
		notas = new double[exercicio.getNumeronota()];
		
		for (int i=0 ; i < exercicio.getNumeronota() ; i++){
			System.out.println("Digite o valor da nota: ");
			exercicio.setNota(ledado.nextDouble());
			notas[i] = exercicio.getNota();
			exercicio.Acumulador();
			
		}
		exercicio.Media();
		System.out.println("Valor da Média: " + exercicio.getMedia());
		System.out.println("Notas maiores que a média: ");
		
		for (int i=0 ; i < notas.length ; i++){
			if (notas[i] > exercicio.getMedia()){
				System.out.println(notas[i]);
			}
		}
		
		System.out.println("Notas menores que a média: ");
		for (int i=0 ; i < notas.length ; i++){
			if (notas[i] < exercicio.getMedia()){
				System.out.println(notas[i]);
			}
			if (notas[i]==exercicio.getMedia()){
				cont++;
			}
			
		}
		System.out.println("Numero de notas com valor igual a média: "+ cont);
		
				
	}

}
