package videojuego.armas;

public class Hechizo extends Armas{

    public Hechizo(String nombre, double daño, int precio, String rareza) {
        super(nombre, daño, precio, rareza);
    }

    @Override
    public String toString() {
        return super.toString() + " Hechizo{" + '}';
    }
}
