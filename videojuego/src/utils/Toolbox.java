package utils;
import java.util.*;
import videojuego.personajes.*;

public class Toolbox {
    Textos t = new Textos();
    public void introduccion(ArrayList<Personajes> personaje) {
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido guerrero, tu aventura está a punto de comenzar...");
                t.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Mago m) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido poseedor de magia, tu aventura está a punto de comenzar...");
                t.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Arquero a) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido hawkeye, tu aventura está a punto de comenzar...");
                t.historia();
                System.out.println("-------------------------------------------------------------");

            }
        }
    }
    private void mostrarMenuArmas(String tipoArma) {
        System.out.println("TIENDA DE ARMAS");
        System.out.println("1. " + tipoArma + " de fuego - 50 monedas");
        System.out.println("2. " + tipoArma + " de hielo - 50 monedas");
        System.out.println("3. " + tipoArma + " eléctrica - 80 monedas");
        System.out.println("4. " + tipoArma + " del inframundo - 120 monedas");
        System.out.println("5. Salir");
    }

    private void comprarArma(Personajes p, String tipoArma, int costo, int bonus) {
        if (p.getMoneda() >= costo) {
            p.setMoneda(p.getMoneda() - costo);
            p.setFuerza(p.getFuerza() + bonus);
            System.out.println("Has comprado " + tipoArma + ". Tu fuerza ha aumentado " + bonus + " puntos.");
        } else {
            System.out.println("No tienes suficientes monedas.");
        }
    }

    public void tiendaArmas(ArrayList<Personajes> personajes, Scanner sc) {
        for (Personajes p : personajes) {
            String tipoArma = p instanceof Guerrero ? "Espada" : p instanceof Arquero ? "Arco" : "Varita";
            mostrarMenuArmas(tipoArma);
            String opcion;
            while (true) {
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1" -> comprarArma(p, tipoArma + " de fuego", 50, 10);
                    case "2" -> comprarArma(p, tipoArma + " de hielo", 50, 10);
                    case "3" -> comprarArma(p, tipoArma + " eléctrica", 80, 15);
                    case "4" -> comprarArma(p, tipoArma + " del inframundo", 120, 20);
                    case "5" -> { return; }
                    default -> System.out.println("Opción incorrecta, selecciona entre 1, 2, 3, 4 o 5.");
                }
            }
        }
    }

    public void tiendaMascotas(ArrayList<Personajes> personajes, Scanner sc) {
        System.out.println("TIENDA DE MASCOTAS");
        System.out.println("1. Gato con fortuna - 50 monedas");
        System.out.println("2. Perro sanador - 50 monedas");
        System.out.println("3. Salir");

        String opcion;
        while (true) {
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                case "2":
                    for (Personajes p : personajes) {
                        if (p.getMoneda() >= 50) {
                            p.setMoneda(p.getMoneda() - 50);
                            if (opcion.equals("1")) {
                                p.setFortuna(1);
                                System.out.println("Has comprado el gato con fortuna.");
                            } else {
                                p.setCuracion(1);
                                System.out.println("Has comprado el perro sanador.");
                            }
                        } else {
                            System.out.println("No tienes suficientes monedas.");
                        }
                    }
                    return;
                case "3":
                    return;
                default:
                    System.out.println("Opción incorrecta, selecciona entre 1, 2 o 3.");
            }
        }
    }

    public void subirNivel(Personajes p) {
        int[] niveles = {200, 500, 1000, 5000, 10000};
        for (int nivel : niveles) {
            if (p.getExperiencia() > nivel) {
                p.setNivelExperiencia(p.getNivelExperiencia() + 1);
                p.setVidaMaxima(p.getVidaMaxima() + 5);
                p.setFuerza(p.getFuerza() + 5);
                System.out.println(p.getNombre() + " ha subido de nivel. ¡Felicidades!");
            }
        }
    }

    public void ganarRecompensas(Personajes p) {
        int bonusExp = (p.getFortuna() > 0) ? (int) (p.getNivelExperiencia() * 0.25) : 0;
        int bonusMonedas = (p.getFortuna() > 0) ? (int) (p.getNivelExperiencia() * 0.25) : 0;

        p.setExperiencia(p.getExperiencia() + 50 + bonusExp);
        p.setMoneda(p.getMoneda() + 5 + bonusMonedas);

        subirNivel(p);
    }
}
