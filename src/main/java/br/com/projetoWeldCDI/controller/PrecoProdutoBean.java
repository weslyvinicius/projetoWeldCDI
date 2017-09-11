package br.com.projetoWeldCDI.controller;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoWeldCDI.service.CalculaPreco;
/**
 * 
 * @author wcardoso2
 * scope default @Dependent
 * 
 * É executado a injeção de dependecia a cada chamada existente
 * na pagina html. 
 */
@Named
public class PrecoProdutoBean {
	
	@Inject
	private CalculaPreco calculaPreco;
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init PrecoProdutoBean");
	}
	
	public double getPreco(){
		return calculaPreco.calculaPreco(12, 44.55);
	}

}
