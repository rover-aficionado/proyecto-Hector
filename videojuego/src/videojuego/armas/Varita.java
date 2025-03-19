package videojuego.armas;


public class Varita extends Armas{
    private double largo;
    private String efecto;

    public Varita(double largo, String efecto, String nombre, double daño, String material, String rareza) {
        super(nombre, daño, material, rareza);
        this.largo = largo;
        this.efecto = efecto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return super.toString() + " Varita{" + "largo=" + largo + ", efecto=" + efecto + '}';
    }
}
