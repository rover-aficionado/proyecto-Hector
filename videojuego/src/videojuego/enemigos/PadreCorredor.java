package videojuego.enemigos;

import utils.Aleatorio;


public class PadreCorredor extends Enemigos {
    int velocidadEsquive = 0;

    public PadreCorredor(String nombre, String superPoder, double vida, double daño, int velocidadEsquive) {
        super(nombre, superPoder, vida, daño);
        this.velocidadEsquive=velocidadEsquive;
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
