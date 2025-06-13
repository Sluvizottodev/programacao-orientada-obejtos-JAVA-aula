package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero) {
		super(numero);
	}
	public ContaPoupanca(int numero, String nomeDoTitular) {
		//invoco o construtor da superclasse
		super(numero);
		this.getTitular().setNome(nomeDoTitular);
	}
}
