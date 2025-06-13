package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;
public class Cliente implements Autenticavel{
	private String nome;//get e set
	private String cpf;//get e set
	private String email;//get e set
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
	
	//Construtores sobrecarregados
	public Cliente() {
		this.autenticador = new AutenticadorLogica();
	}
	public Cliente(String nome) {
		this();
		this.setNome(nome);
	}
	public Cliente(String nome, String cpf) {
		//A invocação de um construtor compatível deve ser a 1ª instrução
		this(nome);
		//Já contém a validação do cpf (método encapsulado cpfEhValido)
		this.setCpf(cpf);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(nome.length()<5)
			return; //Early return
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	private boolean cpfEhValido(String cpf) {
		if(cpf.length()!=11)
			return false;
		return true;
	}
	public void setCpf(String cpf) {
		if(this.cpfEhValido(cpf)!=true)
			return; //Early return
		this.cpf = cpf;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		if(! (email.contains("@")) )
			return; //Early return
		this.email = email;
	}

	public void mostraDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("E-mail: "+this.email);
	}

}
