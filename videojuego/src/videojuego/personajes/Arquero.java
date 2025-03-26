package videojuego.personajes;

public class Arquero extends Personajes {
    private int flechas;

    public Arquero(int flechas, String nombre, double fuerza, double energia, int moneda, int curacion, int fortuna1) {
        super(nombre);
        this.flechas = flechas;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    @Override
    public String toString() {
        return super.toString() + "Arquero{" +
                "flechas=" + flechas +
                '}';
    }

    @Override
    public double atacar() {
        if (this.flechas < 0){
            System.out.println("No tienes flechas");
            return 0;
        }else {
            setFlechas(getFlechas() - 1);
            return getFuerza() * (getNivelExperiencia() * 0.50);
        }
    }
}
