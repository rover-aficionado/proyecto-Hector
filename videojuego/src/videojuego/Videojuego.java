package videojuego;

import java.io.FileNotFoundException;
import java.util.*;
import utils.*;
import videojuego.armas.*;
import videojuego.personajes.*;

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
        String opcion = "";
        GuardarDB gdb = new GuardarDB();
        ArrayList<Armas> equipo = new ArrayList<>();
        Objetos o = new Objetos();
        o.crearObjetos();
        
        // menú de bienvenida.
        while(!opcion.equals("4")){
            t.inicio();
            opcion = sc.nextLine();
            
            switch (opcion) {
                case "1": // seleccion de los personajes
                    t.seleccionPersonaje();
                    opcion = sc.nextLine();
                
                    // inicio de personajes
                    System.out.println("Introduce tu nombre:");
                    String nombreJugador = sc.nextLine().trim().toLowerCase();

                    System.out.println("-------------------------------------------------------------");
                        switch (opcion) {
                        case "1": // personaje guerrero
                            Personajes g = new Guerrero(nombreJugador, 100, 100, 1, 100, 0);
                            personajes.add(g);
                            gdb.guardarPartida(g); // guardar la partida
                            j.jugar(g, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc, o);
                            break;
                        case "2": // personaje mago
                            Personajes m = new Mago(10, nombreJugador, 100, 100, 1, 100, 0);
                            personajes.add(m);
                            gdb.guardarPartida(m); // guardar la partida
                            j.jugar(m, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc,o);
                            break;
                        case "3": // personaje arquero
                            Arquero a = new Arquero(5, nombreJugador, 100, 100, 1, 100, 0);
                            personajes.add(a);
                            gdb.guardarPartida(a); // guardar partida
                            j.jugar(a, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc, o);
                        default:
                            System.out.println("ERROR: opcion no válida");
                            throw new AssertionError();
                            }
                    break;
                case "2": // reanudar partida usando un personaje guardado
                    gdb.verPartidasGuardadas();
                    String nombre = sc.next().trim();
                    Personajes nuevoPersonaje = gdb.cargarPartida(nombre);
                    j.jugar(nuevoPersonaje, j.generarEnemigoAleatorio(), personajes, equipo, tb, sc, o);
                case "3": // ver ganadores
                    //System.out.println("funcionalidad no terminada");
                    gdb.mejoresPersonajes();
                    break;
                case "4":
                    System.out.println("saliendo del juego, Adios");
                    break;
                default:
                    System.out.println("ERROR: opcion no válida");
            }
        }        
    }
}
