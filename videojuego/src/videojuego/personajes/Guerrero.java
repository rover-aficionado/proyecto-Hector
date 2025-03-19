package videojuego.personajes;

public class Guerrero extends Personajes{
    private int fuerza = 5;

    public Guerrero(String nombre, int vida, int vidaMaxima, int ataque, int energia, int nivelExperiencia, int experiencia, int fuerza) {
        super(nombre, vida, vidaMaxima, ataque, energia, nivelExperiencia, experiencia);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "Guerrero{" +
                "fuerza=" + fuerza +
                '}';
    }

    @Override
    public int atacar() {
        return (int) (this.getFuerza() * (this.getNivelExperiencia() * 0.50));
    }
}
