package videojuego.mascotas;

public class Gato extends Mascota{

    public Gato(String nombre, String alias) {
        super(nombre, alias);
    }

    @Override
    public String toString() {
        return super.toString() + " Gato{" + '}';
    }
}
