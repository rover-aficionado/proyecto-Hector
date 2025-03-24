package utils;
import java.util.*;

import videojuego.mascotas.Gato;
import videojuego.personajes.*;

public class Toolbox {
    private void historia() {
        System.out.println("Este mundo consta de 5 niveles, los cuales para avanzar al siguiente nivel deberás acabar con el jefe de nivel.");
        System.out.println("No te confies con el lindo y maravilloso paisaje, ya que este mundo está lleno de criaturas que trataran de acabar con tu aventura,");
        System.out.println("por lo que deberás estar en constante lucha, además de siempre mejorar tus armas y/o herramientas para poder acabar con los enemigos.");
        System.out.println("¿Estás preparado? Tu aventura comienza... AHORA");
    }
    public void introduccion(ArrayList<Personajes> personaje) {
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido guerrero, tu aventura está a punto de comenzar...");
                historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Mago m) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido poseedor de magia, tu aventura está a punto de comenzar...");
                historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Arquero a) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido hawkeye, tu aventura está a punto de comenzar...");
                historia();
                System.out.println("-------------------------------------------------------------");
            }
        }
    }
    
    public void tiendaArmas(ArrayList<Personajes> personaje) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("TIENDA DE ARMAS");
                System.out.println("1. Espada de fuego - 50 monedas");
                System.out.println("2. Espada de hielo - 50 monedas");
                System.out.println("3. Espada de Electrica - 80 monedas");
                System.out.println("4. Espada del inframundo - 120 monedas");
                opcion = sc.nextLine();
                do {
                    if (opcion.equalsIgnoreCase("1")){
                        if (g.getMoneda() >= 50) {
                            g.setMoneda(g.getMoneda() - 50);
                            g.setFuerza(g.getFuerza() + 10);
                            System.out.println("Has comprado la espada de fuego");
                            System.out.println("Tu fuerza ha aumentado 10 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("2")){
                        if (g.getMoneda() >= 50) {
                            g.setMoneda(g.getMoneda() - 50);
                            g.setFuerza(g.getFuerza() + 10);
                            System.out.println("Has comprado la espada de hielo");
                            System.out.println("Tu fuerza ha aumentado 10 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("3")){
                        if (g.getMoneda() >= 80) {
                            g.setMoneda(g.getMoneda() - 80);
                            g.setFuerza(g.getFuerza() + 15);
                            System.out.println("Has comprado la espada de electrica");
                            System.out.println("Tu fuerza ha aumentado 15 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("4")){
                        if (g.getMoneda() >= 120) {
                            g.setMoneda(g.getMoneda() - 120);
                            g.setFuerza(g.getFuerza() + 20);
                            System.out.println("Has comprado la espada del inframundo");
                            System.out.println("Tu fuerza ha aumentado 20 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else {
                        System.out.println("Opcion incorrecta, selecciona entre 1,2,3,4");
                    }
                }while(true);
            } else if (p instanceof Arquero a) {
                System.out.println("TIENDA DE ARMAS");
                System.out.println("1. Arco de fuego - 50 monedas");
                System.out.println("2. Arco de hielo - 50 monedas");
                System.out.println("3. Arco de Electrica - 80 monedas");
                System.out.println("4. Arco del inframundo - 120 monedas");
                opcion = sc.nextLine();
                do {
                    if (opcion.equalsIgnoreCase("1")){
                        if (a.getMoneda() >= 50) {
                            a.setMoneda(a.getMoneda() - 50);
                            a.setFuerza(a.getFuerza() + 10);
                            System.out.println("Has comprado el arco de fuego");
                            System.out.println("Tu fuerza ha aumentado 10 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("2")){
                        if (a.getMoneda() >= 50) {
                            a.setMoneda(a.getMoneda() - 50);
                            a.setFuerza(a.getFuerza() + 10);
                            System.out.println("Has comprado el arco de hielo");
                            System.out.println("Tu fuerza ha aumentado 10 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("3")){
                        if (a.getMoneda() >= 80) {
                            a.setMoneda(a.getMoneda() - 80);
                            a.setFuerza(a.getFuerza() + 15);
                            System.out.println("Has comprado el arco de electrica");
                            System.out.println("Tu fuerza ha aumentado 15 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("4")){
                        if (a.getMoneda() >= 120) {
                            a.setMoneda(a.getMoneda() - 120);
                            a.setFuerza(a.getFuerza() + 20);
                            System.out.println("Has comprado el arco del inframundo");
                            System.out.println("Tu fuerza ha aumentado 20 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else {
                        System.out.println("Opcion incorrecta, selecciona entre 1,2,3,4");
                    }
                }while (true);
            } else if (p instanceof Mago m) {
                System.out.println("TIENDA DE ARMAS");
                System.out.println("1. Varita de fuego - 50 monedas");
                System.out.println("2. Varita de hielo - 50 monedas");
                System.out.println("3. Varita de Electrica - 80 monedas");
                System.out.println("4. Varita del inframundo - 120 monedas");
                opcion = sc.nextLine();
                do {
                    if (opcion.equalsIgnoreCase("1")){
                        if (m.getMoneda() >= 50) {
                            m.setMoneda(m.getMoneda() - 50);
                            m.setFuerza(m.getFuerza() + 10);
                            System.out.println("Has comprado la varita de fuego");
                            System.out.println("Tu fuerza ha aumentado 10 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("2")){
                        if (m.getMoneda() >= 50) {
                            m.setMoneda(m.getMoneda() - 50);
                            m.setFuerza(m.getFuerza() + 10);
                            System.out.println("Has comprado la varita de hielo");
                            System.out.println("Tu fuerza ha aumentado 10 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("3")){
                        if (m.getMoneda() >= 80) {
                            m.setMoneda(m.getMoneda() - 80);
                            m.setFuerza(m.getFuerza() + 15);
                            System.out.println("Has comprado la varita de electrica");
                            System.out.println("Tu fuerza ha aumentado 15 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else if (opcion.equalsIgnoreCase("4")){
                        if (m.getMoneda() >= 120) {
                            m.setMoneda(m.getMoneda() - 120);
                            m.setFuerza(m.getFuerza() + 20);
                            System.out.println("Has comprado la varita del inframundo");
                            System.out.println("Tu fuerza ha aumentado 20 puntos");
                            break;
                        } else {
                            System.out.println("No tienes suficientes monedas");
                            break;
                        }
                    } else {
                        System.out.println("Opcion incorrecta, selecciona entre 1,2,3,4");
                    }
                }while (true);
            }
        }
        
    }

    public void tiendaMascotas(ArrayList<Personajes> personajes){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("TIENDA DE MASCOTAS");
        System.out.println("1. Gato con fortuna- 50 monedas");
        System.out.println("2. Perro sanador - 50 monedas");
        opcion = sc.nextLine();
        do {
            if (opcion.equalsIgnoreCase("1")){
                for (Personajes x : personajes){
                    x.setMoneda(x.getMoneda() - 50);
                    //añadir gato con fortuna al personaje
                    System.out.println("Has comprado el gato con fortuna");
                    System.out.println("Tu moneda ha aumentado 5 puntos");
                    break;
                }
            } else if (opcion.equalsIgnoreCase("2")) {
                for(Personajes x : personajes){
                    x.setMoneda(x.getMoneda() - 50);
                    //añadir perro sanador al personaje
                    System.out.println("Has comprado el perro sanador");
                    System.out.println("Tu moneda ha aumentado 5 puntos");
                    break;
                }
            }
        }while(true);

    }
    
    public void subirNivel(Personajes x){
        if (x.getExperiencia() > 200) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 500) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 1000) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 5000) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 10000) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
    }
    
    public void ganarRecompensas(Personajes p){
        p.setExperiencia(p.getExperiencia() + 50);
        p.setMoneda(p.getMoneda() + 5);
        if (p.getExperiencia() > 200 || p.getExperiencia() > 500 || p.getExperiencia() > 1000 || p.getExperiencia() > 5000 || p.getExperiencia() > 10000){
            p.subirNivel();
        }
    }
}
