package videojuego.armas;


public class Flecha {
    private String nombre;
    private double daño;

    public Flecha(String nombre, double daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Flecha{" + "nombre=" + nombre + ", da\u00f1o=" + daño + '}';
    }  
}
