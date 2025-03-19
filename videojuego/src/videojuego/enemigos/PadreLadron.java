package videojuego.enemigos;

public class PadreLadron extends Enemigos {

    public PadreLadron(String nombre, String superPoder, int vida, int daño) {
        super(nombre, superPoder, vida, daño);
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
    }

    
}
