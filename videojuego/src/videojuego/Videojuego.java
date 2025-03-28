package videojuego;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.*;
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
        CargarGuardarPartida cgp = new CargarGuardarPartida();

        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Bienvenido a Legends of Valor");
            System.out.println("1. Nueva Partida");
            System.out.println("2. Reanudar Partida");
            System.out.println("3. Ver Ganadores");
            System.out.println("4. Salir del juego");
            System.out.println("-------------------------------------------------------------");

            String opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1": // Nueva Partida
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Selecciona tu personaje:");
                    System.out.println("1. Guerrero");
                    System.out.println("2. Mago");
                    System.out.println("3. Arquero");
                    System.out.println("-------------------------------------------------------------");

                    String seleccion = sc.nextLine().trim();
                    System.out.println("Introduce tu nombre:");
                    String nombreJugador = sc.nextLine().trim().toLowerCase();

                    Personajes jugador = null;

                    if (seleccion.equals("1")) {
                        jugador = new Guerrero(nombreJugador, 100, 100, 1, 100, 0);
                    } else if (seleccion.equals("2")) {
                        jugador = new Mago(10, nombreJugador, 100, 100, 1, 100, 0);
                    } else if (seleccion.equals("3")) {
                        jugador = new Arquero(5, nombreJugador, 100, 100, 1, 100, 0);
                    } else {
                        System.out.println("Opción incorrecta. Debes elegir entre 1 (Guerrero), 2 (Mago) o 3 (Arquero).");
                        continue;
                    }

                    personajes.add(jugador);

                    try {
                        cgp.guardarPartida(jugador);
                        System.out.println("Personaje creado y partida guardada correctamente.");
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Videojuego.class.getName()).log(Level.SEVERE, "Error al guardar la partida", ex);
                    }

                    System.out.println("Generando mundo...");
                    tb.introduccion(personajes);

                    // Iniciar el juego con el personaje creado
                    Juego.jugar(jugador, Juego.generarEnemigoAleatorio(), personajes);
                    break;

                case "2": // Reanudar Partida
                    System.out.println("Introduce el nombre del personaje:");
                    String nombre = sc.nextLine().trim();

                    cgp.cargarPartida(nombre);
                    break;

                case "3": // Ver ganadores
                    System.out.println("Funcionalidad de ganadores aún no implementada.");
                    break;

                case "4": // Salir del juego
                    System.out.println("Saliendo del juego...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción incorrecta, introduce un número entre 1 y 4.");
            }
        }
    }
}
