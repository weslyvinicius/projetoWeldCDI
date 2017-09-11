package br.com.projetoWeldCDI.controller;

import java.text.DateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoWeldCDI.qualificador.Brasil;
/**
 * 
 * Exemplo de Métodos produtores
 *
 */

@Named
@RequestScoped
public class FormatacaoBean {
	
	/* caso não informe um qualificador por padrão é inserido um @default*/
	
	@Inject @Brasil
	private DateFormat fomatadorData;
	
	private Date dataInformada;
	
	private String dataFormatada;
	
	public void enviar(){
		dataFormatada = fomatadorData.format(dataInformada);
	}

	public Date getDataInformada() {
		return dataInformada;
	}

	public void setDataInformada(Date dataInformada) {
		this.dataInformada = dataInformada;
	}

	public String getDataFormatada() {
		return dataFormatada;
	}

	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}
	

}
