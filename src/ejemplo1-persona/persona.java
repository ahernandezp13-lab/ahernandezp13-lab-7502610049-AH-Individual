public class persona {
    String nombre;

    public persona() {
        nombre = "Sin nombre";
    }

    public static void main(String[] args) {
        persona p = new persona();
        System.out.println("Nombre: " + p.nombre);
    }
}