package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import br.com.cefet.banco.modelo.Caixa;
import br.com.cefet.banco.modelo.ContabilizadorDeBonificacoes;
import br.com.cefet.banco.modelo.Diretor;
import br.com.cefet.banco.modelo.Funcionario;
import br.com.cefet.banco.modelo.Gerente;
import br.com.cefet.banco.modelo.Tesoureiro;

public class TestaContabilizador {

	public static void main(String[] args) {
		ContabilizadorDeBonificacoes contabilizador = new ContabilizadorDeBonificacoes();
		
		Gerente g = new Gerente();
		g.setNome("Bianchini");
		g.setSalario(3000);
		
		//Gerente é um Funcionario
		Gerente g2 = new Gerente();
		g2.setNome("Saulin tricolor");
		g2.setSalario(3000);
		
		Caixa c = new Caixa();
		c.setNome("Thais");
		c.setSalario(1000);
		
		Tesoureiro t = new Tesoureiro();
		t.setNome("Thiago");
		t.setSalario(2000);
		
		Diretor d = new Diretor();
		d.setNome("Cynthia");
		d.setSalario(5000);
		
		Funcionario f = new Gerente();
		f.setNome("Fulano");
		
		contabilizador.contabilizaBonificacao(g);//600
		contabilizador.contabilizaBonificacao(g2);//600
		contabilizador.contabilizaBonificacao(c);//450
		contabilizador.contabilizaBonificacao(t);//360
		contabilizador.contabilizaBonificacao(d);//1500
		
		System.out.println("Total pago em bonificações: "
		+contabilizador.getTotalDeBonificacoes());
	}

}
