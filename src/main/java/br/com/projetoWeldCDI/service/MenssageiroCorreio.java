package br.com.projetoWeldCDI.service;

/*quando não informado o qualificador o padão é @default*/
public class MenssageiroCorreio implements Mensageiro{

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por correio: "+texto);		
	}

}
