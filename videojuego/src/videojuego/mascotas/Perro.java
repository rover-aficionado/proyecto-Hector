package videojuego.mascotas;

public class Perro extends Mascota {

    public Perro(String nombre, String alias) {
        super(nombre, alias);
    }

    @Override
    public String toString() {
        return super.toString() + " Perro{" + '}';
    }
}
