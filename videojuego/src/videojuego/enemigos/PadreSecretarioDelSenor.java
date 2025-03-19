package videojuego.enemigos;

// padre secretario del señor

import utils.Aleatorio;

public class PadreSecretarioDelSenor extends Enemigos {
    private boolean vaDarInfo;

    public PadreSecretarioDelSenor(String nombre, String superPoder, int vida, int daño, boolean vaDarInfo) {
        super(nombre, superPoder, vida, daño);
        this.vaDarInfo=vaDarInfo;
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
    }
    
    // método que verifica si el secretario va a dar la indormación al siguiente enemigo
    public boolean darInfo(){
        Aleatorio al = new Aleatorio();
        
        if(al.numero(100)>98){
            return true;
        }
        return false;
    }

    public boolean getVaDarInfo() {
        return vaDarInfo;
    }
    
    
    
}   
