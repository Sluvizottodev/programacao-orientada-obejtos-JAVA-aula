public class Acessorio implements Comparable<Acessorio>, Tributavel {
    protected String descricao;
    protected double valor;
    int id;

    public Acessorio(String descricao, double valor){
        this.setDescricao(descricao);
        this.setValor(valor);
    }

    @Override
    public double getValorIpi(){
        return this.valor * (10/100);
    }

    @Override
    public int compareTo(Acessorio ac){
        return (int) (this.valor - ac.valor);
    }

    // getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
