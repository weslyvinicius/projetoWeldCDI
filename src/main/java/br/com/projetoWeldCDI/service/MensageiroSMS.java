package br.com.projetoWeldCDI.service;

import br.com.projetoWeldCDI.qualificador.SMS;

@SMS /*informar o seu qualificador*/
public class MensageiroSMS implements Mensageiro{

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por SMS: "+texto);
		
	}

}
