// -----------------------//
//  cabe�alho da classe   //
//----------------------- //

// classe � <public> pois deve ser vista por outras classes
public class Conta {
	
	//------------------------------------ //
	// atributos ou vari�veis de inst�ncia //
	//------------------------------------ //
	
	// saldo vai ser <private> para ser encapsulado
	private float saldo;
	private Pessoa pessoa1;
	private Pessoa pessoa2;

	//------------------------------------ //
	// 				construtor			   //
	//------------------------------------ //
	public Conta()
	{
		saldo = 0.0f;
	}

	//------------------------------------ //
	// 	  m�todos - getters e setters      //
	//------------------------------------ //
	
	// getter
	// tipo de retorno: <float>
	public float getSaldo() 
	{
		return saldo;
	}

	// setter
	// tipo de retorno: <void>
	public void setSaldo(float pSaldo) 
	{
		saldo = pSaldo;
	}
	
	public Pessoa getPessoa1() {
		return pessoa1;
	}

	public void setPessoa1(Pessoa vpessoa1) {
		pessoa1 = vpessoa1;
	}

	public Pessoa getPessoa2() {
		return pessoa2;
	}

	public void setPessoa2(Pessoa vpessoa2) {
		pessoa2 = vpessoa2;
	}


	//------------------------------------ //
	// 			m�todos - outros		   //
	//------------------------------------ //

	// exposi��o do saldo como um inteiro
	// tipo de retorno = <int>
	public int leSaldoInteiro()
	{
		return Math.round(saldo);
	}
	
	
	// tipo de retorno: float
	// obs: decidimos retornar o saldo no m�todo <depositar>
	// cabe�alho do m�todo ou assinatura:
	public float depositar( float valorDeposito )
	//-----------------------^tipo do par�metro (float)
	//-------------------------------^nome do par�metro ou vari�vel (valorDeposito)
	// corpo do m�todo:
	{
		saldo = saldo + valorDeposito;
		return saldo;
	}

	// m�todo <static>
	// retorna o nome do banco que desenvolveu o sistema
	public static String nomeDoBanco()
	{
		String str = new String("Banco da Pra�a");
		return str;
	}
	
// fim da classe
}
