package br.com.projetoWeldCDI.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoWeldCDI.service.CalculaPreco;
/**
 * 
 * @author wcardoso2
 * 
 * Executando o ponto de injeção pelo construtor
 * 
 */
@Named
@RequestScoped
public class PontosInjecao2 {
	
	
	private CalculaPreco calculaPreco;
	
	/**
	 * Obrigatorio construtor vazia
	 */
	public PontosInjecao2(){
		
	}
	
	@Inject
	private PontosInjecao2(CalculaPreco calculaPreco){
		System.out.println("Metodo construtor "+calculaPreco);
		this.calculaPreco =  calculaPreco;
	}
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init PrecoProdutoBean2");
	}
	
	public double getPreco(){
		return this.calculaPreco.calculaPreco(12, 44.55);
	}

	
	
	

}
