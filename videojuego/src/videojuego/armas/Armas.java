package videojuego.armas;

public abstract class Armas {
    private String nombre;
    private double daño;
    private int precio;

    public Armas(String nombre, double daño, int precio) {
        this.nombre = nombre;
        this.daño = daño;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", da\u00f1o=" + daño + ", precio=" + precio + '}';
    }

    
}