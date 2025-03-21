package videojuego;

import java.util.*;
import utils.Toolbox;
import videojuego.personajes.*;

/*
 * @author rober, valen, alex
 * "los p*tos amos"
 */
public class Videojuego {
    // CACHARREAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> partidas = new HashMap<>();
        ArrayList<Personajes> personajes = new ArrayList<>();
        Toolbox tb = new Toolbox();
        String opcion;
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Bienvenido a Legends of Valor");
        System.out.println("1. Nueva Partida");
        System.out.println("2. Reaunudar Partida");
        System.out.println("3. Ver Ganadores");
        System.out.println("4. Salir del juego");
        System.out.println("-------------------------------------------------------------");
        
        opcion = sc.nextLine();
        
        while (true) {
            if (opcion.equalsIgnoreCase("1")){
                System.out.println("-------------------------------------------------------------");
                System.out.println("Selecciona tu personaje:");
                System.out.println("1. Guerrero");
                System.out.println("2. Mago");
                System.out.println("3. Arquero");
                
                opcion = sc.nextLine();
                
                System.out.println("Introduce tu nombre:");
                String nombreJugador = sc.nextLine().trim().toLowerCase();
                
                System.out.println("-------------------------------------------------------------");
                if (opcion.equalsIgnoreCase("1")) {
                    Guerrero g = new Guerrero(nombreJugador,1, 100, 0);
                    personajes.add(g);
                    
                    
                }else if (opcion.equalsIgnoreCase("2")) {
                    Arquero a = new Arquero(5, nombreJugador, 1, 100, 0);
                    personajes.add(a);
                }else if (opcion.equalsIgnoreCase("3")) {
                    Mago m = new Mago(10, nombreJugador, 1, 100, 0);
                    personajes.add(m);
                }else{
                    System.out.println("Opcion incorrecta. Elige entre guerrero, arquero o mago");
                }
                //escribir csv con los datos de la partida
                System.out.println("Personaje creado correctamente");
                System.out.println("Generando mundo...");
                tb.introduccion(personajes);
                
            } else if (opcion.equalsIgnoreCase("2")) {

<<<<<<< HEAD
            }else if (opcion.equalsIgnoreCase("3")){

=======
                
            } else if(opcion.equalsIgnoreCase("3")) {
               
>>>>>>> 9d213146ff681ccf16fc636d1d18df99037b3ebd
            } else if (opcion.equalsIgnoreCase("4")) {
                System.out.println("Saliendo del juego.....");
                System.exit(0);
            }else {
                System.out.println("Opcion incorrecta, introduce opcion entre 1,2,3,4");
            }
        }
    }
}
