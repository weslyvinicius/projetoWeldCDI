package br.com.projetoWeldCDI.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoWeldCDI.service.CalculaPreco;
/**
 * 
 * @author wcardoso2
 * scope default 
 * 
 * É executado a injeção de uma unica vez a cada requisao realizado pela pagina html. 
 * 
 */
@Named
@RequestScoped
public class PrecoProdutoBean2 {
	
	@Inject
	private CalculaPreco calculaPreco;
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init PrecoProdutoBean2");
	}
	
	public double getPreco(){
		return calculaPreco.calculaPreco(12, 44.55);
	}
	
	

}
