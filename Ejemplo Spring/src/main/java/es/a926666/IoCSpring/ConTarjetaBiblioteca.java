package es.a926666.IoCSpring;

import org.springframework.stereotype.Component;

@Component
public class ConTarjetaBiblioteca implements ClienteTypeInterface {

	@Override
	public String getClienteType() {
		return "Cliente con tarjeta de la biblioteca";
	}
	public int getdias() {
		return 15;
	}

}
