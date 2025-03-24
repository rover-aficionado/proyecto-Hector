package videojuego.personajes;

public class Arquero extends Personajes {
    private int flechas;

    public Arquero(int flechas, String nombre, double fuerza, double energia, int moneda, int curacion, int fortuna) {
        super(nombre, fuerza, energia, moneda, curacion, fortuna);
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
