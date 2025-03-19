public abstract class Armas {
    private String nombre;
    private double durabilidad = 100;
    private double daño;

    public Armas(String nombre, double daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDurabilidad() {
        return this.durabilidad;
    }
    public void setDurabilidad(double durabilidad) {
        if(durabilidad < 0) {
            this.durabilidad = 0;
        } else {
            this.durabilidad =  durabilidad;
        }
    }

    public double getDaño() {
        return this.daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", durabilidad='" + getDurabilidad() + "'" +
                ", daño='" + getDaño() + "'" +
                "}";
    }
}
