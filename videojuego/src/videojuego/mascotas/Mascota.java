package videojuego.mascotas;

import videojuego.personajes.Personajes;


public abstract class Mascota {
    private String nombre;
    private String alias;
    private double vida;
    private double vidaMax;
    private String efectos;
    private int nivel;
    private double exp = 0;

    public Mascota(String nombre, String alias, double vida, double vidaMax, String efectos, int nivel) {
        this.nombre = nombre;
        this.alias = alias;
        this.vida = vida;
        this.vidaMax = vidaMax;
        this.efectos = efectos;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if (vida > getVidaMax()) {
            this.vida = getVidaMax();
        } else if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public double getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(double vidaMax) {
        this.vidaMax = vidaMax;
    }

    public String getEfectos() {
        return efectos;
    }

    public void setEfectos(String efectos) {
        this.efectos = efectos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", alias=" + alias + ", vida=" + vida + ", vidaMax=" + vidaMax + ", efectos=" + efectos + ", nivel=" + nivel + ", exp=" + exp + '}';
    }
    
    public abstract void aplicarEfecto(Personajes p);
}
