package testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListas1 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        lista.add("Rafael");
        lista.add("Ana");
        lista.add("Fulano");
        lista.add("Ana");

        for(int i=0;i<lista.size();i++)
            System.out.println(lista.get(i));
        
        //Removendo um elemento (a 1ª ocorrencia de Ana)
        if(lista.contains("Ana"))
            lista.remove("Ana");

        System.out.println("###Ordenando a lista###");
        Collections.sort(lista);
        //Collections.shuffle(lista);//Embaralha a lista

        for (Object elemento : lista) {
            //elemento equivale a lista.get(i)
            System.out.println( (String) elemento);
        }
    }
}
