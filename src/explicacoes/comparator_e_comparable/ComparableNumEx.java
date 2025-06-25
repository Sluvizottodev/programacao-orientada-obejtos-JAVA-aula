package explicacoes.comparator_e_comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableNumEx {
    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();

        l.add(45);
        l.add(32);
        l.add(47);
        l.add(3);
        l.add(22);

        Collections.sort(l);
    
        for (Integer i : l) {
            System.out.println(i);
        }
    }
}
