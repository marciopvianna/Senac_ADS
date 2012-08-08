import java.util.ArrayList;


public class Exercicio3 {
	
	private ArrayList<Double> salarios = new ArrayList<Double>();
	private double reajuste;
	private double salario;
	private double soma;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getReajuste() {
		return reajuste;
	}
	public void setReajuste(double reajuste) {
		this.reajuste = reajuste;
	}
	public void AdicionaSalario(double salario) {
		salarios.add(salario);
	}
	public void calculoReajuste(){
		for (int i=0 ; i < salarios.size() ; i++){
			soma = salarios.get(i);
			soma += (soma * (reajuste/100));
			System.out.printf("Salario %d sem reajuste: R$ %.2f com reajuste: R$ %.2f \n" , i+1 , salarios.get(i) , soma);
			 
		}
	}
	

}
