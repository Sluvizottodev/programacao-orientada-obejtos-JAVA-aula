package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	//private int tipo;//0 - Funcionario 10% 1 - Gerente 2 20% - Caixa 15%
	
	//Construtor
	public Funcionario() {
	}
	//comportamento
	//Minhas filhas fornecerão a implementação desse método
	public abstract double getBonificacaoNatalina();
	//Métodos "acessores"	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
