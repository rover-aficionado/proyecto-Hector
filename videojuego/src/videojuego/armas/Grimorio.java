package videojuego.armas;


public class Grimorio extends Armas{ //esto es un libro de hechizos. Es un nombre de esos que uno no sabe que existe pero que resulta que exisye
    
    double potenciador; // el potenciador es la habilidad temporal que va a aprender el jugador. como la fuerza extra
    int tiempo; 

    public Grimorio(double potenciador, String nombre, double daño, int precio, int tiempo) {
        super(nombre, daño, precio);
        this.potenciador = potenciador;
        this.tiempo=tiempo;
    }

    public double getPotenciador() {
        return potenciador;
    }

    public void setPotenciador(double potenciador) {
        this.potenciador = potenciador;
    }

    @Override
    public String toString() {
        return "Grimorio{" + "potenciador=" + potenciador + '}';
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
}
