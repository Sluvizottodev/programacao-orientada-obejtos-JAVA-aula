package testes;

import java.util.ArrayList;
import java.util.List;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaListas2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, "Rafael");
        ContaCorrente cc2 = new ContaCorrente(2, "Ana");
        ContaPoupanca cp = new ContaPoupanca(3, "Maria");
        cc.deposita(1000);
        cc2.deposita(3000);
        cp.deposita(500);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc); contas.add(cc2); contas.add(cp);

        for(int i=0; i<contas.size(); i++)
            contas.get(i).mostrarDados();

        System.out.println();

        for (Conta conta : contas) {
            if( conta!=null)
                conta.mostrarDados();
        }
    }
}
