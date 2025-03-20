
import utils.Aleatorio;
import videojuego.enemigos.Enemigos;

public class PadreHerederoDeSatan extends Enemigos {
    boolean ataqueFinal;

    public PadreHerederoDeSatan(String nombre, String superPoder, double vida, double daño, boolean ataqueFinal) {
        super(nombre, superPoder, vida, daño);
        this.ataqueFinal=ataqueFinal;
        
    }

    @Override
    public void recibirDaño(double dañoArma) {
        super.setVida(super.getVida()-dañoArma);
        
    }
    
    // definir si el personaje tiene ataque final
    public void tieneAtaque(){
        Aleatorio al = new Aleatorio();
        
        if(al.numero(100)<99){
            super.setDaño(100);
        }
    }
    
    // me pillaba escuchando Ramsttein ;)
    
}
