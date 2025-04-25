/*
* @author Roberto García
* @date 27 mar 2025 at 11:42:50
* Guarda las partidas en una base de datos adjunta (bbdd.txt)
*/

package utils;

import java.util.Scanner;
import videojuego.personajes.*;
import java.sql.*;


public class GuardarDB {
    String url = "jdbc:mysql://127.0.0.1:3306/videojuego";
    Scanner scn = new Scanner(System.in);
    // comentario de prueba
    // metodo para el guardado de la partida
    public void guardarPartida(Personajes personaje){
        String sql = "INSERT INTO personajes (tipo, nombre, vida, vidaMaxima, fuerza,energia, nivelExperiencia, experiencia, moneda, curacion, fortuna) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        // inserción a la base de datos
        try (Connection con = DriverManager.getConnection(url, "root", "100695");
                PreparedStatement prep = con.prepareStatement(sql);){
            
            // verificar el tipo del personaje dependiendo de qué tipo de personaje sea el tipo será de una forma u otra
            if(personaje instanceof Arquero){
                prep.setInt(1, 1);
            } else if (personaje instanceof Guerrero){
                prep.setInt(1, 2);
            } else if (personaje instanceof Mago){
                prep.setInt(1, 3);
            }
            
            // posición de los datos 
            prep.setString(2, personaje.getNombre());
            prep.setDouble(3, personaje.getVida());
            prep.setDouble(4, personaje.getVidaMaxima());
            prep.setDouble(5, personaje.getFuerza());
            prep.setDouble(6, personaje.getEnergia());
            prep.setInt(7, personaje.getNivelExperiencia());
            prep.setDouble(8, personaje.getExperiencia());
            prep.setInt(9, personaje.getMoneda());
            prep.setInt(10, personaje.getCuracion());
            prep.setInt(11, personaje.getFortuna());
            
            // inserción de los datos
            prep.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: no hay acceso a la base de datos");
            System.out.println(e);
        }
    }
    
    // método para la carga de la partida
    public Personajes cargarPartida(String nombre){
        
        // query para la carga de la partida
        String sql = "SELECT * FROM personajes WHERE nombre=?";
                       
        // extracción de datos
        try (Connection con = DriverManager.getConnection(url, "root", "100695");
                PreparedStatement prep = con.prepareStatement(sql);
                ){
            
            // preparación y ejecución de la query
            prep.setString(1, nombre);
            ResultSet rs = prep.executeQuery();
            
            // estadísticas de los personajes
            if(rs.next()){
                double vida = rs.getDouble(4);
                double vidaMaxima = rs.getDouble(5);
                double fuerza = rs.getDouble(6);
                double energia = rs.getDouble(7);
                int nivelExperiencia = rs.getInt(8);
                double experiencia = rs.getDouble(9);
                int moneda = rs.getInt(10);
                int curacion = rs.getInt(11);
                int fortuna = rs.getInt(12);

                // ejecución de la query

                // determinar el tipo del personaje e instancias de los mismos
                if(rs.getInt(1)==1){
                    Personajes nuevaPartida = new Arquero(fortuna, nombre, fuerza, energia, moneda, curacion, fortuna);
                    return nuevaPartida;
                } else if (rs.getInt(1)==2){
                    Personajes nuevaPartida = new Guerrero(nombre, fuerza, energia, moneda, curacion, fortuna);
                    return nuevaPartida;
                } else if (rs.getInt(1)==3){
                    Personajes nuevaPartida = new Mago(moneda, nombre, fuerza, energia, moneda, curacion, fortuna);
                    return nuevaPartida;
                }
            }
   
        } catch (Exception e) {
            System.out.println("ERROR: no se pudo conectar con la base de datos");
            e.printStackTrace();
        }
        return null;
    }
    
    // listado de las partidas guardadas
    public void verPartidasGuardadas(){
        String sql = "SELECT * FROM personajes;";       
        
        try (Connection con = DriverManager.getConnection(url, "root", "100695");
                PreparedStatement prep = con.prepareStatement(sql);
                ResultSet rs = prep.executeQuery();){

            // listado de toda la información de las partidas
            Boolean hayPartidas = false;
            if(rs.next()){
                hayPartidas = true;
                while (rs.next()){
                System.out.println("|"+
                    rs.getString(1) + "|--|" + rs.getString(2) + "|--|" + rs.getString(3) + "|--|" + 
                    rs.getString(4) + "|--|" + rs.getString(5) + "|--|" + rs.getString(6) + "|--|" + 
                    rs.getString(7) + "|--|" + rs.getString(8) + "|--|" + rs.getString(9) + "|--|" + 
                    rs.getString(10) + "|--|" + rs.getString(11)+"|"
                );

                }
            } else if(!hayPartidas){
                System.out.println("no hay partidas guardadas");
            }
            
        } catch (Exception e) {
            System.out.println("ERROR: no se pudo conectar con la base de datos");
            System.out.println(e);
        }
    }
            
}
