package videojuego.armas;


public class Flecha extends Armas{
    private String efecto;
    private double largo;

    public Flecha(String efecto, double largo, String nombre, double daño, String material, String rareza) {
        super(nombre, daño, material, rareza);
        this.efecto = efecto;
        this.largo = largo;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return super.toString() + " Flecha{" + "efecto=" + efecto + ", largo=" + largo + '}';
    }   
}
