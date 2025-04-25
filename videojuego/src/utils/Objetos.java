package utils;
import java.util.ArrayList;
import videojuego.armas.*;

public class Objetos {
    public ArrayList<Espada> espadas = new ArrayList<>();
    public ArrayList<Flecha> flechas = new ArrayList<>();
    public ArrayList<Grimorio> grimorios = new ArrayList<>();
    public ArrayList<Hechizo> hechizos = new ArrayList<>();
    
    public void crearObjetos() {
        // Creando las armas para Guerrero
        espadas.add(new Espada("Filo Sombrío", 10, 50, "Común", 120));
        espadas.add(new Espada("Colmillo de Hierro", 12.5, 65, "Común", 140));
        espadas.add(new Espada("Brisa de Acero", 15, 70, "Común", 160));
        espadas.add(new Espada("Cortavientos", 17.5, 80, "Común", 180));
        espadas.add(new Espada("Daga Lunar", 20, 90, "Común", 200));
        espadas.add(new Espada("Mandíbula de Dragón", 22.5, 150, "Poco común", 220));
        espadas.add(new Espada("Hija de Tormenta", 25, 170, "Poco común", 240));
        espadas.add(new Espada("Espina Carmesí", 27.5, 190, "Poco común", 260));
        espadas.add(new Espada("Filo del Alba", 30, 210, "Rara", 280));
        espadas.add(new Espada("Susurro Nocturno", 32.5, 250, "Rara", 300));
        espadas.add(new Espada("Devoramundos", 35, 500, "Épica", 320));
        espadas.add(new Espada("Canto de Sangre", 37.5, 550, "Legendaria", 340));
        espadas.add(new Espada("Juicio Celestial", 40, 600, "Legendaria", 360));
        espadas.add(new Espada("Tormenta Carmesí", 42.5, 650, "Legendaria", 380));
        espadas.add(new Espada("Ruina del Rey", 45, 700, "Legendaria", 400));
        espadas.add(new Espada("Alma de los caídos", 47.5, 1200, "Mítica", 420));
        espadas.add(new Espada("Desgarro del infinito", 50, 1500, "Mítica", 440));
        espadas.add(new Espada("Hoja del Apocalipsis", 52.5, 1750, "Mítica", 460));
        espadas.add(new Espada("Sepulturero Eterno", 55, 2000, "Mítica", 480));
        espadas.add(new Espada("Ultima Plegaria", 57.5, 2500, "Divina", 500));
        espadas.add(new Espada("Luz de la Creación Primordial", 60, 5000, "Divina", 520));
        espadas.add(new Espada("La Furia de los Mil Truenos", 62.5, 6500, "Divina", 540));
        espadas.add(new Espada("Sentencia del Fin del Mundo", 65, 8000, "Divina", 560));
        espadas.add(new Espada("Vorágine de la Eternidad", 67.5, 10000, "Divina", 580));
        espadas.add(new Espada("Fio de la Oscuridad Primigenia", 70, 12500, "Divina", 600));


        // Creando las flechas para Arquero
        flechas.add(new Flecha("Flecha de Madera Simple", 3, 5, "Común"));
        flechas.add(new Flecha("Dardo Ligero", 3.5, 7, "Común"));
        flechas.add(new Flecha("Punta de Cobre", 4, 10, "Común"));
        flechas.add(new Flecha("Colmillo de Lobo", 4.5, 12, "Común"));
        flechas.add(new Flecha("Aguijón Veloz", 5, 15, "Común"));
        flechas.add(new Flecha("Flecha de Acero", 5.5, 25, "Común"));
        flechas.add(new Flecha("Punzón de Plata", 6, 30, "Común"));
        flechas.add(new Flecha("Dardo de Viento", 6.5, 35, "Común"));
        flechas.add(new Flecha("Garra de Halcón", 7, 40, "Común"));
        flechas.add(new Flecha("Susurro Sombrío", 7.5, 50, "Común"));
        flechas.add(new Flecha("Flecha de Sangre Ardiente", 8, 100, "Poco común"));
        flechas.add(new Flecha("Danza del Relámpago", 8.5, 120, "Rara"));
        flechas.add(new Flecha("Colmillo del Dragón", 9, 150, "Rara"));
        flechas.add(new Flecha("Flecha Fantasmal", 9.5, 180, "Rara"));
        flechas.add(new Flecha("Rompehechizos", 10, 200, "Rara"));
        flechas.add(new Flecha("Flecha de Fénix",10.5, 500, "Épica"));
        flechas.add(new Flecha("Grito del Trueno", 11, 700, "Legendaria"));
        flechas.add(new Flecha("Punzón del Destino", 11.5, 900, "Legendaria"));
        flechas.add(new Flecha("Flecha de la Luna Eterna", 12, 1200, "Mítica"));
        flechas.add(new Flecha("Lanza del Cazador Divino", 12.5, 1500, "Mítica"));
        flechas.add(new Flecha("Aliento de los Dioses", 13, 3000, "Divina"));
        flechas.add(new Flecha("Llamarada del Juicio Final", 13.5, 4500, "Divina"));
        flechas.add(new Flecha("Lamento del Inframundo", 14, 6000, "Divina"));
        flechas.add(new Flecha("Flecha del Vacío Abismal", 14.5, 8500, "Divina"));
        flechas.add(new Flecha("Destino del Último Amanecer", 15, 10000, "Divina"));
        
        // Creando los grimorios para Mago
        grimorios.add(new Grimorio("Manual del Aprendiz", 10, 50, "Común"));
        grimorios.add(new Grimorio("Tomo de Chispas Arcanas", 12, 100, "Común"));
        grimorios.add(new Grimorio("Libro de las Runas Simples", 15, 120, "Poco Común"));
        grimorios.add(new Grimorio("Compendio de Encantamientos Menores", 18, 150, "Poco Común"));
        grimorios.add(new Grimorio("Guía de la Magia Primaria", 20, 180, "Rara"));
        grimorios.add(new Grimorio("Códice del Hechicero", 25, 300, "Rara"));
        grimorios.add(new Grimorio("Grimorio de las Sombras Susurrantes", 30, 350, "Épica"));
        grimorios.add(new Grimorio("Tomo de la Llama Azul", 35, 400, "Épica"));
        grimorios.add(new Grimorio("Volumen del Viento Celestial", 40, 450, "Épica"));
        grimorios.add(new Grimorio("Libro del Mago Errante", 45, 500, "Legendaria"));
        grimorios.add(new Grimorio("Necronomicon Menor", 50, 900, "Legendaria"));
        grimorios.add(new Grimorio("Tomo de la Tempestad Arcana", 55, 1000, "Legendaria"));
        grimorios.add(new Grimorio("Enciclopedia de los Ocho Sellos", 60, 1200, "Mítica"));
        grimorios.add(new Grimorio("Grimorio de los Espíritus Antiguos", 65, 1400, "Mítica"));
        grimorios.add(new Grimorio("Volumen de la Sangre y la Luna", 70, 1600, "Mítica"));
        grimorios.add(new Grimorio("Libro del Ocaso Eterno", 75, 3000, "Divina"));
        grimorios.add(new Grimorio("Manuscrito del Vacío Sombrío", 80, 3500, "Divina"));
        grimorios.add(new Grimorio("Crónicas de los Dioses Caídos", 85, 4000, "Divina"));
        grimorios.add(new Grimorio("Códice del Destino Torcido", 90, 4500, "Divina"));
        grimorios.add(new Grimorio("Tomo del Último Arcano", 95, 5000, "Divina"));
        grimorios.add(new Grimorio("El Libro de la Creación Perdida", 100, 10000, "Divina"));
        grimorios.add(new Grimorio("Necronomicon Absoluto", 105, 12500, "Divina"));
        grimorios.add(new Grimorio("Grimorio del Fin de los Tiempos", 110, 15000, "Divina"));
        grimorios.add(new Grimorio("Tomo del Infinito", 115, 18000, "Divina"));
        grimorios.add(new Grimorio("La Verdadera Palabra de los Primordiales", 120, 20000, "Divina"));
        
        // Creando hechizos para los grimorios
        hechizos.add(new Hechizo("Hechizo de Chispas Arcanas", 12.0, 100, "Común"));
        hechizos.add(new Hechizo("Hechizo de Fuego Menor", 15.0, 120, "Común"));
        hechizos.add(new Hechizo("Hechizo de Congelación Básico", 18.0, 150, "Poco Común"));
        hechizos.add(new Hechizo("Hechizo de Relámpago Menor", 20.0, 180, "Poco Común"));
        hechizos.add(new Hechizo("Hechizo Curativo Rápido", 22.0, 200, "Poco Común"));
        hechizos.add(new Hechizo("Hechizo de Viento Cortante", 25.0, 250, "Raro"));
        hechizos.add(new Hechizo("Hechizo de Tierra Desgarradora", 30.0, 300, "Raro"));
        hechizos.add(new Hechizo("Hechizo de Rayos Potentes", 35.0, 350, "Raro"));
        hechizos.add(new Hechizo("Hechizo de Protección Avanzada", 0.0, 400, "Épico"));
        hechizos.add(new Hechizo("Hechizo de Invocación de Llamas", 40.0, 450, "Épico"));
        hechizos.add(new Hechizo("Hechizo de Congelación Profunda", 45.0, 500, "Épico"));
        hechizos.add(new Hechizo("Hechizo de Rayo de Destructor", 50.0, 600, "Legendario"));
        hechizos.add(new Hechizo("Hechizo de Espejos Arcanos", 55.0, 700, "Legendario"));
        hechizos.add(new Hechizo("Hechizo de Tormenta Divina", 60.0, 800, "Legendario"));
        hechizos.add(new Hechizo("Hechizo del Portal Infinito", 65.0, 900, "Mítico"));
        hechizos.add(new Hechizo("Hechizo de Resurrección Épica", 70.0, 1000, "Mítico"));
        hechizos.add(new Hechizo("Hechizo de Fuerza Imparable", 75.0, 1200, "Mítico"));
        hechizos.add(new Hechizo("Hechizo de Oscuridad Absoluta", 80.0, 1500, "Divina"));
        hechizos.add(new Hechizo("Hechizo del Juicio Final", 85.0, 1800, "Divina"));
        hechizos.add(new Hechizo("Hechizo del Caos Supremo", 90.0, 2000, "Divina"));
        hechizos.add(new Hechizo("Hechizo de la Eternidad Oscura", 95.0, 2500, "Divina"));
        hechizos.add(new Hechizo("Hechizo de la Creación Infinita", 100.0, 3000, "Divina"));
        hechizos.add(new Hechizo("Hechizo del Renacer Celestial", 105.0, 3500, "Divina"));
        hechizos.add(new Hechizo("Hechizo de la Divinidad Suprema", 110.0, 4000, "Divina"));
        hechizos.add(new Hechizo("Hechizo de los Primordiales Eternos", 120.0, 4500, "Divina"));
    }
    
