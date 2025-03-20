package videojuego.enemigos;

public class PadreSuperior extends Enemigos {
    PadreSecretarioDelSenor psds;
    
    public PadreSuperior(String nombre, String superPoder, double vida, double daño, PadreSecretarioDelSenor psds) {
        super(nombre, superPoder, vida, daño);
        // verifica si tiene el golpe especial, si lo tiene duplica el daño de sus golpes
        this.psds=psds;
        
        if(psds.getVaDarInfo()){
            super.setDaño(super.getDaño()*2);
        }
        
        

    }

    @Override
    public void recibirDaño(double dañoArma) {
        super.setVida(super.getVida() - dañoArma);

    }
}
