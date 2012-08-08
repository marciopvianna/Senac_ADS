import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Exemplo objEx = new Exemplo();
		
		System.out.print("digite um numero.....:   ");
		int v1 = ler.nextInt();
		objEx.setValor1 (v1);
		
		System.out.print("digite outro numero..: + ");
		int v2 = ler.nextInt();
		objEx.setValor2 (v2);
		
		System.out.println("----------------------------");
		System.out.print("a soma é.............:   ");
		objEx.soma();
		System.out.println(objEx.getSoma());
		
	}

}
