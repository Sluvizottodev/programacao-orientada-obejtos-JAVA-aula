package modelo;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero){
        super(numero);
    }
    public ContaCorrente(int numero, String nomeDoTitular){
        this(numero);
        this.getTitular().setNome(nomeDoTitular);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo -= (taxa*2);
    }

    @Override
    public boolean deposita(double valor) {
        valor += 0.10;
        if (valor > this.saldo || valor <= 0)
            return false;
        else {
            this.saldo -= valor;
            return true;
        }
    }
}
