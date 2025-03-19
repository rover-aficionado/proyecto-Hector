package videojuego.armas;

public class Espada extends Armas {
    private double largo;

    public Espada(double largo, String nombre, double daño, String material, String rareza) {
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
        return super.toString() + " Espada{" + "largo=" + largo + '}';
    }
}