package videojuego.armas;


public class Flecha extends Armas{
    
    public Flecha(String nombre, double daño, int precio) {
        super(nombre, daño, precio);
    }

    @Override
    public String toString() {
        return super.toString() + " Flecha{" + '}';
    }
}
