package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import br.com.cefet.banco.modelo.Conta;
import br.com.cefet.banco.modelo.ContaCorrente;
import br.com.cefet.banco.modelo.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class TestaCollection3 {

	public static void main(String[] args) {
		List lista1 = new ArrayList();

		ContaCorrente cc = new ContaCorrente(2, "Ana Maria");
		cc.deposita(3000);
		lista1.add(cc);
		ContaPoupanca cp = new ContaPoupanca(1, "Rafael");
		cp.deposita(6000);
		lista1.add(cp);

		lista1.add("Fulano");

		ContaCorrente cc2 = new ContaCorrente(3, "Maria");
		cc.deposita(2000);
		lista1.add(cc2);

		// Percorre a lista
		for (int i = 0; i < lista1.size(); i++) {
			if(lista1.get(i) instanceof Conta){
				Conta conta = (Conta) lista1.get(i);
				System.out.println("Conta n° "+conta.getNumero()+" de "+conta.getTitular().getNome()
				+" com saldo de R$"+conta.getSaldo());
				//conta.mostraDados();
			}else
				System.out.println(lista1.get(i));	
		}
	}
}
