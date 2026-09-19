import java.util.Scanner;

public class integrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROYECTO INTEGRADOR: CONSTRUCTORES EN JAVA ===\n");

        // ---------- LIBRO ----------
        System.out.println("--- Objeto Libro (constructor por defecto) ---");
        libro libroDefecto = new libro();
        libroDefecto.mostrarDetalles();

        System.out.println("\n--- Objeto Libro (constructor parametrizado) ---");
        System.out.println("Ingrese el título del libro:");
        String tituloLibro = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autorLibro = scanner.nextLine();
        System.out.println("Ingrese el número de páginas:");
        int paginasLibro = Integer.parseInt(scanner.nextLine());

        libro libroParametrizado = new libro(tituloLibro, autorLibro, paginasLibro);
        libroParametrizado.mostrarDetalles();

        // ---------- CUENTA BANCARIA ----------
        System.out.println("\n--- Objeto CuentaBancaria (constructor por defecto) ---");
        cuentabancaria cuentaDefecto = new cuentabancaria();
        cuentaDefecto.mostrarDetalles();

        System.out.println("\n--- Objeto CuentaBancaria (constructor sobrecargado con 3 parámetros) ---");
        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial:");
        double saldo = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el tipo de cuenta (Ahorros/Corriente):");
        String tipoCuenta = scanner.nextLine();

        cuentabancaria cuentaCompleta = new cuentabancaria(numeroCuenta, saldo, tipoCuenta);
        cuentaCompleta.mostrarDetalles();

        // ---------- ESTUDIANTE ----------
        System.out.println("\n--- Objeto Estudiante (constructor por defecto) ---");
        estudiante estudianteDefecto = new estudiante();
        estudianteDefecto.mostrarDetalles();

        System.out.println("\n--- Objeto Estudiante (constructor con this() y todos los parámetros) ---");
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadEstudiante = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el curso del estudiante:");
        String cursoEstudiante = scanner.nextLine();

        estudiante estudianteCompleto = new estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);
        estudianteCompleto.mostrarDetalles();

        System.out.println("\n=== FIN DEL PROGRAMA ===");
        scanner.close();
    }
}