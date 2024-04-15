package es.a926666.IoCSpring;


import org.springframework.stereotype.Component;

@Component
public class ConCuentaAplicacion implements ClienteTypeInterface{

	@Override
	public String getClienteType() {
		return "Cliente con cuenta en la aplicación";
	}
	public int getdias() {
		return 30;
	}

}