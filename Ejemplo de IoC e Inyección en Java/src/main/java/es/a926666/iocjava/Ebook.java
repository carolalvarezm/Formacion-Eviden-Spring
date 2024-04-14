package es.a926666.iocjava;

public class Ebook implements LibroInterface {

	@Override
	public void pedirLibro(int id) {
		System.out.println("Se ha pedido el libro con id " + id + " a su biblioteca electrónica.");

	}

	@Override
	public void devolverLibro(int id) {
		System.out.println("Se ha devuelto el libro con id " + id + " a nuestra biblioteca electrónica");
	}

}
