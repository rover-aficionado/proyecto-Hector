package videojuego.armas;


public class Arco extends Armas{
    private int flechasDisparo;

    public Arco(int flechasDisparo, String nombre, double daño, String material, String rareza) {
        super(nombre, daño, material, rareza);
        this.flechasDisparo = flechasDisparo;
    }

    public int getFlechasDisparo() {
        return flechasDisparo;
    }

    public void setFlechasDisparo(int flechasDisparo) {
        this.flechasDisparo = flechasDisparo;
    }

    @Override
    public String toString() {
        return super.toString() + " Arco{" + "flechasDisparo=" + flechasDisparo + '}';
    }
}
