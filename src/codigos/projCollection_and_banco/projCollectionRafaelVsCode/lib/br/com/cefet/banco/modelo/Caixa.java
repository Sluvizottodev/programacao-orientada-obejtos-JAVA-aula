package br.com.cefet.banco.modelo;

public class Caixa extends Funcionario{
	private int numGuiche;

	public int getNumGuiche() {
		return numGuiche;
	}

	public void setNumGuiche(int numGuiche) {
		this.numGuiche = numGuiche;
	}
	
	@Override
	public double getBonificacaoNatalina() {
		return super.salario * 0.15;
	}
}
