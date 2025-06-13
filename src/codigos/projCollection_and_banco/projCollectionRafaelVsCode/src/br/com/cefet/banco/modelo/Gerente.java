package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel{
	private AutenticadorLogica autenticador;
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}

	public Gerente() {
		this.autenticador = new AutenticadorLogica();
	}
	
	public Gerente(String nome, double salario) {
		this();
		this.setNome(nome);
		this.setSalario(salario);
	}


	
	
	/*public boolean autentica(String login,int senhaFornecida) {
		if (senhaFornecida == this.senha && login=="cefet")
			return true;
		return false;
	}*/
	
	//@Override
		



	@Override
	public double getBonificacaoNatalina() {
		return super.salario * 0.2;
	}





	
}
