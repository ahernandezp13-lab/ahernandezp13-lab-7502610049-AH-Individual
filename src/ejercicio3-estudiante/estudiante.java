public class estudiante {
    String nombre;
    int edad;
    String curso;

    // Constructor por defecto: asigna valores genéricos
    public estudiante() {
        this("Sin nombre", 0, "Sin curso asignado");
    }

    // Constructor con nombre y edad, usa this() para completar con un curso por defecto
    public estudiante(String nombre, int edad) {
        this(nombre, edad, "Sin curso asignado");
    }

    // Constructor que acepta todos los parámetros
    public estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarDetalles() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
    }
}