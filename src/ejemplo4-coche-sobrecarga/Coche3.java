public class Coche3 {
    String marca;
    String modelo;

    public Coche3() {
        this.marca = "Desconocida";
    }

    public Coche3(String marca) {
        this.marca = marca;
    }

    public Coche3(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        coche c1 = new coche();
        coche c2 = new coche("Mazda");
        coche c3 = new coche("Ford", "Fiesta");
        System.out.println(c1.marca);
        System.out.println(c2.marca);
        System.out.println(c3.marca + " " + c3.marca);
    }
}