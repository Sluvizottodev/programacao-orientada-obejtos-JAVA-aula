package codigos.proj_interface_para_area.areaCalc;

public class Retangulo implements AreaCalculavel {
    private int largura, altura;
    public Retangulo (int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return this.largura * this.altura;
    }

}
