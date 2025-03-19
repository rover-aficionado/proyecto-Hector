
import videojuego.enemigos.Enemigos;

public class PadreHerederoDeSatan extends Enemigos {

    public PadreHerederoDeSatan(String nombre, String superPoder, int vida, int daño) {
        super(nombre, superPoder, vida, daño);
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
        
    }
    // me pillaba escuchando Ramsttein ;)
    
}
