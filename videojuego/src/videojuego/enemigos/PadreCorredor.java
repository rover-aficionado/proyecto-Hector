package videojuego.enemigos;

import utils.Aleatorio;


public class PadreCorredor extends Enemigos {
    int velocidadEsquive = 0;

    public PadreCorredor(String nombre, String superPoder, int vida, int daño, int velocidadEsquive) {
        super(nombre, superPoder, vida, daño);
        this.velocidadEsquive=velocidadEsquive;
    }

    @Override
    public void recibirDaño(int dañoArma) {
        // en caso de que el enemigo tenga habilidad de esquive se resta al daño del arma
        if(velocidadEsquive>80){
            dañoArma=dañoArma-velocidadEsquive;
        }
        
        super.setVida(super.getVida()-dañoArma);
        
    }
    
    // define la haabilidad de la velocidad del esquive de este enemigo
    public void esquive(){
        Aleatorio al = new Aleatorio();
        int numero = al.numero(100);
        if(numero>80){
            velocidadEsquive=numero;
        }
    }
    
}
