package videojuego.personajes;

public class Guerrero extends Personajes{
    private boolean armaSecundaria;

    public Guerrero(String nombre, double fuerza, double energia, int moneda, int curacion, int fortuna) {
        super(nombre);
        this.armaSecundaria = armaSecundaria;
    }

    public boolean getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(boolean armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    @Override
    public String toString() {
        return super.toString() + " Guerrero{" + "armaSecundaria=" + armaSecundaria + '}';
    }

    public double atacar() {
        return getFuerza() + (getNivelExperiencia() * 0.50);
    }
}
