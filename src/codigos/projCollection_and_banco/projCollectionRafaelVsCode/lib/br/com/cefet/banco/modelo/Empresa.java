package codigos.projCollectionRafaelVsCode.projCollectionRafaelVsCode.src.br.com.cefet.banco.modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Gerente> gerentes = new ArrayList();

    public Empresa(String nome) {
        this.setNome(nome);
    }

    public Empresa(String nome, String nomeArquivoGerentes) {
        BufferedReader br = null;
        try {
            InputStream is = new FileInputStream(nomeArquivoGerentes);
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();
            while(linha!=null){
                String[] partes = linha.split("#");
                
                Gerente g = new Gerente(partes[0], Double.parseDouble(partes[1]));
                this.gerentes.add(g);
                linha = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Falha ao abrir aqrquivo");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
        
        this.setNome(nome);
    }

    
    public List<Gerente> getGerentes() {
        return this.gerentes;
    }

    public void setGerentes(List<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
