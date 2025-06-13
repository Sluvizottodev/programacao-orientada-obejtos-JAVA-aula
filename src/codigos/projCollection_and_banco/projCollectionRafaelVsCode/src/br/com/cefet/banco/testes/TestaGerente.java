package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;
import br.com.cefet.banco.modelo.Funcionario;
import br.com.cefet.banco.modelo.Gerente;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Fred o carrasco");
		g.setSalario(600000);
		g.setSenha(123);
		//func.setTipo(0);
		
		//g.salario=3000;
		
		Funcionario f;
		
		if(g.autentica(122)==true)
			System.out.println("Acesso liberado.");
		else
			System.out.println("Acesso negado");
		
		
		System.out.println("Dados do Gerente:");
		System.out.println("Nome: "+g.getNome());
		System.out.println("Salário: "+g.getSalario());
		System.out.println("Bonificação: "+g.getBonificacaoNatalina());	
	}
}