    public ArrayList<Espada> listaEspadas(){
        ArrayList<Espada> espadas = new ArrayList<>();
        
        espadas.add(new Espada("Filo Sombrío", 10, 50, "Común", 120));
        espadas.add(new Espada("Colmillo de Hierro", 12.5, 65, "Común", 140));
        espadas.add(new Espada("Brisa de Acero", 15, 70, "Común", 160));
        espadas.add(new Espada("Cortavientos", 17.5, 80, "Común", 180));
        espadas.add(new Espada("Daga Lunar", 20, 90, "Común", 200));
        espadas.add(new Espada("Mandíbula de Dragón", 22.5, 150, "Poco común", 220));
        espadas.add(new Espada("Hija de Tormenta", 25, 170, "Poco común", 240));
        espadas.add(new Espada("Espina Carmesí", 27.5, 190, "Poco común", 260));
        espadas.add(new Espada("Filo del Alba", 30, 210, "Rara", 280));
        espadas.add(new Espada("Susurro Nocturno", 32.5, 250, "Rara", 300));
        espadas.add(new Espada("Devoramundos", 35, 500, "Épica", 320));
        espadas.add(new Espada("Canto de Sangre", 37.5, 550, "Legendaria", 340));
        espadas.add(new Espada("Juicio Celestial", 40, 600, "Legendaria", 360));
        espadas.add(new Espada("Tormenta Carmesí", 42.5, 650, "Legendaria", 380));
        espadas.add(new Espada("Ruina del Rey", 45, 700, "Legendaria", 400));
        espadas.add(new Espada("Alma de los caídos", 47.5, 1200, "Mítica", 420));
        espadas.add(new Espada("Desgarro del infinito", 50, 1500, "Mítica", 440));
        espadas.add(new Espada("Hoja del Apocalipsis", 52.5, 1750, "Mítica", 460));
        espadas.add(new Espada("Sepulturero Eterno", 55, 2000, "Mítica", 480));
        espadas.add(new Espada("Ultima Plegaria", 57.5, 2500, "Divina", 500));
        espadas.add(new Espada("Luz de la Creación Primordial", 60, 5000, "Divina", 520));
        espadas.add(new Espada("La Furia de los Mil Truenos", 62.5, 6500, "Divina", 540));
        espadas.add(new Espada("Sentencia del Fin del Mundo", 65, 8000, "Divina", 560));
        espadas.add(new Espada("Vorágine de la Eternidad", 67.5, 10000, "Divina", 580));
        espadas.add(new Espada("Fio de la Oscuridad Primigenia", 70, 12500, "Divina", 600));
        
        return espadas;
    }
}