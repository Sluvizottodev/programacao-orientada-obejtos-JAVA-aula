package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import br.com.cefet.banco.modelo.Empresa;
import br.com.cefet.banco.modelo.Gerente;

public class TestaEmpresaCollection {
    public static void main(String[] args) {
        System.out.println("Testando.....");
        Empresa emp = new Empresa("CEFET", "arquivoGerentes.txt");
        for(Gerente g: emp.getGerentes()){
            System.out.println(g.getNome());
            System.out.println(g.getSalario());
            System.out.println("---------------------");
        }
    }
}
