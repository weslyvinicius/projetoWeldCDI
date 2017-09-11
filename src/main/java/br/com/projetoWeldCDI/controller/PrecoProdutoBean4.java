package br.com.projetoWeldCDI.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoWeldCDI.service.CalculaPreco3;
/**
 * 
 * @author wcardoso2
 * scope default 
 * 
 * É executado a injeção na Application da aplicação. 
 *  Na execução das classe Session ou Application scoped, os beans que serão insetados não pode ser do tipo @dependent.
 */
@Named
@ApplicationScoped
public class PrecoProdutoBean4 {

	@Inject
	private CalculaPreco3 calculaPreco3;
	
	@PostConstruct
	public void init(){
	    System.out.println("Metodo Init PrecoProdutoBean4");
	}
	
	public double getPreco(){
		System.out.println(calculaPreco3.getClass());
		return calculaPreco3.calculaPreco(12, 44.55);
	}

}
