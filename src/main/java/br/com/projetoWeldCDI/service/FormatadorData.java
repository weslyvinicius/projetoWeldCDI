package br.com.projetoWeldCDI.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.enterprise.inject.Produces;

import br.com.projetoWeldCDI.qualificador.Brasil;
import br.com.projetoWeldCDI.qualificador.EUA;

public class FormatadorData {
	
	@Produces @Brasil
	public DateFormat getFormatadorDataBrasil(){
		return new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));		
	}
	
	/* caso não informe um qualificador por padrão é inserido um @default*/
	@Produces @EUA
	public DateFormat getFormatadorDataEua(){
		return new SimpleDateFormat("MMMM 'de' dd 'de' yyyy", Locale.US);		
	}
	

}
