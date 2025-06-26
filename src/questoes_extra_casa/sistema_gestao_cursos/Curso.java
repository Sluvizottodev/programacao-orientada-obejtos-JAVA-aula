package questoes_extra_casa.sistema_gestao_cursos;
import java.util.*;

public class Curso {
    private String nome;
    private Professor professorResponsavel;
    List<Aluno> alunos = new ArrayList<>();

    public Curso (String nome, Professor professorResponsavel) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    
    @Override
    public String toString() {
        return nome + " - Professor: " + professorResponsavel.toString();
    }
}
