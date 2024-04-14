package es.a926666.iocjava;

public class app {

	public static void main(String[] args) {
		Libro libro = new Libro(new Ebook());
		libro.getPedirLibro(122);
		libro.getDevolverLibro(122);
	}

}
