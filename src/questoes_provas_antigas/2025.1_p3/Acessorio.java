public class Acessorio implements Tributavel{
    private int id;
    private String descricao;
    private double valor;

    public Acessorio(String descricao, double valor){
        this.setDescricao(descricao);
        this.setValor(valor);
    }

    @Override
    public double getValorIpi(){
        return this.valor * 0.10;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public void setValor (String valor){
        this.valor = valor;
    }
}