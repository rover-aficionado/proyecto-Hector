package videojuego;

import java.util.*;
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

        while (true){
            System.out.println("Bienvenido a Legends of Valor");
            System.out.println("1. Nueva Partida");
            System.out.println("2. Reaunudar Partida");
            System.out.println("3. Ver Ganadores");
            System.out.println("4. Salir del juego");

            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("1")){
                System.out.println("Elige tu personaje entre guerrero, arquero o mago");
                opcion = sc.nextLine().trim();
                System.out.println("Nombre del jugador");
                String nombreJugador = sc.nextLine();
                System.out.println("Alias del jugador");
                String aliasJuagdor = sc.nextLine();
                if (opcion.equalsIgnoreCase("guerrero")) {
                    Guerrero g = new Guerrero(nombreJugador,1, 100, 0);
                    personajes.add(g);
                }else if (opcion.equalsIgnoreCase("arquero")) {
                    Arquero a = new Arquero(5, nombreJugador, 1, 100, 0);
                    personajes.add(a);
                }else if (opcion.equalsIgnoreCase("mago")) {
                    Mago m = new Mago(10, nombreJugador, 1, 100, 0);
                    personajes.add(m);
                }else{
                    System.out.println("Opcion incorrecta. Elige entre guerrero, arquero o mago");
                }
                //escribir csv con los datos de la partida
                System.out.println("Personaje creado correctamente");
            } else if (opcion.equalsIgnoreCase("2")) {
                System.out.println("Nombre de la partida anterior: ");
                String nombreJugador = sc.nextLine();
                if (partidas.containsKey(nombreJugador)) {
                    // leer csv con los datos de la partida
                }
            }else if (opcion.equalsIgnoreCase("3")){
                // leer csv ganadores
            } else if (opcion.equalsIgnoreCase("4")) {
                System.out.println("Saliendo del programa");
                System.exit(0);
            }else {
                System.out.println("Opcion incorrecta, introduce opcion entre 1,2,3,4");
            }
        }
    }
}
