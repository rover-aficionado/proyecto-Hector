public class Espada extends Armas {
    private double largo;
    private String material;

    public Espada(String nombre, double durabilidad, double daño, double largo, String material) {
        super(nombre, durabilidad, daño);
        this.largo = largo;
        this.material = material;
    }

}