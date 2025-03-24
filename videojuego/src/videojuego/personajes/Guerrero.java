package videojuego.personajes;

public class Guerrero extends Personajes{
    private String armaSecundaria;
    
    public Guerrero(String nombre, double fuerza, double energia, int moneda, int curacion, int fortuna) {
        super(nombre, fuerza, energia, moneda, curacion, fortuna);
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
    public int atacar() {
        return (int)(this.getFuerza() * (this.getNivelExperiencia() * 0.50));
    }
}
