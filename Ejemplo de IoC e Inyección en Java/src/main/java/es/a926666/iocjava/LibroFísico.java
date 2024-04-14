package es.a926666.iocjava;

public class LibroFísico implements LibroInterface {

	@Override
	public void pedirLibro(int id) {
		System.out.println("Se ha pedido el libro con id " + id + " en formato físico. Le llegará a la dirección indicada");
	}

	@Override
	public void devolverLibro(int id) {
		System.out.println("Se ha devuelto el libro con id " + id + " a nuestras instalaciones");
	}

}
