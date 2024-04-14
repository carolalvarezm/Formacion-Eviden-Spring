package es.a926666.iocjava;

public class Libro {
	LibroInterface libro;
	
	public Libro(LibroInterface libro) {
		this.libro = libro;
	}
	public void getPedirLibro(int id) {
		libro.pedirLibro(id);
	}
	public void getDevolverLibro(int id) {
		libro.devolverLibro(id);
	}
}
