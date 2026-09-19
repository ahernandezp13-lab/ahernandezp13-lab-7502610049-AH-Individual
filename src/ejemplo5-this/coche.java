public class coche {
    String marca;
    String modelo;

    public coche(String marca) {
        this.marca = marca;
    }

    public coche(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public coche() {

    }

    public static void main(String[] args) {
        coche c = new coche("Chevrolet", "Spark");
        System.out.println(c.marca + " " + c.marca);
    }
}