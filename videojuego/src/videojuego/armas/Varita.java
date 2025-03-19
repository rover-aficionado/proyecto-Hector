package videojuego.armas;

import java.util.ArrayList;


public class Varita extends Armas{
    private double largo;
    private ArrayList<String> habilidades;

    public Varita(double largo, ArrayList<String> habilidades, String nombre, double daño, String material, String rareza) {
        super(nombre, daño, material, rareza);
        this.largo = largo;
        this.habilidades = habilidades;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return super.toString() + " Varita{" + "largo=" + largo + ", habilidades=" + habilidades + '}';
    }
}
