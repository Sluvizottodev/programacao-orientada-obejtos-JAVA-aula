package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import br.com.cefet.banco.modelo.Conta;
import br.com.cefet.banco.modelo.ContaComparatorSaldo;
import br.com.cefet.banco.modelo.ContaCorrente;
import br.com.cefet.banco.modelo.ContaPoupanca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCollection4 {
	public static void main(String[] args) {
		List<Conta> lista1 = new ArrayList();
		ContaCorrente cc = new ContaCorrente(2, "Ana Maria");
		cc.deposita(3000);
		lista1.add(cc);
		ContaPoupanca cp = new ContaPoupanca(1, "Rafael");
		cp.deposita(6000);
		lista1.add(cp);
		ContaCorrente cc2 = new ContaCorrente(3, "Maria");
		cc.deposita(2000);
		lista1.add(cc2);
		
		for (int i = 0; i < lista1.size(); i++) {
			Conta conta = lista1.get(i);
			System.out.println("Conta n° "+conta.getNumero()+" de "+conta.getTitular().getNome()
				+" com saldo de R$"+conta.getSaldo());
		}
		
		System.out.println();
		//Como ordenar Contas????
		Collections.sort(lista1);
		
		for (Conta c : lista1) {
			System.out.println("Conta n° "+c.getNumero()+" de "+c.getTitular().getNome()
				+" com saldo de R$"+c.getSaldo());
		}

		System.out.println();
		//Como ordenar Contas????
		//Collections.sort(lista1, new ContaComparatorSaldo());
		Collections.sort(lista1, 
			(Conta c1, Conta c2)-> (int) (c1.getSaldo() - c2.getSaldo())
		);
		
		for (Conta c : lista1) {
			System.out.println("Conta n° "+c.getNumero()+" de "+c.getTitular().getNome()
				+" com saldo de R$"+c.getSaldo());
		}
	}
}
