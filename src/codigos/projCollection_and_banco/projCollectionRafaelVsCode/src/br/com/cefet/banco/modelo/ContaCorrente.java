package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public class ContaCorrente extends Conta{
	public ContaCorrente(int numero) {
		//invoco o construtor da superclasse
		super(numero);
	}
	public ContaCorrente(int numero, String nomeDoTitular) {
		//invoco o construtor da superclasse
		super(numero);
		this.getTitular().setNome(nomeDoTitular);
	}

	
	
	@Override
	public boolean saca(double valor) {
		/*
		 * if ((valor+0.50) > this.saldo) { return false; } else { //AJUDINHA para
		 * entender melhor o this (referência corrente) //Se eu invocar saca com conta1,
		 * this-->#12345 //Se eu invocar saca com conta2, this-->#54321 this.saldo
		 * -=(valor+0.50); //Faz a mesma coisa que a linha acima //this.saldo = saldo -
		 * valor; return true; }
		 */
		return super.saca(valor+0.50);
	}
}
