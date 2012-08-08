
public class Exercicio4 {
private int numero;
	
	
	public String strZero( int value, int n ){
		  String s = Integer.toString( value ).trim();
		  StringBuffer resp = new StringBuffer();
		  int fim = n - s.length();
		  for( int x = 0; x < fim; x++ ) 
		    resp.append( '0' );
		  	return resp + s;
	}
	
	
	public void piramide(){
		for (int i=1;i <= numero;i++){
			for(int y=1; y <= i;y++){
				System.out.printf(strZero(i,2) +"	");
				
			}
			System.out.println("\n");
		}
	}
	public void piramideSoma(){
		for (int i=1;i <= numero;i++){
			for(int y=1; y <= i;y++){
				System.out.printf(strZero(y,2) +"	");
				
			}
			System.out.println("\n");
		}
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
}
