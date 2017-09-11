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
 * Executando o ponto de injeção do metodos do atributo.
 * 
 */
@Named
@RequestScoped
public class PontosInjecao1 {
	
	
	private CalculaPreco calculaPreco;
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init PrecoProdutoBean2");
	}
	
	public double getPreco(){
		return this.calculaPreco.calculaPreco(12, 44.55);
	}

	@Inject
	public void setCalculaPreco(CalculaPreco calculaPreco) {
		System.out.println("set Calculadora: "+calculaPreco);
		this.calculaPreco = calculaPreco;
	}
	
	

}
