package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;
import br.com.cefet.banco.modelo.Funcionario;
import br.com.cefet.banco.modelo.Gerente;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Gerente();
		func.setNome("John Arias");
		func.setSalario(400000);
		//func.setTipo(0);
		
		System.out.println("Dados do Funcionário:");
		System.out.println("Nome: "+func.getNome());
		System.out.println("Salário: "+func.getSalario());
		System.out.println("Bonificação: "+func.getBonificacaoNatalina());
	}
}
