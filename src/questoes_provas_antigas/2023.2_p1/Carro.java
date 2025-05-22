public class Carro extends Veiculo {

    public Carro(String modelo, int ano, double valorMercado) {
        super(modelo, ano, valorMercado);
    }

    @Override
    public double gerarImposto(){
        return getValorMercado() * 0.04;
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString();
    }
}
