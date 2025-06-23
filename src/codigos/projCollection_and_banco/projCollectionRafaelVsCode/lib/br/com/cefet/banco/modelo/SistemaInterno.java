package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public class SistemaInterno {
	private int senhaSistema;
	
	public SistemaInterno(int senhaSistema) {
		this.senhaSistema = senhaSistema;
	}
	
	public void login(Autenticavel a) {
		if(a.autentica(this.senhaSistema)==true)
			System.out.println("Acesso liberado");
		else
			System.out.println("Acesso negado");
	}
}
