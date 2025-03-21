/*@author rober*/

package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CargarGuardarPartida {
    // listar partidas guardadas
    public void listaPartidas(){}
    
    // cargar partida
    public void cargarPartida(){}
    
    // guardar partida
    public void guardarPartida(String nombrePersonaje) throws FileNotFoundException{
               
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
            Pattern pattern = Pattern.compile(nombreBase + "(\\d+)\\.csv"); 
            
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
