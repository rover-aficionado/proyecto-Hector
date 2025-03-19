package videojuego.enemigos;

// padre secretario del señor
public class PadreSecretarioDelSenor extends Enemigos {

    public PadreSecretarioDelSenor(String nombre, String superPoder, int vida, int daño) {
        super(nombre, superPoder, vida, daño);
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
    }

    
}   
