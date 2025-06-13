package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public abstract class FuncionarioAutenticavel extends Funcionario{
	private int senha;
	// Métodos "acessores"
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	//comportamento
	public boolean autentica(int senhaFornecida) {
		if (senhaFornecida == this.senha)
			return true;
		return false;
	}
}
