package utils;
import java.util.ArrayList;
import videojuego.armas.*;

public class Objetos {
    public ArrayList<Espada> espadas = new ArrayList<>();
    public ArrayList<Flecha> flechas = new ArrayList<>();
    public ArrayList<Grimorio> grimorios = new ArrayList<>();
    
    public void crearObjetos() {
        // Creando las armas para Guerrero
        espadas.add(new Espada("Espada de piedra", 5, 0, 100));
        espadas.add(new Espada("Filo Sombrío", 10, 50, 120));
        espadas.add(new Espada("Colmillo de Hierro", 12.5, 65, 140));
        espadas.add(new Espada("Brisa de Acero", 15, 70, 160));
        espadas.add(new Espada("Cortavientos", 17.5, 80, 180));
        espadas.add(new Espada("Daga Lunar", 20, 90, 200));
        espadas.add(new Espada("Mandíbula de Dragón", 22.5, 150, 220));
        espadas.add(new Espada("Hija de Tormenta", 25, 170, 240));
        espadas.add(new Espada("Espina Carmesí", 27.5, 190, 260));
        espadas.add(new Espada("Filo del Alba", 30, 210, 280));
        espadas.add(new Espada("Susurro Nocturno", 32.5, 250, 300));
        espadas.add(new Espada("Devoramundos", 35, 500, 320));
        espadas.add(new Espada("Canto de Sangre", 37.5, 550, 340));
        espadas.add(new Espada("Juicio Celestial", 40, 600, 360));
        espadas.add(new Espada("Tormenta Carmesí", 42.5, 650, 380));
        espadas.add(new Espada("Ruina del Rey", 45, 700, 400));
        espadas.add(new Espada("Alma de los caídos", 47.5, 1200, 420));
        espadas.add(new Espada("Desgarro del infinito", 50, 1500, 440));
        espadas.add(new Espada("Hoja del Apocalipsis", 52.5, 1750, 460));
        espadas.add(new Espada("Sepulturero Eterno", 55, 2000, 480));
        espadas.add(new Espada("Ultima Plegaria", 57.5, 2500, 500));
        espadas.add(new Espada("Luz de la Creación Primordial", 60, 5000, 520));
        espadas.add(new Espada("La Furia de los Mil Truenos", 62.5, 6500, 540));
        espadas.add(new Espada("Sentencia del Fin del Mundo", 65, 8000, 560));
        espadas.add(new Espada("Vorágine de la Eternidad", 67.5, 10000, 580));
        espadas.add(new Espada("Fio de la Oscuridad Primigenia", 70, 12500, 600));

        // Creando las flechas para Arquero

        flechas.add(new Flecha ("Flechas normales", 1, 0));
        flechas.add(new Flecha("Flecha de Madera Simple", 2, 5));
        flechas.add(new Flecha("Dardo Ligero", 2.5, 7));
        flechas.add(new Flecha("Punta de Cobre", 3, 10));
        flechas.add(new Flecha("Colmillo de Lobo", 3.5, 12));
        flechas.add(new Flecha("Aguijón Veloz", 4, 15));
        flechas.add(new Flecha("Flecha de Acero", 4.5, 25));
        flechas.add(new Flecha("Punzón de Plata", 5, 30));
        flechas.add(new Flecha("Dardo de Viento", 5.5, 35));
        flechas.add(new Flecha("Garra de Halcón", 6, 40));
        flechas.add(new Flecha("Susurro Sombrío", 6.5, 50));
        flechas.add(new Flecha("Flecha de Sangre Ardiente", 7, 100));
        flechas.add(new Flecha("Danza del Relámpago", 7.5, 120));
        flechas.add(new Flecha("Colmillo del Dragón", 8, 150));
        flechas.add(new Flecha("Flecha Fantasmal", 8.5, 180));
        flechas.add(new Flecha("Rompehechizos", 9, 200));
        flechas.add(new Flecha("Flecha de Fénix", 9.5, 500));
        flechas.add(new Flecha("Grito del Trueno", 10, 700));
        flechas.add(new Flecha("Punzón del Destino", 10.5, 900));
        flechas.add(new Flecha("Flecha de la Luna Eterna", 11, 1200));
        flechas.add(new Flecha("Lanza del Cazador Divino", 11.5, 1500));
        flechas.add(new Flecha("Aliento de los Dioses", 12, 3000));
        flechas.add(new Flecha("Llamarada del Juicio Final", 12.5, 4500));
        flechas.add(new Flecha("Lamento del Inframundo", 13, 6000));
        flechas.add(new Flecha("Flecha del Vacío Abismal", 13.5, 8500));
        flechas.add(new Flecha("Destino del Último Amanecer", 14, 10000));

        // Creando los grimorios para Mago

        grimorios.add(new Grimorio(2, "Libro para principiantes", 5, 0, 3));
    }
}
