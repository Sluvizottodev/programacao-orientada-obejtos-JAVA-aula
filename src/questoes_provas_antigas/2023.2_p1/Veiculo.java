public abstract class Veiculo{
    private String modelo;
    private int ano;
    private double valorMercado;
    private Motor motor;

    public Veiculo(String modelo, int ano, double valorMercado){
        this.modelo = modelo;
        this.ano = ano;
        this.valorMercado = valorMercado;
    }

    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public double getValorMercado(){
        return valorMercado;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setValorMercado(double valorMercado){
        this.valorMercado = valorMercado;
    }

    public abstract String toString();


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public abstract double gerarImposto();
}