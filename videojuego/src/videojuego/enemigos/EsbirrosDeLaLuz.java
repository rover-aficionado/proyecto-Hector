package videojuego.enemigos;


// estos son los enemigos más básicos
public class EsbirrosDeLaLuz extends Enemigos{

    public EsbirrosDeLaLuz(String nombre, String superPoder, double vida, double daño) {
        super(nombre, superPoder, vida, daño);
    }

    @Override
    public void recibirDaño(double dañoArma) {
        super.setVida(super.getVida()-dañoArma);
        
    }

    
}
 