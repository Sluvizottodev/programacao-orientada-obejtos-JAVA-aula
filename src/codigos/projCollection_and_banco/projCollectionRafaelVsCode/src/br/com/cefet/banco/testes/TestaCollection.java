package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCollection {
	public static void main(String[] args) {
		List lista1 = new ArrayList();
		lista1.add("Rafael");
		lista1.add("Maria");
		lista1.add("Fulano");
		lista1.add("Rafael");
		//Percorre a lista
		for (int i = 0; i < lista1.size(); i++)
			System.out.println(lista1.get(i));
		//Verifica e remove a 1ª ocorrencia do elemento 
		if(lista1.contains("Rafael")){
			System.out.println("O elemento existe e vai ser removido");
			lista1.remove("Rafael");
		}
			
		
		//Ordena a lista e percorre novamente
		Collections.sort(lista1);
		for (int i = 0; i < lista1.size(); i++)
			System.out.println(lista1.get(i));
		
		lista1.remove("Maria");
		//Adiciona um elemento diferente
		lista1.add(false);
		//Vai dar erro (ClassCastException) porque boolean não é ordenável
		Collections.sort(lista1);
		for (Object elemento : lista1) 
			System.out.println(elemento);
	}
}