package videojuego;

import java.util.*;

/*
 * @author rober, valen, alex
 * "los p*tos amos"
 */
public class Videojuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> partidas = new HashMap<>();

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
                if (opcion.equalsIgnoreCase("guerrero")) {
                    
                }else if (opcion.equalsIgnoreCase("arquero")) {
                    
                }else if (opcion.equalsIgnoreCase("mago")) {
                    
                }else{
                    System.out.println("Opcion incorrecta. Elige entre guerrero, arquero o mago");
                }
                System.out.println("Nombre del jugador");
                String nombreJugador = sc.nextLine();
                System.out.println("Alias del jugador");
                String aliasJuagdor = sc.nextLine();
                //escribir csv
                System.out.println("Personaje creado correctamente");
            } else if (opcion.equalsIgnoreCase("2")) {
                System.out.println("Nombre de la partida anterior: ");
                String nombreJugador = sc.nextLine();
                if (partidas.containsKey(nombreJugador)) {
                    // leer csv
                }else if (opcion.equalsIgnoreCase("3")){
                    // leer csv ganadores
                }
            } else if (opcion.equalsIgnoreCase("4")) {
                System.out.println("Saliendo del programa");
                System.exit(0);
            }else {
                System.out.println("Opcion incorrecta, introduce opcion entre 1,2,3,4");
            }
        }
    }
}
