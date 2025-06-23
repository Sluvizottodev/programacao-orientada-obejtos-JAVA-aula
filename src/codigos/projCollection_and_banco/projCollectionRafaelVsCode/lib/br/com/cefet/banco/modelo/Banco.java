package br.com.cefet.banco.modelo;

import br.com.cefet.banco.modelo.Funcionario;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	private int numero;
	private int agencia;
	private String nome;
	private List<Funcionario> empregados = new ArrayList<>();
	//Construtor
	public Banco(int numero, int agencia, String nome) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setNome(nome);
	}
	public void getEmpregadosByFile(String nomeDoArquivo) throws IOException {
		BufferedReader br = null;
		try {
			InputStream is = new FileInputStream(nomeDoArquivo);
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			br = new BufferedReader(isr);
			
			String linha = br.readLine();
			while(linha!=null) {
				String[] info = linha.split("#");
				String tipo = info[0];
				String nome = info[1];
				double salario = Double.parseDouble(info[2]);
				
				Funcionario f = null;
				if(tipo.equals("Gerente"))
					f=new Gerente();
				else
					f=new Tesoureiro();
				f.setNome(nome);
				f.setSalario(salario);
				
				this.empregados.add(f);
				linha = br.readLine();
			}
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}finally {
			br.close();
		}
	}
	//get e set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Funcionario> getEmpregados() {
		return empregados;
	}
	public void setEmpregados(List<Funcionario> empregados) {
		this.empregados = empregados;
	}
	
}
