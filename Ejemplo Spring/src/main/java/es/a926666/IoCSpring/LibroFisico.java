package es.a926666.IoCSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LibroFisico implements LibroInterface {

	private Boolean prestado;
	@Autowired
	@Qualifier("conTarjetaBiblioteca")
	private ClienteTypeInterface cliente;
	
	
	public LibroFisico() {
		prestado=false;
		
	}
	@Override
	public void pedirLibro(int id) {
		if(!this.prestado) {
			System.out.println("Tipo de Cliente: "+this.cliente.getClienteType());
			System.out.println("Se ha pedido el libro con id " + id + " en formato físico. Le llegará a la dirección indicada");
			System.out.println("Debe ser devuelto en : "+this.cliente.getdias() +" días \n");
			this.prestado=true;
		}
		else {
			System.out.println("El libro ya se encuentra prestado");
		}	

	}

	@Override
	public void devolverLibro(int id) {
		if(this.prestado) {
			System.out.println("Se ha devuelto el libro con id " + id + " a nuestras instalaciones"+"\n");
			this.prestado=false;
		}
		else {
			System.out.println("El libro no está prestado, por lo que no se puede devolver."+"\n");
		}

	}

	public Boolean estaPrestado() {
		return this.prestado;
		
	}
	@Override
	public void getClienteType() {
		// TODO Auto-generated method stub
		
	}



}
