package questoes_extra_casa.sistema_gestao_cursos;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        try {
            Professor p1 = new Professor("Carla", "Matemática");
            Curso c1 = new Curso("Álgebra Linear", p1);

            c1.adicionarAluno(new Aluno("João", 20, 6.5));
            c1.adicionarAluno(new Aluno("Ana", 19, 9.2));
            c1.adicionarAluno(new Aluno("Lucas", 21, 7.8));

            System.out.println("\nAlunos ordenados por nome:");
            Collections.sort(c1.getAlunos()); // usa Comparable (nome)
            for (Aluno a : c1.getAlunos()) {
                System.out.println(a);
            }

            System.out.println("\nAlunos ordenados por nota:");
            Collections.sort(c1.getAlunos(), Comparator.comparing(Aluno::getNotaFinal).reversed());
            for (Aluno a : c1.getAlunos()) {
                System.out.println(a);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        } finally{
            System.out.println("\nSistema de Gestão de Cursos finalizado.");
        }
    }
}
