package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import br.com.cefet.banco.modelo.Cliente;
import br.com.cefet.banco.modelo.Diretor;
import br.com.cefet.banco.modelo.Gerente;
import br.com.cefet.banco.modelo.SistemaInterno;
import br.com.cefet.banco.modelo.Tesoureiro;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno(444);
		
		Gerente g = new Gerente();
		g.setNome("Bianchini");
		g.setSenha(123);
		
		//Gerente é um Funcionario
		Gerente g2 = new Gerente();
		g2.setNome("Saulin tricolor");
		g2.setSenha(444);
		
		Diretor d = new Diretor();
		d.setNome("Oriel");
		d.setSenha(444);
		
		Tesoureiro t = new Tesoureiro();
		t.setNome("Guilherme");
		t.setSenha(444);
		//t.getAutenticador().setSenha(555);
		
		Cliente c = new Cliente("Thais");
		c.setSenha(555);
		
		si.login(g);//negado
		si.login(g2);//Liberado
		si.login(d);//Liberado
		si.login(t);//Liberado
		si.login(c);//negado

	}

}
