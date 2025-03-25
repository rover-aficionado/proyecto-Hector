package videojuego;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.CargarGuardarPartida;
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
        
        // menú principal
        System.out.println("-------------------------------------------------------------");
        System.out.println("Bienvenido a Legends of Valor");
        System.out.println("1. Nueva Partida");
        System.out.println("2. Reaunudar Partida");
        System.out.println("3. Ver Ganadores");
        System.out.println("4. Salir del juego");
        System.out.println("-------------------------------------------------------------");
        
        opcion = sc.nextLine();
        
        while (true) {
            CargarGuardarPartida cgp = new CargarGuardarPartida();
            if (opcion.equalsIgnoreCase("1")){ // selección de personajes
                System.out.println("-------------------------------------------------------------");
                System.out.println("Selecciona tu personaje:");
                System.out.println("1. Guerrero");
                System.out.println("2. Mago");
                System.out.println("3. Arquero");
                
                opcion = sc.nextLine();
                
                // inicio de personajes
                System.out.println("Introduce tu nombre:");
                String nombreJugador = sc.nextLine().trim().toLowerCase();
                
                System.out.println("-------------------------------------------------------------");
                // instancia el personaje según su tipo
                if (opcion.equalsIgnoreCase("1")) {
                    Personajes g = new Guerrero(nombreJugador,1, 100, 0,0,0);
                    personajes.add(g);
                    
                    //guardado de las partidas
                    try {
                        cgp.guardarPartida(g);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Videojuego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }else if (opcion.equalsIgnoreCase("3")) {
                    Personajes a = new Arquero(5, nombreJugador, 1, 100, 0,0,0);
                    personajes.add(a);
                    // guardado de las partidas
                    try {
                        cgp.guardarPartida(a);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Videojuego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }else if (opcion.equalsIgnoreCase("2")) {
                    Personajes m = new Mago(10, nombreJugador, 1, 100, 0,0,0);
                    personajes.add(m);
                    
                    // guardado de las partidas
                    try {
                        cgp.guardarPartida(m);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Videojuego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }else{
                    System.out.println("Opcion incorrecta. Elige entre guerrero, arquero o mago");
                }
                //escribir txt con los datos de la partida
                System.out.println("Personaje creado correctamente");
                System.out.println("Generando mundo...");
                tb.introduccion(personajes);
                
            } else if (opcion.equalsIgnoreCase("2")) { 
                System.out.println("nombre del personaje");
                String nombre = sc.nextLine();
               cgp.cargarPartida(nombre);
            }else if(opcion.equalsIgnoreCase("3")) {
                
            } else if (opcion.equalsIgnoreCase("4")) {
                System.out.println("Saliendo del juego.....");
                System.exit(0);
            }else {
                System.out.println("Opcion incorrecta, introduce opcion entre 1,2,3,4");
            }
        }
    }
}
