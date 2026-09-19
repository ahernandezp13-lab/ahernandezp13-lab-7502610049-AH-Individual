class coches extends vehiculo {
    String marca;

    public coches(String tipo, String marca) {
        super();
        this.marca = marca;
    }

    public coches() {
        super();
    }

    public coches(String mazda) {
        super();
    }

    public static void main(String[] args) {
        coche c = new coche("Sedán", "Renault");
        System.out.println(c.marca + " - " + c.marca);
    }
}