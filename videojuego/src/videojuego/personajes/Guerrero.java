package videojuego.personajes;

public class Guerrero extends Personajes{
    private String armaSecundaria;

    public Guerrero(String armaSecundaria, String nombre) {
        super(nombre);
        this.armaSecundaria = armaSecundaria;
    }

    public String getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(String armaSecundaria) {
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
