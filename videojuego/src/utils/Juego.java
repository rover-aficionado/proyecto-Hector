package utils;

import videojuego.enemigos.*;
import videojuego.personajes.*;
import videojuego.armas.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
    Textos t = new Textos();
    
    public void jugar(Personajes jugador, Enemigos enemigo, ArrayList<Personajes> personajes, ArrayList<Armas> equipo, Toolbox tb, Scanner sc) throws FileNotFoundException {
        boolean jugando = true;
        Aleatorio a = new Aleatorio();
        CargarGuardarPartida cg = new CargarGuardarPartida();

        tb.introduccion(personajes);
        while (jugando) {
            t.menuJuego();
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    t.menuMundo();
                    opcion = sc.nextLine();

                    switch (opcion) {
                        case "1":
                            System.out.println("Explorando la cueva...");
                            System.out.println("Apareció un enemigo!");
                            Enemigos nuevoEnemigo = new EsbirrosDeLaLuz("Esbirros de la luz", "100", 100, a.numero(10));
                            enfrentarEnemigo(jugador, nuevoEnemigo,tb,sc);
                            break;
                        case "2":
                            enfrentarEnemigo(jugador, enemigo, tb, sc);
                            break;
                        case "3":
                            tb.tiendaArmas(personajes, sc, equipo);
                            break;
                        case "4":
                            tb.tiendaMascotas(personajes, sc);
                            break;
                        case "5":
                            t.menuMundo();
                        default:
                            System.out.println("Valor no válido, intente otra vez");
                    }
                    break;

                case "2":
                    mostrarEstado(jugador);
                    break;
                case "3":
                    cg.guardarPartida(jugador);
                    break;
                case "4":
                    System.out.println("Regresando al menú principal...");
                    jugando = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    public void enfrentarEnemigo(Personajes jugador, Enemigos enemigo, Toolbox tb, Scanner sc) {
        System.out.println("¡Un " + enemigo.getNombre() + " apareció!");

        while (enemigo.getVida() > 0 && jugador.getVida() > 0) {
            System.out.println("Tu vida: " + jugador.getVida());
            System.out.println(enemigo.getNombre() + " vida: " + enemigo.getVida());
            System.out.println("1. Atacar");
            System.out.println("2. Huir");
            System.out.print("Elige: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
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
            } else if (opcion == 2) {
                System.out.println("Huiste del combate.");
                return;
            } else {
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
                return;
            }
        }
    }
    public void mostrarEstado(Personajes p) {
        System.out.println("=== ESTADO DEL JUGADOR ===");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Vida: " + p.getVida());
        System.out.println("Fuerza: " + p.getFuerza());
        System.out.println("Experiencia: " + p.getExperiencia());
        System.out.println("Monedas: " + p.getMoneda());
        System.out.println("Nivel de experiencia: " + p.getNivelExperiencia());
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
