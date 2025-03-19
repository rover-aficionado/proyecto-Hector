package videojuego.personajes;

public class Arquero extends Personajes {
    private int flechas;
    private int fuerza = 3;

    public Arquero(String nombre, int vida, int vidaMaxima, int ataque, int energia, int nivelExperiencia, int experiencia, int flechas, int fuerza) {
        super(nombre, vida, vidaMaxima, ataque, energia, nivelExperiencia, experiencia);
        this.flechas = flechas;
        this.fuerza = fuerza;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "Arquero{" +
                "flechas=" + flechas +
                ", fuerza=" + fuerza +
                '}';
    }

    @Override
    public int atacar() {
        if (this.flechas < 0){
            System.out.println("No tienes flechas");
            return 0;
        }else {
            this.setFlechas(this.getFlechas() - 1);
            return (int) (this.getFuerza() * (this.getNivelExperiencia() * 0.50));
        }
    }
}
