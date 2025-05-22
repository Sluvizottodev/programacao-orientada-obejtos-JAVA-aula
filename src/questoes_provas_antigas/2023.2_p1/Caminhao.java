public class Caminhao extends Veiculo {
    double capacidadeCarga;

    public Caminhao(String modelo, int ano, double valorMercado){
        super(modelo, ano, valorMercado);
        this.capacidadeCarga = 0;
    }

    public double  getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Caminhão - " + super.toString() + ", Capacidade de Carga: " + capacidadeCarga + " kg";
    }

    @Override
    public double gerarImposto(){
        return getValorMercado() * 0.02;
    }
}
