package videojuego.enemigos;


public abstract class Enemigos {
    private String nombre;
    private String superPoder;
    private int vida=100;
    private int daño;

    public Enemigos(String nombre, String superPoder, int vida, int daño) {
        this.nombre = nombre;
        this.superPoder = superPoder;
        this.vida = vida;
        this.daño = daño;
    }

    // métodos abstractos
    // public abstract void atacar(int daño);

    public abstract void recibirDaño(int dañoArma);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Enemigos [nombre=" + nombre + ", superPoder=" + superPoder + ", vida=" + vida + "daño"+ daño +"]";
    }

}
