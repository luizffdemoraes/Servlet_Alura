package br.com.zup.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Zup");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Ita�");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return this.lista;
	}

}
