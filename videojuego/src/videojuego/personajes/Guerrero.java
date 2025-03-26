package videojuego.personajes;

public class Guerrero extends Personajes{
    private boolean armaSecundaria;

    public Guerrero(boolean armaSecundaria, String nombre) {
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

    @Override
    public double atacar() {
        return getFuerza() * (getNivelExperiencia() * 0.50);
    }
}
