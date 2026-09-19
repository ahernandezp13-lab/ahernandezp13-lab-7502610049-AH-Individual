public class libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // Constructor por defecto
    public libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
    }
}