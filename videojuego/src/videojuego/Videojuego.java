package videojuego;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.*;
import videojuego.personajes.*;
import videojuego.armas.*;

/*
 * @author rober, valen, alex
 * "los p*tos amos"
 */
public class Videojuego {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personajes> personajes = new ArrayList<>();
        Toolbox tb = new Toolbox();
        Textos t = new Textos();
        Juego j = new Juego();
        String opcion;
        GuardarDB gdb = new GuardarDB();
        ArrayList<Armas> equipo = new ArrayList<>();
        Objetos o = new Objetos();
        o.crearObjetos();
        
        // menú principal
        t.inicio();
        opcion = sc.nextLine();
        
        while (true) {
            if (opcion.equalsIgnoreCase("1")){ // selección de personajes
                t.seleccionPersonaje();
                opcion = sc.nextLine();
                
                // inicio de personajes
                System.out.println("Introduce tu nombre:");
                String nombreJugador = sc.nextLine().trim().toLowerCase();
                
                System.out.println("-------------------------------------------------------------");
                // instancia el personaje según su tipo
                if (opcion.equalsIgnoreCase("1")) { // guerrero
                    Personajes g = new Guerrero(nombreJugador, 100, 100, 1, 100, 0);
                    personajes.add(g);
                    gdb.guardarPartida(g); // guardar la partida
                    j.jugar(g, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc, o);
                }else if (opcion.equalsIgnoreCase("3")) {
                    Arquero a = new Arquero(5, nombreJugador, 100, 100, 1, 100, 0);
                    personajes.add(a);
                    gdb.guardarPartida(a); // guardar partida
                    j.jugar(a, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc, o);
                    
                }else if (opcion.equalsIgnoreCase("2")) { // mago
                    Personajes m = new Mago(10, nombreJugador, 100, 100, 1, 100, 0);
                    personajes.add(m);
                    gdb.guardarPartida(m); // guardar la partida
                    j.jugar(m, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc,o);
                }else{
                    System.out.println("Opcion incorrecta. Elige entre guerrero, arquero o mago");
                    return;
                }
                //escribir txt con los datos de la partida
                System.out.println("Personaje creado correctamente");
                System.out.println("Generando mundo...");
                tb.introduccion(personajes);
                
            } else if (opcion.equalsIgnoreCase("2")) { // reanudar partida
                gdb.verPartidasGuardadas();
                String nombre = sc.next().trim();
                gdb.cargarPartida(nombre);
                break;
            }else if(opcion.equalsIgnoreCase("3")) { // ver ganadores
                
            } else if (opcion.equalsIgnoreCase("4")) { // salir del juego
                System.out.println("Saliendo del juego.....");
                System.exit(0);
            }else {
                System.out.println("Opcion incorrecta, introduce opcion entre 1,2,3,4");
                t.inicio();
            }
        }
    }
}
