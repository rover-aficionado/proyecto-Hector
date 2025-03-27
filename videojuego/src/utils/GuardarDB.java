/*
* @author Roberto García
* @date 27 mar 2025 at 11:42:50
* Guarda las partidas en una base de datos adjunta (bbdd.txt)
*/

package utils;

import java.util.Scanner;
import videojuego.personajes.Personajes;
import java.sql.*;


public class GuardarDB {
    String url = "\"jdbc:mysql://127.0.0.1:3306/prueba\"";
    Scanner scn = new Scanner(System.in);
    
    public void guardarPartida(Personajes personaje){
        String sql = "INSERT INTO personajes (nombre, vida, vidaMaxima, fuerza,energia, nivelExperiencia, experiencia, moneda, curacion, fortun                                                                                                    a)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        // inserción a la base de datos
        try (Connection con = DriverManager.getConnection(url, "root", "100695");
                PreparedStatement prep = con.prepareStatement(sql);){
            
            // posición de los datos 
            prep.setString(1, personaje.getNombre());
            prep.setDouble(2, personaje.getVida());
            prep.setDouble(3, personaje.getVidaMaxima());
            prep.setDouble(4, personaje.getFuerza());
            prep.setDouble(5, personaje.getEnergia());
            prep.setInt(6, personaje.getNivelExperiencia());
            prep.setDouble(7, personaje.getExperiencia());
            prep.setInt(8, personaje.getMoneda());
            prep.setInt(9, personaje.getCuracion());
            prep.setInt(10, personaje.getFortuna());
            
            // inserción de los datos
            prep.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: no hay acceso a la base de datos");            
        }
        

    }
}
