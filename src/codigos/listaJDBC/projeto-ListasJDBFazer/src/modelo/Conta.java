package modelo;
public abstract class Conta {
    protected int numero;
    private Cliente titular;// IMUTÁVEL (não tem set)
    protected double saldo;

    private Conta(){
        this.saldo = 500;
        this.titular = new Cliente();
    }
    public Conta(int numero){
        this();//Invocando o construtor default
        this.setNumero(numero);
    }
    public Conta(int numero, String nomeDoTitular){
        this(numero);//Invocando o construtor que recebe e valida o número
        //Invocando o construtor correto em cliente
        this.titular = new Cliente(nomeDoTitular); 
    }

    public abstract void atualiza(double taxa);

    private void setNumero(int numero) {
        if (numero < 1)
            return;// Early return
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean saca(double valor) {
        if (valor > this.saldo || valor <= 0)
            return false;
        else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean deposita(double valor) {
        if (valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean transferePara(Conta contaDestino, double valor) {
        // Conta contaOrigem = this;
        if (!this.saca(valor))
            return false;
        if (!contaDestino.deposita(valor))
            return false;
        return true;
    }

    public void mostrarDados() {
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Saldo: R$: " + this.getSaldo());
        System.out.println("Dados do titular:");
        this.titular.mostrarDados();
    }
}
