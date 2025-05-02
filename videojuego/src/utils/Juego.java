package utils;

import videojuego.enemigos.*;
import videojuego.personajes.*;
import videojuego.armas.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Clase donde estarán todos los metodos que servirán para el juego en si
public class Juego {
    Textos t = new Textos();
    GuardarDB gdb = new GuardarDB();
    
    // Metodo principal para el juego
    public void jugar(Personajes jugador, Enemigos enemigo, ArrayList<Personajes> personajes, ArrayList<Armas> equipo, Toolbox tb, Objetos o) throws FileNotFoundException {
        boolean jugando = true;
        Aleatorio a = new Aleatorio();
        GuardarDB gdb = new GuardarDB();
        Scanner sc = new Scanner(System.in);
        
        tb.introduccion(personajes);
        while (jugando != false) {
            t.menuJuego();
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1": // menu MUNDO
                    boolean enMundo = true;
                    while (enMundo != false){
                        t.menuMundo();
                        String opcionMundo = sc.nextLine();
                        switch (opcionMundo) {
                            case "1": // explorar cueva 
                                System.out.println("Explorando la cueva...");
                                System.out.println("¡Apareció un enemigo!");
                                Enemigos nuevoEnemigo = new EsbirrosDeLaLuz("Esbirros de la luz", "100", 100, a.numero(10));
                                enfrentarEnemigo(jugador, nuevoEnemigo, tb, sc);
                                break;
                            case "2": // enfrentar al jefe final
                                enfrentarEnemigo(jugador, enemigo, tb, sc);
                                break;
                            case "3": // tienda de armas
                                tb.tiendaArmas(personajes, sc, equipo, o);
                                break;
                            case "4": // tienda de mascotas
                                tb.tiendaMascotas(personajes, sc);
                                break;
                            case "5": // abrir el menú MENÚ
                                enMundo = false;
                                break;
                            default:
                                System.out.println("opcion"+opcion);
                                System.out.println("Valor no válido, intente otra vez");
                        }
                    }
                    break;
                case "2": // mostrar info del jugador
                    mostrarEstado(jugador);
                    break;
                case "3": // guardar partida
                    gdb.guardarPartida(jugador);
                    break;
                case "4": // sale al menú de crear personaje
                    System.out.println("Regresando al menú principal...");
                    jugando = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    
    // Metodo para enfrentar a un enemigo
    public void enfrentarEnemigo(Personajes jugador, Enemigos enemigo, Toolbox tb, Scanner sc) {
        String opcion = "1";
        
        while (opcion != "2") {
        	System.out.println("======================================");
            System.out.println("Tu vida: " + jugador.getVida());
            System.out.println(enemigo.getNombre() + " vida: " + enemigo.getVida());
            System.out.println("1. Atacar");
            System.out.println("2. Huir");
            System.out.print("Elige: ");
            opcion = sc.nextLine();

            switch (opcion) {
            	case "1":
	                if (jugador instanceof Guerrero) {
	                    Guerrero g = (Guerrero) jugador;
	                    g.atacar();
	                    enemigo.setVida(enemigo.getVida() - g.getFuerza());
	                    System.out.printf("Has atacado al %s con %.2f de daño\n", enemigo.getNombre(), g.getFuerza());
	                } else if (jugador instanceof Mago) {
	                    Mago m = (Mago) jugador;
	                    m.atacar();
	                    enemigo.setVida(enemigo.getVida() - m.getFuerza());
	                    System.out.printf("Has atacado al %s con %.2f de daño\n", enemigo.getNombre(), m.getFuerza());
	                } else if (jugador instanceof Arquero) {
	                    Arquero a = (Arquero) jugador;
	                    a.atacar();
	                    enemigo.setVida(enemigo.getVida() - a.getFuerza());
	                    System.out.printf("Has atacado al %s con %.2f de daño\n", enemigo.getNombre(), a.getFuerza());
	                }
                // Ataque del enemigo al jugador
	                enemigo.atacar(jugador);
	                break;
            	case "2":
            		System.out.println("Huiste del combate.");
            		opcion = "2";
            		break;
                default:
                	System.out.println("Opción no válida.");
            }

            if (jugador.getVida() <= 0) {
                System.out.println("Has sido derrotado...");
                jugador.setVida(100);
                return;
            }

            if (enemigo.getVida() <= 0) {
                System.out.println("¡Has vencido al " + enemigo.getNombre() + "!");
                tb.ganarRecompensas(jugador);
                jugador.setVida(100.00);
                
                // en caso de que el enemigo sea el enemigo final se guarda en la base de datos el ganador
                if (enemigo instanceof PadreSecretarioDelSenor){
                    gdb.añadirGanador(jugador);
                }
                return;
            }
        }
    }
    
    public void mostrarEstado(Personajes personaje) {
        System.out.println("=== ESTADO DEL JUGADOR ===");
        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Vida: " + personaje.getVida());
        System.out.println("Fuerza: " + personaje.getFuerza());
        System.out.println("Experiencia: " + personaje.getExperiencia());
        System.out.println("Monedas: " + personaje.getMoneda());
        System.out.println("Nivel de experiencia: " + personaje.getNivelExperiencia());
    }

    public Enemigos generarEnemigoAleatorio() {
        Aleatorio a = new Aleatorio();
        int num = a.numero(5);

        switch (num) {
            case 1:
                return new PadreCorredor("Padre corredor", "100", 100, a.numero(50), 100);
            case 2:
                return new PadreLadron("Padre ladron", "100", 100, a.numero(50), true);
            case 3:
                return new PadreHerederoDeSatan("Heredero de satan", "100", 100, a.numero(50), true);
            case 4:
                return new PadreSecretarioDelSenor("Padre secretario del señor", "100", 100, a.numero(50), true);
            default:
                return new PadreSuperior("Padre superior", "x", 100, a.numero(50),
                        new PadreSecretarioDelSenor("Padre secretario del señor", "100", 100, a.numero(50), true));
        }
    }
}
