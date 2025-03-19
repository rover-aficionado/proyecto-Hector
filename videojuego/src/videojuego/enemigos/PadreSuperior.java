package videojuego.enemigos;

public class PadreSuperior extends Enemigos {

    public PadreSuperior(String nombre, String superPoder, int vida, int daño) {
        super(nombre, superPoder, vida, daño);

    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida() - dañoArma);

    }
}
