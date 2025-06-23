package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

public final class Diretor extends Gerente{

	public Diretor() {
        super();
    }
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }
	@Override
	public double getBonificacaoNatalina() {
		return super.salario *0.3;
	}
}
