package br.com.projetoWeldCDI.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoWeldCDI.qualificador.SMS;
import br.com.projetoWeldCDI.service.Mensageiro;
/**
 * 
 * Exemplo de CDI com Qualificadores
 *
 */

@Named
@RequestScoped
public class EnvioMensagemBean {
	
	/**
	 * Quando existe mais de duas implementação deve ser informado qualificador.
	 * Quando não for informado um qualificador  no ponto de injeção será utilizado o padrão @default
	 */
	@Inject @SMS
	private Mensageiro mensageiro;
	
	private String texto;

	
	public void enviarMensagem(){
		mensageiro.enviarMensagem(texto);
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
