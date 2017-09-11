package br.com.projetoWeldCDI.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Exemplo de Utilização do View Scope com CDI.
 * 
 * Como não existe ainda implementação do CDI, deve ser utilzado um pacote de ajudar.
 * diponibilizado pelo https://github.com/steve-taylor/cdi-view-scope/
 * 
 * Deve ser adionado ao projeto as classes:
 * ViewContextExtension
 * ViewScopedContext
 * 
 * Depois criar uma pasta "services" dentro e resouces/meta-inf
 * criar um arquivo com o nome:  cdi.extensions.viewscope.ViewContextExtension
 * 
 * Dentro do arquivo informar o caminho onde se encontra a classe ViewScopedContext
 * exemplo da nossa aplicação: "br.com.projetoWeldCDI.util.viewScope.ViewContextExtension"
 *  
 *  Na utilizaçãodo @ViewScoped deve ser utilizado a implementação Serilizable.
 *
 */

@Named
@ViewScoped
public class ExempleViewScoped implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -230411734209274454L;

	private List<Integer> produtosFiltrados;
	
	public ExempleViewScoped(){
		produtosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++){
			produtosFiltrados.add(i);
		}
	}
	
	public List<Integer> getProdutosFiltrados(){
		return produtosFiltrados;
	}
}
