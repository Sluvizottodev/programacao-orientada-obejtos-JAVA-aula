package modelo;
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int numero){
        super(numero);
    }
    public ContaPoupanca(int numero, String nomeDoTitular){
        this(numero);
        this.getTitular().setNome(nomeDoTitular);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo -= (taxa*3);
    }
}
