package utils;
import java.util.*;
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
    
    public void seleccionTiendas(ArrayList<Personajes> personaje) {
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("1. Espada de fuego - 50 monedas");
                System.out.println("2. Espada de hielo - 50 monedas");
                System.out.println("3. Espada de Electrica - 80 monedas");
                System.out.println("4. Espada del inframundo - 120 monedas");
            }
        }
        
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
