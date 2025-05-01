package utils;

import java.util.ArrayList;
import videojuego.armas.*;

public class Tiendas {

    // TIENDA PARA LOS GUERREROS
    public Objetos o = new Objetos(); 
    public void imprimirEspada(int indice) { // accede a las listas de los objetos y las muestra
        Objetos objetos = new Objetos();
        ArrayList<Espada> espadas = objetos.listaEspadas();
        try { // accede a la lista de las espadas y las muestra
            Espada espada = espadas.get(indice); 
            System.out.println(espada.getNombre() + " - " + espada.getPrecio() + " monedas | Daño: " + espada.getDaño() + " | Rareza: " + espada.getRareza());
        } catch (Exception e) { // previene errores debido a la lonjitud de la lista de las espadas  espadas
            System.out.println("ERROR: error interno");
            System.out.println("espadas: "+ espadas.size());
        }
        
    }

    public void tiendaArmasGuerrero1() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirEspada(0);
        imprimirEspada(1);
        imprimirEspada(2);
        imprimirEspada(3);
        imprimirEspada(4);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasGuerrero2() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirEspada(5);
        imprimirEspada(6);
        imprimirEspada(7);
        imprimirEspada(8);
        imprimirEspada(9);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasGuerrero3() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirEspada(10);
        imprimirEspada(11);
        imprimirEspada(12);
        imprimirEspada(13);
        imprimirEspada(14);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasGuerrero4() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirEspada(15);
        imprimirEspada(16);
        imprimirEspada(17);
        imprimirEspada(18);
        imprimirEspada(19);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasGuerrero5() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirEspada(20);
        imprimirEspada(21);
        imprimirEspada(22);
        imprimirEspada(23);
        imprimirEspada(24);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    // TIENDA PARA LOS ARQUEROS
    private void imprimirFlecha(int indice) {
//        Flecha flecha = o.flechas.get(indice);
//        System.out.println(flecha.getNombre() + " - " + flecha.getPrecio() + " monedas c/u | Daño: " + flecha.getDaño() + " | Rareza: " + flecha.getRareza());
        Objetos objetos = new Objetos();
        ArrayList<Flecha> flechas = objetos.listaFlechas();
        
        try { // muestra la información de la flecha pasada por parámetro
            Flecha flecha = flechas.get(indice);
            System.out.println(flecha.getNombre() + " - " + flecha.getPrecio() + " monedas c/u | Daño: " + flecha.getDaño() + " | Rareza: " + flecha.getRareza());
        } catch (Exception e) { // en caso de que la lista esté vacía muestra un mensaje de error
            System.out.println("ERROR: no hay flechas que listar");
            System.out.println(flechas.size());
        }
    }

    public void tiendaArmasArquero1() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirFlecha(0);
        imprimirFlecha(1);
        imprimirFlecha(2);
        imprimirFlecha(3);
        imprimirFlecha(4);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasArquero2() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirFlecha(5);
        imprimirFlecha(6);
        imprimirFlecha(7);
        imprimirFlecha(8);
        imprimirFlecha(9);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasArquero3() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirFlecha(10);
        imprimirFlecha(11);
        imprimirFlecha(12);
        imprimirFlecha(13);
        imprimirFlecha(14);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasArquero4() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirFlecha(15);
        imprimirFlecha(16);
        imprimirFlecha(17);
        imprimirFlecha(18);
        imprimirFlecha(19);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void tiendaArmasArquero5() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirFlecha(20);
        imprimirFlecha(21);
        imprimirFlecha(22);
        imprimirFlecha(23);
        imprimirFlecha(24);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }

    // TIENDA PARA LOS MAGOS
    private void imprimirGrimorio(int indice) {
//        Grimorio grimorio = o.grimorios.get(indice);
//        System.out.println(grimorio.getNombre() + " - " + grimorio.getPrecio() + " monedas | Daño: " + grimorio.getDaño() + " | Rareza: " + grimorio.getRareza());
        Objetos objetos = new Objetos();
        ArrayList<Grimorio> grimorios = objetos.listaGrimorios();
        try { // lista los libros
            Grimorio grimorio=grimorios.get(indice);
            System.out.println(grimorio.getNombre() + " - " + grimorio.getPrecio() + " monedas | Daño: " + grimorio.getDaño() + " | Rareza: " + grimorio.getRareza());
        } catch (Exception e) { // verifica que la lista tiene al menos un libro que mostrar
            System.out.println("ERROR: no hay libros que mostrar");
            System.out.println(grimorios.size());
        }
    }

    public void tiendaArmasMago1() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(0);
        imprimirGrimorio(1);
        imprimirGrimorio(2);
        imprimirGrimorio(3);
        imprimirGrimorio(4);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaArmasMago2() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(5);
        imprimirGrimorio(6);
        imprimirGrimorio(7);
        imprimirGrimorio(8);
        imprimirGrimorio(9);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaArmasMago3() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(10);
        imprimirGrimorio(11);
        imprimirGrimorio(12);
        imprimirGrimorio(13);
        imprimirGrimorio(14);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaArmasMago4() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(15);
        imprimirGrimorio(16);
        imprimirGrimorio(17);
        imprimirGrimorio(18);
        imprimirGrimorio(19);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaArmasMago5() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(20);
        imprimirGrimorio(21);
        imprimirGrimorio(22);
        imprimirGrimorio(23);
        imprimirGrimorio(24);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    
    // TIENDA DE HECHIZOS
    private void imprimirHechizo(int indice) {
        Objetos objetos = new Objetos();
        ArrayList<Hechizo> hechizos = objetos.listaHechizos();
        try { // muestra la insformación del hechizo pasado por parámetro
            Hechizo hechizo = hechizos.get(indice);
            System.out.println(hechizo.getNombre() + " - " + hechizo.getPrecio() + " monedas | Daño: " + hechizo.getDaño() + " | Rareza: " + hechizo.getRareza());
        } catch (Exception e) { // salta error en caso de que la lista no tenga hechizos que mostrar
            System.out.println("ERROR: no hay libros que mostrar");
            System.out.println(hechizos.size());
        }
    }

    public void tiendaHechizoMago1() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(0);
        imprimirGrimorio(1);
        imprimirGrimorio(2);
        imprimirGrimorio(3);
        imprimirGrimorio(4);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaHechizoMago2() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(5);
        imprimirGrimorio(6);
        imprimirGrimorio(7);
        imprimirGrimorio(8);
        imprimirGrimorio(9);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaHechizoMago3() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(10);
        imprimirGrimorio(11);
        imprimirGrimorio(12);
        imprimirGrimorio(13);
        imprimirGrimorio(14);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaHechizoMago4() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(15);
        imprimirGrimorio(16);
        imprimirGrimorio(17);
        imprimirGrimorio(18);
        imprimirGrimorio(19);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void tiendaHechizoMago5() {
        System.out.println("=== TIENDA DE ARMAS ===");
        imprimirGrimorio(20);
        imprimirGrimorio(21);
        imprimirGrimorio(22);
        imprimirGrimorio(23);
        imprimirGrimorio(24);
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
