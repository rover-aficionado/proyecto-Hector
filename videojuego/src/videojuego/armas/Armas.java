package videojuego.armas;

public abstract class Armas {
    private String nombre;
    private double durabilidad = 100;
    private double durabilidadMax = 100;
    private double daño;
    private String material;
    private String rareza;

    public Armas(String nombre, double daño, String material, String rareza) {
        this.nombre = nombre;
        this.daño = daño;
        this.material = material;
        this.rareza = rareza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(double durabilidad) {
        if(durabilidad < 0) {
            this.durabilidad = 0;
        } else if (durabilidad > getDurabilidadMax()) {
            this.durabilidad = getDurabilidadMax();
        } else {
            this.durabilidad = durabilidad;
        }
    }

    public double getDurabilidadMax() {
        return durabilidadMax;
    }

    public void setDurabilidadMax(double durabilidadMax) {
        this.durabilidadMax = durabilidadMax;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", durabilidad=" + durabilidad + ", durabilidadMax=" + durabilidadMax + ", da\u00f1o=" + daño + ", material=" + material + ", rareza=" + rareza + '}';
    }
}