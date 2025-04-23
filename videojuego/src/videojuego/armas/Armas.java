package videojuego.armas;

public abstract class Armas {
    private String nombre;
    private double daño;
    private int precio;
    private String rareza;

    public Armas(String nombre, double daño, int precio, String rareza) {
        this.nombre = nombre;
        this.daño = daño;
        this.precio = precio;
        this.rareza = rareza;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", da\u00f1o=" + daño + ", precio=" + precio + ", rareza=" + rareza + '}';
    }    
}