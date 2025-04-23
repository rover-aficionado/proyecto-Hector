package videojuego.armas;

public class Flecha extends Armas {

    public Flecha(String nombre, double daño, int precio, String rareza) {
        super(nombre, daño, precio, rareza);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Flecha{" + '}';
    }
    
}
