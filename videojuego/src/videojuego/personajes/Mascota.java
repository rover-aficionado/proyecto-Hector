package personajes;

public class Mascota extends Personajes{
    int fuerza = 1;
    int curacion = 25;

    public Mascota(String nombre, int vida, int vidaMaxima, int ataque, int energia, int nivelExperiencia, int experiencia, int fuerza, int curacion) {
        super(nombre, vida, vidaMaxima, ataque, energia, nivelExperiencia, experiencia);
        this.fuerza = fuerza;
        this.curacion = curacion;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    @Override
    public int atacar() {
        System.out.println("La mascota no puede atacar");
        return 0;
    }
    public void curarCompañero(Personajes p){
        p.setVida(p.getVida() + curacion);
    }
}
