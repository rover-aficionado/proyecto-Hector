package videojuego.armas;


public class Grimorio extends Armas{ //esto es un libro d ehechizos. Es un nombre de esos que uno no sabe que existe pero que resulta que exisye
    
    public Grimorio(String nombre, double daño, int precio) {
        super(nombre, daño, precio);
    }

    @Override
    public String toString() {
        return super.toString() + " Grimorio{" + '}';
    }
    
}
