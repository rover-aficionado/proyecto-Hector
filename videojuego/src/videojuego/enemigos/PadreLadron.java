package videojuego.enemigos;

import utils.Aleatorio;

public class PadreLadron extends Enemigos {
    boolean tieneMaza;

    public PadreLadron(String nombre, String superPoder, int vida, int daño, boolean tieneMaza) {
        super(nombre, superPoder, vida, daño);
        this.tieneMaza=tieneMaza;
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
    }

    // golpe especial
    public void tieneGolpeEspecial(){
        Aleatorio al = new Aleatorio();
        if (al.numero(100)<95){
            tieneMaza=true;
        } else {
            tieneMaza=false;
        }
    }
}
