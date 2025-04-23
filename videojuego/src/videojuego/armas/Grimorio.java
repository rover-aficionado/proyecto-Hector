package videojuego.armas;

import java.util.ArrayList;

public class Grimorio extends Armas {
    private ArrayList<Hechizo> hechizos;

    public Grimorio(String nombre, double daño, int precio, String rareza) {
        super(nombre, daño, precio, rareza);
        this.hechizos = new ArrayList<>();
    }
    
    public void agregarHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
    }
    
    public ArrayList<Hechizo> getHechizos() {
        return hechizos;
    }
    
    public void setHechizos(ArrayList<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Grimorio{" + "hechizos=" + hechizos + '}';
    }
}