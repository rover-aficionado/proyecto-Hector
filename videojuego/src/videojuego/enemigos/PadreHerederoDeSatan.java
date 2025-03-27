package videojuego.enemigos;
import utils.Aleatorio;
import videojuego.enemigos.Enemigos;

public class PadreHerederoDeSatan extends Enemigos {
    boolean ataqueFinal;

    public PadreHerederoDeSatan(String nombre, String superPoder, double vida, double daño, boolean ataqueFinal) {
        super(nombre, superPoder, vida, daño);
        this.ataqueFinal=ataqueFinal;
        
    }
    
    // definir si el personaje tiene ataque final. esto ocurre con una posibilidad del 1%
    public void tieneAtaque(){
        Aleatorio al = new Aleatorio();
        
        if(al.numero(100)<99){
            super.setDaño(100); // daño al máximo
        }
    }
    
    // me pillaba escuchando Ramsttein ;)
    
}
