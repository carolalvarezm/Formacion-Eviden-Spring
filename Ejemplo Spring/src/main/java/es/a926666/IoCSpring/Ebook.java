package es.a926666.IoCSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ebook implements LibroInterface {

	private Boolean prestado;
	@Autowired
	@Qualifier("conCuentaAplicacion")
	private ClienteTypeInterface cliente;
	
	public Ebook() {
		prestado=false;
	}
	

	@Override
	public void pedirLibro(int id) {
		if(!this.prestado) {
			System.out.println("Tipo de Cliente: "+this.cliente.getClienteType());
			System.out.println("Se ha pedido el libro con id " + id + " a su biblioteca electrónica.");
			System.out.println("Debe ser devuelto en : "+this.cliente.getdias()+" días \n");
			this.prestado=true;
		}
		else {
			System.out.println("El libro ya se encuentra prestado"+"\n");
			
		}
	}

	@Override
	public void devolverLibro(int id) {
		if(this.prestado) {
			System.out.println("Se ha devuelto el libro con id " + id + " a nuestra biblioteca electrónica"+"\n");
			this.prestado=false;
		}
		else {
			System.out.println("El libro no está prestado, por lo que no se puede devolver."+"\n");
		}

	}


	@Override
	public void getClienteType() {
		// TODO Auto-generated method stub
		
	}
	
	


}
