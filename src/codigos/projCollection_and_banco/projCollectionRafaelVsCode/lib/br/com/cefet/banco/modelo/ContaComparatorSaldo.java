package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

import java.util.Comparator;

public class ContaComparatorSaldo implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        return (int) (c1.saldo - c2.saldo);
    }
       

}
