package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public class Conta implements Comparable<Conta>{
	// Atributos
	protected Cliente titular; //Apenas getTitular (IMUTÁVEL)
	protected double saldo; //getSaldo, saca, deposita, transferePara
	protected int numero; //getNumero, setNumero
	
	//Construtor que exige um número
	public Conta(int numero) {
		this.saldo = 500.0;
		this.titular = new Cliente();
		this.setNumero(numero);
	}
	//Construtor que exige o número da conta e o nome do titular
	public Conta(int numero, String nomeDoTitular) {
		this.saldo = 500.0;
		this.titular = new Cliente(nomeDoTitular);
		this.setNumero(numero);
		System.out.println("Construindo/instanciando uma conta....");
	}

	@Override
	public int compareTo(Conta outraConta) {
		/*if(this.numero>outraConta.numero)
			return 1;
		else if(this.numero<outraConta.numero)
			return -1;
		else
			return 0;*/
		return this.numero - outraConta.numero;
		//return this.getTitular().getNome().compareTo(outraConta.getTitular().getNome());
	}

	//Métodos "acessores"
	private void setNumero(int numero) {
		if(! (numero>0) ) {
			System.out.println("Número inválido para criação de uma conta.");
			System.out.println("A aplicação será encerrada.");
			System.exit(0);
		}
		//atributo numero = argumento numero;
		this.numero = numero;	
	}
	public int getNumero() {
		return this.numero;
	}
	public Cliente getTitular(){
		return this.titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	// Comportamento
	public boolean deposita(double valor) {
		if (!(valor > 0))
			return false;
		else {
			//this.saldo += valor; // Faz a mesma coisa que a linha abaixo
			this.saldo = this.saldo + valor;
			return true;
		}
	}

	public boolean saca(double valor) {	
		if (valor > this.saldo) {
			return false;
		} else {
			//AJUDINHA para entender melhor o this (referência corrente)
			//Se eu invocar saca com conta1, this-->#12345
			//Se eu invocar saca com conta2, this-->#54321
			this.saldo -=valor;
			//Faz a mesma coisa que a linha acima
			//this.saldo = saldo - valor;
			return true;
		}
	}	
	
	public void mostraDados() {
		System.out.println("Número: "+this.numero);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Dados do titular:");
		this.titular.mostraDados();
	}
	
	public boolean transferePara(Conta contaDestino, double valor) {
		//conta1 --> #12345 -->this -->#12345
		/*if(this.saldo>=valor) {
			this.saldo -= valor;
			contaDestino.saldo+=valor;
			return true;
		}else
			return false;*/
		if(this.saca(valor)==true) {
			boolean conseguiuDepositar = contaDestino.deposita(valor);
			return conseguiuDepositar; // O retorno será true, o mesmo do método deposita
		}
		return false;
	}


}
