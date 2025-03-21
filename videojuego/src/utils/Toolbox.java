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
}
