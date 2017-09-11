package br.com.projetoWeldCDI.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

/**
 * Mesmo estando dentro de uma classe de Sessão ou Application, esse bean é injetado 
 * o escopo de requisicao
 * 
 */
@RequestScoped
public class CalculaPreco3 {
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init CalculaPreco3");
	}
	
	
	public double calculaPreco(int quantidade, double precoUnitario){
		return quantidade * precoUnitario;
	}

}
