/*@author rober*/

package utils;

import java.util.Random;


public class Aleatorio {
    // genera números aleatorios para poder aleatorizar según que acciones. el tope de números se mete como parámetro
    public int numero(int numeroMax){
        Random rdn = new Random();
        return rdn.nextInt(numeroMax+1);
    }
}
