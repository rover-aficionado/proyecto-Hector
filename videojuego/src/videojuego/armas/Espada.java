package videojuego.armas;

public class Espada extends Armas {
    private double durabilidad;

    public Espada(String nombre, double daño, int precio, String rareza, double durabilidad) {
        super(nombre, daño, precio, rareza);
        this.durabilidad = durabilidad;
    }
    
    public double getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(double durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Espada{" + "durabilidad=" + durabilidad + '}';
    }
}
