package explicacoes.comparator_e_comparable.pessoa_exemplo;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Pessoa outra){
        int comparaNome = this.nome.compareTo(outra.nome);
        if (comparaNome != 0) { // se igual a 0, seriam iguais
            return comparaNome; 
        }
        // se negativo, vem antes, se positivo, vem depois
        return Integer.compare(this.idade, outra.idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                '}';
    }
}
