package videojuego.armas;

public class Varita extends Armas{
    private double largo;

    public Varita(double largo, String nombre, double daño, String material, String rareza) {
        super(nombre, daño, material, rareza);
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return super.toString() + " Varita{" + "largo=" + largo + '}';
    }
}
