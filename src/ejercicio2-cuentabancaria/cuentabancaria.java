public class cuentabancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // Constructor por defecto
    public cuentabancaria() {
        this.numeroCuenta = "0000-0000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor parametrizado con dos parámetros
    public cuentabancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    // Constructor sobrecargado con tres parámetros
    public cuentabancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = validarSaldo(saldo);
        this.tipoCuenta = tipoCuenta;
    }

    // Validación de datos en el constructor: el saldo no puede ser negativo
    private double validarSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo inválido, se asigna 0.0 por defecto.");
            return 0.0;
        }
        return saldo;
    }

    public void mostrarDetalles() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo
                + ", tipoCuenta=" + tipoCuenta + "]";
    }
}