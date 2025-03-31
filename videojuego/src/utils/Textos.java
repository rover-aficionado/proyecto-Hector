package utils;

public class Textos {
    public void inicio(){
        System.out.println("========================================");
        System.out.println("Bienvenido a Legends of Valor");
        System.out.println("1. Nueva Partida");
        System.out.println("2. Reaunudar Partida");
        System.out.println("3. Ver Ganadores");
        System.out.println("4. Salir del juego");
        System.out.println("Selecciona una opcion: ");
    }
     public void historia() {
        System.out.println("Este mundo consta de 5 niveles, los cuales para avanzar al siguiente nivel deberás acabar con el jefe de nivel.");
        System.out.println("No te confies con el lindo y maravilloso paisaje, ya que este mundo está lleno de criaturas que trataran de acabar con tu aventura,");
        System.out.println("por lo que deberás estar en constante lucha, además de siempre mejorar tus armas y/o herramientas para poder acabar con los enemigos.");
        System.out.println("¿Estás preparado? Tu aventura comienza... AHORA");
    }
     public void seleccionTiendas() {
         System.out.println("=== TIENDA === ");
         System.out.println("1. Tienda (Nivel 1)");
         System.out.println("2. Tienda (Nivel 2)");
         System.out.println("3. Tienda (Nivel 3)");
         System.out.println("4. Tienda (Nivel 4)");
         System.out.println("5. Tienda (Nivel 5)");
         System.out.println("6. Salir");
         System.out.print("Elige una opción: ");
     }
     public void menuJuego() {
         System.out.println("=== MENU ===");
         System.out.println("1. Avanzar en el juego");
         System.out.println("2. Ver estado del jugador");
         System.out.println("3. Guardar partida");
         System.out.println("4. Volver al menú principal");
         System.out.print("Elige una opción: ");
     }
     public void menuMundo() {
         System.out.println("=== MUNDO ===");
         System.out.println("1. Explorar cueva");
         System.out.println("2. Enfrentar jefe final");
         System.out.println("3. Tienda de armas");
         System.out.println("4. Tienda de mascotas");
         System.out.println("5. Abrir el menú");
         System.out.print("Elige una opción: ");
     }
}
