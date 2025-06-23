package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import java.io.IOException;

import br.com.cefet.banco.modelo.Banco;
import br.com.cefet.banco.modelo.Funcionario;
import br.com.cefet.banco.modelo.Gerente;
import br.com.cefet.banco.modelo.Tesoureiro;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco(1, 3352, "Banco do Brasil");
		try {
			banco.getEmpregadosByFile("funcionarios.txt");
			System.out.println("Banco: "+banco.getNome()+" - Agência: "+banco.getAgencia());
			System.out.println("Empregados:");
			for (Funcionario func : banco.getEmpregados()) {
				if(func!=null) {
					if(func instanceof Gerente)
						System.out.println("Cargo: Gerente");
					else if(func instanceof Tesoureiro)
						System.out.println("Cargo: Tesoureiro");
					else
						System.out.println("Cargo: Desconhecido");
					System.out.println("Nome: "+func.getNome());
					System.out.println("Salário: "+func.getSalario());
					System.out.println("Bonificação natalina: "+func.getBonificacaoNatalina());
					System.out.println();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
