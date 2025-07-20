public class VeiculoAutomotor implements Comparable<VeiculoAutomotor>, Tributavel {
    protected String modelo;
    protected double valorDeMercado;
    protected int ano, id;

    public VeiculoAutomotor(String modelo, double valorDeMercado, double ano){
        this.setModelo(modelo);
        this.setValorDeMercado(valorDeMercado);
        this.setAno(ano);
    }

    @Override
    public int compareTo(VeiculoAutomotor va){
        return (int) (this.valorDeMercado - va.valorDeMercado);
    }

    @Override
    public double getValorIpi{
        return this.valorDeMercado * 0.20;
    }

    // setters e getters
     public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}