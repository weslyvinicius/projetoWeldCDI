package br.com.projetoWeldCDI.service;

import javax.annotation.PostConstruct;

public class CalculaPreco {
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init CalculaPreco");
	}
	
	
	public double calculaPreco(int quantidade, double precoUnitario){
		return quantidade * precoUnitario;
	}

}
