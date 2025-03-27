package utils;

import videojuego.enemigos.*;
import videojuego.personajes.*;
import utils.*;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class Juego {
    public static void enfrentarEnemigo(Personajes jugador, Enemigos enemigo) {
        Toolbox tb = new Toolbox();
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Un " + enemigo.getNombre() + " apareció!");

        while (enemigo.getVida() > 0 && jugador.getVida() > 0) {
            System.out.println("Tu vida: " + jugador.getVida());
            System.out.println(enemigo.getNombre() + " vida: " + enemigo.getVida());
            System.out.println("1. Atacar");
            System.out.println("2. Huir");
            System.out.print("Elige: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
               if (jugador instanceof Guerrero){
                     Guerrero g = (Guerrero) jugador;
                     g.atacar();
                     enemigo.atacar(g);
                   System.out.printf("Has atacado al %s con %f de daño\n", enemigo.getNombre(), jugador.getFuerza());
                    enemigo.setVida(enemigo.getVida() - jugador.getFuerza());
                } else if(jugador instanceof Mago){
                    Mago m = (Mago) jugador;
                    m.atacar();
                    enemigo.atacar(m);
                   System.out.println("Has atacado al " + enemigo.getNombre() + " con " + jugador.getFuerza() + " de daño");
                    enemigo.setVida(enemigo.getVida() - jugador.getFuerza());
                } else if(jugador instanceof Arquero){
                    Arquero a = (Arquero) jugador;
                    a.atacar();
                    enemigo.atacar(a);
                   System.out.println("Has atacado al " + enemigo.getNombre() + " con " + jugador.getFuerza() + " de daño");
                    enemigo.setVida(enemigo.getVida() - jugador.getFuerza());
               }
            } else if (opcion == 2) {
                System.out.println("Huiste del combate.");
                return;
            } else {
                System.out.println("Opción no válida.");
            }

            if (jugador.getVida() <= 0) {
                System.out.println("Has sido derrotado...");
                return;
            }

            if (enemigo.getVida() <= 0) {
                System.out.println("¡Has vencido al " + enemigo.getNombre() + "!");
                tb.ganarRecompensas(jugador);
            }
        }
    }
    public static void jugar(Personajes jugador, Enemigos enemigo) throws FileNotFoundException {
        boolean jugando = true;
        Scanner scanner = new Scanner(System.in);
        CargarGuardarPartida cg = new CargarGuardarPartida();
        while (jugando) {
            System.out.println("--- JUEGO ---");
            System.out.println("1. Enfrentar un enemigo");
            System.out.println("2. Ver estado del jugador");
            System.out.println("3. Guardar partida");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                enfrentarEnemigo(jugador, enemigo);
            } else if (opcion == 2) {
                mostrarEstado(jugador);
            } else if (opcion == 3) {
                cg.guardarPartida(jugador);
            } else if (opcion == 4) {
                System.out.println("Regresando al menú principal...");
                jugando = false;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
    public static void mostrarEstado (Personajes p) {
        System.out.println("=== ESTADO DEL JUGADOR ===");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Vida: " + p.getVida());
        System.out.println("Fuerza: " + p.getFuerza());
        System.out.println("Experiencia: " + p.getExperiencia());
        System.out.println("Monedas: " + p.getMoneda());
        System.out.println("Nivel de experiencia: " + p.getNivelExperiencia());
    }
    public static Enemigos generarEnemigoAleatorio() {
        Aleatorio a = new Aleatorio();
        a.numero(6);
        if (a.equals(1)){
            return new EsbirrosDeLaLuz("esbirro de luz", "100", 100, a.numero(100));
        } else if (a.equals(2)){
            return new PadreCorredor("padre corredor", "100", 100, a.numero(100), 100);
        } else if (a.equals(3)){
            return new PadreLadron("padre ladron", "100", 100, a.numero(100), true);
        } else if (a.equals(4)){
            return new PadreHerederoDeSatan("heredero de satan", "100", 100, a.numero(100), true);
        } else if (a.equals(5)){
            return new PadreSecretarioDelSenor("padre secretario del señor", "100", 100, a.numero(100), true);
        } else {
            return new PadreSuperior("padre superior", "100", 100, a.numero(100), new PadreSecretarioDelSenor("padre secretario del señor", "100", 100, 100, true));
        }


    }
}


