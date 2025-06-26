package explicacoes.comparator_e_comparable.pessoa_exemplo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPessoaEx {
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Ana", 25));

        Collections.sort(pessoas);
        System.out.println("Lista ordenada por nome e idade:");

        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }
    
}
