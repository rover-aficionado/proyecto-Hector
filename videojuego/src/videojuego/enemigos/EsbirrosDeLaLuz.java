
// estos son los enemigos más básicos
public class EsbirrosDeLaLuz extends Enemigos{

    public EsbirrosDeLaLuz(String nombre, String superPoder, int vida, int daño) {
        super(nombre, superPoder, vida, daño);
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
        
    }

    
}
