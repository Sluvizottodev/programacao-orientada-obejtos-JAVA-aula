package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public class AutenticadorLogica {
	private int senha;
	// Métodos "acessores"
	public void setSenha(int senha) {
		if(senha>=0)
			this.senha = senha;
		//System.out.println("Senha inválida.");
	}
	
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		return false;
	}
}
