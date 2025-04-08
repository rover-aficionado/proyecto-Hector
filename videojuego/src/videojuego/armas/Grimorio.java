package videojuego.armas;


public class Grimorio extends Armas{
    
    public Grimorio(String nombre, double daño, int precio) {
        super(nombre, daño, precio);
    }

    @Override
    public String toString() {
        return super.toString() + " Grimorio{" + '}';
    }
    
}
