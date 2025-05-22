public class SistemaImpostos {
    private double totalImpostos = 0;

    public void acumularImposto(Veiculo veiculo) {
        double imposto = veiculo.gerarImposto();
        totalImpostos += imposto;
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}
