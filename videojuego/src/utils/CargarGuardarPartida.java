/*@author rober*/


package utils;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import videojuego.personajes.*;


public class CargarGuardarPartida {
    /*
        FORMATO DE LOS ARCHIVOS DE GUARDADO
    
        TIPO: numeros del 1 al 3 (arquero, guerrero mago)
        nombre
        vida
        vidaMaxima
        fuerza
        energía
        nivelExperiencia
        experiencia
        moneda
    */
    
    // listar partidas guardadas
    public void listaPartidas(){
        String ruta = "./utils.partidas";
        File directorio = new File(ruta);
        
        if (directorio.exists() && directorio.isDirectory()){
            File[] archivos = directorio.listFiles();
            
            if (archivos != null && archivos.length == 0 ){
                for(File archivo : archivos){
                    System.out.println(archivo);
                }
            } else {
                System.out.println("no hay partidas guardadas");
            }
        } else {
            System.out.println("ERROR: directorio no encontrado");
        }
    }
    
    // cargar partida

    public void cargarPartida(String nombrePersonaje){
        Personajes personaje = null;
        int numero = buscarArchivo(nombrePersonaje);
        String nombreArchivo = "./utils.partidas/" + personaje.getNombre().trim() + numero + ".txt"; // Nombre correcto
        File archivo = new File(nombreArchivo);
        
        try (Scanner scnFile = new Scanner(archivo)){
            
            // extracción de las estadísticas guardadas de los personajes
            int tipo = Integer.parseInt(scnFile.nextLine());
            String nombre = scnFile.nextLine();
            double vida = Double.parseDouble(scnFile.nextLine());
            double vidaMaxima = Double.parseDouble(scnFile.nextLine());
            double fuerza = Double.parseDouble(scnFile.nextLine());
            double energia = Double.parseDouble(scnFile.nextLine());
            int nivelExperiencia = Integer.parseInt(scnFile.nextLine());
            double experiencia = Double.parseDouble(scnFile.nextLine());
            int moneda = Integer.parseInt(scnFile.nextLine());
            int curacion = Integer.parseInt(scnFile.nextLine());
            int fortuna = Integer.parseInt(scnFile.nextLine());
            
            // instancia de los personajes según su tipo con los datos guardados en los ficheros
            if (tipo == 1){
                Personajes nuevoPersonaje = new Arquero(fortuna, nombre, fuerza, energia, moneda, curacion, fortuna);
                //return nuevoPersonaje;
            } else if (tipo == 2){
                Personajes nuevoPersonaje = new Guerrero(nombre, fuerza, energia, moneda, curacion, fortuna);
                //return nuevoPersonaje;
            } else if (tipo == 3){
                Personajes nuevoPersonaje = new Mago(moneda, nombre, fuerza, energia, moneda, curacion, fortuna);
                //return nuevoPersonaje;
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: archivo no encontrado");
        }
    }
    
    // guardar partida
    public void guardarPartida(Personajes personaje) throws FileNotFoundException{
        int numero = buscarArchivo(personaje.getNombre());
        String nombreArchivo = "./utils.partidas/" + personaje.getNombre().trim() + numero + ".txt"; // Nombre correcto
        File archivo = new File(nombreArchivo);

        try (FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw)) {
            
            // Verifica el tipo del personaje
            if (personaje instanceof Arquero) {
                pw.println("1");
            } else if (personaje instanceof Guerrero) {
                pw.println("2");
            } else if (personaje instanceof Mago) {
                pw.println("3");
            }

            // Escribir los datos del personaje
            pw.println(personaje.getNombre());
            pw.println(personaje.getVida());
            pw.println(personaje.getVidaMaxima());
            pw.println(personaje.getFuerza());
            pw.println(personaje.getEnergia());
            pw.println(personaje.getNivelExperiencia());
            pw.println(personaje.getExperiencia());
            pw.println(personaje.getMoneda());
            pw.println(personaje.getCuracion());
            pw.println(personaje.getFortuna());


            System.out.println("Partida guardada correctamente.");
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo guardar la partida.");
        }
    }
    
       
    // buscar el archivo según su nombre
    public int buscarArchivo(String nombreArchivo){
            
        String carpeta = "./utils.partidas";
        String nombreBase = nombreArchivo; 
        int numeroMasGrande = -1; 

        File directorio = new File(carpeta);
        File[] archivos = directorio.listFiles();
        
        // extrae el número del archivo más alto para saber cual es la última partida jugada
        if (archivos != null) {
            Pattern pattern = Pattern.compile(nombreBase + "(\\d+)\\.txt"); 
            
            for (File archivo : archivos) {
                Matcher matcher = pattern.matcher(archivo.getName());
                if (matcher.matches()) {
                    int numero = Integer.parseInt(matcher.group(1));
                    if (numero > numeroMasGrande) {
                        numeroMasGrande = numero;
                    }
                }
            }

            if (numeroMasGrande != -1) {
                return numeroMasGrande+1;
            }
        }
        
        return 0;
    }
}
