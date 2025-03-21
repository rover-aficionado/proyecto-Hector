/*@author rober*/

package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void listaPartidas(){}
    
    // cargar partida
    public void cargarPartida(){}
    
    // guardar partida
    public void guardarPartida(Personajes personaje) throws FileNotFoundException{
        int numero = buscarArchivo(personaje.getNombre());
    String nombreArchivo = "./utils.partida/" + personaje.getNombre() + numero + ".csv"; // Nombre correcto
    File archivo = new File(nombreArchivo);
    
    try (FileWriter fw = new FileWriter(archivo);
         PrintWriter pw = new PrintWriter(fw)) {
        // verifica el tipo del personaje
        if(personaje instanceof Arquero){
            pw.println("1");
        } else if (personaje instanceof Guerrero){
            pw.println("2");
        } else if(personaje instanceof Mago){
            pw.println("3");
        }
        
        // Escribir los datos de los personajes
        pw.println(personaje.getNombre());
        pw.println(personaje.getVida());
        pw.println(personaje.getVidaMaxima());
        pw.println(personaje.getFuerza());
        pw.println(personaje.getEnergia());
        pw.println(personaje.getNivelExperiencia());
        pw.println(personaje.getExperiencia());
        pw.println(personaje.getMoneda());

        System.out.println("Partida guardada correctamente");

    } catch (IOException e) {
        System.out.println("ERROR: No se pudo guardar la partida.");
    }
    }
    
    // buscar el archivo según su nombre
    public int buscarArchivo(String nombreArchivo){
            
        String carpeta = "./utils.partida";
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
