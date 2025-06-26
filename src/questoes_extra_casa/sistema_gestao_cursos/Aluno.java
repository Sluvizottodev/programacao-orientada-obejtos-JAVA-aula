package questoes_extra_casa.sistema_gestao_cursos;

public class Aluno implements Avaliavel, Comparable<Aluno> {
    private String nome;
    private int idade;
    private double notaFinal;

    public Aluno (String nome, int idade, double notaFinal) {
        if(notaFinal < 0 || notaFinal > 10){
            throw new NotaInvalidaException("Nota inválida!");
        }

        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

    public String getNome() { return nome; }
    @Override
    public double getNotaFinal() { return notaFinal; }

    @Override
    public int compareTo(Aluno outro){
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " - Nota: " + notaFinal;
    }
    
}
