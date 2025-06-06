package codigos.proj_interface_para_area.areaCalc;

public class Circulo implements AreaCalculavel {
    
    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * this.raio;
    }

}
