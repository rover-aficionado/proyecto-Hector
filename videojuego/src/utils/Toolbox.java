package utils;
import java.util.*;
import videojuego.personajes.*;
import videojuego.armas.*;

public class Toolbox {
    Textos textos = new Textos();
    Tiendas tiendas = new Tiendas();
    public void introduccion(ArrayList<Personajes> personaje) {
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido guerrero, tu aventura está a punto de comenzar...");
                textos.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Mago m) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido poseedor de magia, tu aventura está a punto de comenzar...");
                textos.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Arquero a) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido hawkeye, tu aventura está a punto de comenzar...");
                textos.historia();
                System.out.println("-------------------------------------------------------------");

            }
        }
    }   
    
    // METODO PARA VER LAS TIENDAS Y COMPRAR ARMAS
    
    public void tiendaArmas(ArrayList<Personajes> personajes, Scanner sc, ArrayList<Armas> equipo, Objetos o) {
        String opcion = "";
        
        while (!opcion.equals("6")) {
	        textos.seleccionTiendas();
	        opcion = sc.nextLine();
	           System.out.println("aaaaaaaaaa");
	        for (Personajes p : personajes) {
	            if(p instanceof Guerrero g) {
                        Objetos objetos = new Objetos();
                        ArrayList<Espada> espadas = objetos.listaEspadas();
                        Espada espada = null;
                        System.out.println("aaaaa");
	                switch(opcion) {
	                    case "1":
	                        tiendas.tiendaArmasGuerrero1();
	                        opcion = sc.nextLine();
	                        switch(opcion) {
	                            case "1":
	                                // extrae el arma de la lista de armas                                      
                                        espada = espadas.get(0);
                                        
                                        // verifica que el jugador tiene el nivel y el dinero
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
                                        // todas las secciones son iguales
	                            case "2":
	                                espada = espadas.get(1);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(2);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(3);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(3);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no valida");
                                        break;
                                }
                                break;
	                    case "2":
	                        tiendas.tiendaArmasGuerrero2();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(5);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(6);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                               espada = espadas.get(7);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(8);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(9);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no válida");
                                        break;
	                        }
                                break;
	                    case "3":
	                        tiendas.tiendaArmasGuerrero3();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(10);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(11);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(12);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(13);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(14);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no valida");
                                        break;
	                        }
                                break;
	                    case "4":
	                        tiendas.tiendaArmasGuerrero4();
	                        switch(opcion) {
	                            case "1":
	                                espada = espadas.get(15);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "2":
	                                espada = espadas.get(16);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "3":
	                                espada = espadas.get(17);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "4":
	                                espada = espadas.get(18);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "5":
	                                espada = espadas.get(19);
                                        
                                        if (p.getMoneda()>=espada.getPrecio()){
                                            p.setFuerza(100 + espada.getDaño());
                                            break;
                                        } else {
                                            System.out.println("no tienes el nivel para este arma");
                                            break;
                                        }
	                            case "6":
	                                break;
                                    default:
                                        System.out.println("opcion no válida");
	                        }
                                break;
	                    case "5": 
	                        tiendas.tiendaArmasGuerrero5();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.espadas.get(20));
	                                g.setMoneda(g.getMoneda()- o.espadas.get(20).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.espadas.get(21));
	                                g.setMoneda(g.getMoneda() - o.espadas.get(21).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.espadas.get(22));
	                                g.setMoneda(g.getMoneda() - o.espadas.get(22).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.espadas.get(23));
	                                g.setMoneda(g.getMoneda() - o.espadas.get(23).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.espadas.get(24));
	                                g.setMoneda(g.getMoneda() - o.espadas.get(24).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
                                break;
	                    case "6":
	                        System.out.println("Saliendo de las tiendas");
	                        break;
	                    default:
	                        System.out.println("Valor no válido, vuelva a intentarlo");
	                        break;
	                }
	            } else if (p instanceof Arquero a) {
	            	switch(opcion) {
	                    case "1":
	                        tiendas.tiendaArmasArquero1();
	                        opcion = sc.nextLine();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.flechas.get(0));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(0).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.flechas.get(1));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(1).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.flechas.get(2));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(2).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.flechas.get(3));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(3).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.flechas.get(4));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(4).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "2":
	                        tiendas.tiendaArmasArquero2();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.flechas.get(5));
	                                a.setMoneda(a.getMoneda()- o.espadas.get(5).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.flechas.get(6));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(6).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.flechas.get(7));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(7).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.flechas.get(8));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(8).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.flechas.get(9));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(9).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "3":
	                        tiendas.tiendaArmasArquero3();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.flechas.get(10));
	                                a.setMoneda(a.getMoneda()- o.espadas.get(10).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.flechas.get(11));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(11).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.flechas.get(12));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(12).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.flechas.get(13));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(13).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.flechas.get(14));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(14).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "4":
	                        tiendas.tiendaArmasArquero4();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.flechas.get(15));
	                                a.setMoneda(a.getMoneda()- o.espadas.get(15).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.flechas.get(16));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(16).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.flechas.get(17));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(17).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.flechas.get(18));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(18).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.flechas.get(19));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(19).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "5": 
	                        tiendas.tiendaArmasArquero5();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.flechas.get(20));
	                                a.setMoneda(a.getMoneda()- o.espadas.get(20).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.flechas.get(21));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(21).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.flechas.get(22));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(22).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.flechas.get(23));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(23).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.flechas.get(24));
	                                a.setMoneda(a.getMoneda() - o.espadas.get(24).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "6":
	                        System.out.println("Saliendo de las tiendas");
	                        break;
	                    default:
	                        System.out.println("Valor no válido, vuelva a intentarlo");
	                        break;
	                }
	            } else if (p instanceof Mago m) { // tienda de armas para el mago
	            	switch(opcion) {
	                    case "1":
	                        tiendas.tiendaArmasMago1();
	                        opcion = sc.nextLine();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.grimorios.get(0));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(0).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.grimorios.get(1));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(1).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.grimorios.get(2));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(2).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.grimorios.get(3));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(3).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.grimorios.get(4));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(4).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "2":
	                        tiendas.tiendaArmasMago2();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.grimorios.get(5));
	                                m.setMoneda(m.getMoneda()- o.espadas.get(5).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.grimorios.get(6));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(6).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.grimorios.get(7));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(7).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.grimorios.get(8));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(8).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.grimorios.get(9));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(9).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "3":
	                        tiendas.tiendaArmasMago3();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.grimorios.get(10));
	                                m.setMoneda(m.getMoneda()- o.espadas.get(10).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.grimorios.get(11));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(11).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.grimorios.get(12));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(12).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.grimorios.get(13));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(13).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.grimorios.get(14));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(14).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "4":
	                        tiendas.tiendaArmasMago4();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.grimorios.get(15));
	                                m.setMoneda(m.getMoneda()- o.espadas.get(15).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.grimorios.get(16));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(16).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.grimorios.get(17));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(17).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.grimorios.get(18));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(18).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.grimorios.get(19));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(19).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "5": 
	                        tiendas.tiendaArmasMago5();
	                        switch(opcion) {
	                            case "1":
	                                equipo.add(o.grimorios.get(20));
	                                m.setMoneda(m.getMoneda()- o.espadas.get(20).getPrecio());
	                                break;
	                            case "2":
	                                equipo.add(o.grimorios.get(21));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(21).getPrecio());
	                                break;
	                            case "3":
	                                equipo.add(o.grimorios.get(22));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(22).getPrecio());
	                                break;
	                            case "4":
	                                equipo.add(o.grimorios.get(23));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(23).getPrecio());
	                                break;
	                            case "5":
	                                equipo.add(o.grimorios.get(24));
	                                m.setMoneda(m.getMoneda() - o.espadas.get(24).getPrecio());
	                                break;
	                            case "6":
	                                break;
	                        }
	                    case "6":
	                        System.out.println("Saliendo de las tiendas");
	                        break;
	                    default:
	                        System.out.println("Valor no válido, vuelva a intentarlo");
	                        break;
	                }
	            }
	        }
        }
    }

    public void tiendaMascotas(ArrayList<Personajes> personajes, Scanner sc) {
        System.out.println("TIENDA DE MASCOTAS");
        System.out.println("1. Gato con fortuna - 50 monedas");
        System.out.println("2. Perro sanador - 50 monedas");
        System.out.println("3. Salir");

        String opcion;
        while (true) {
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                case "2":
                    for (Personajes p : personajes) {
                        if (p.getMoneda() >= 50) {
                            p.setMoneda(p.getMoneda() - 50);
                            if (opcion.equals("1")) {
                                p.setFortuna(1);
                                System.out.println("Has comprado el gato con fortuna.");
                            } else {
                                p.setCuracion(1);
                                System.out.println("Has comprado el perro sanador.");
                            }
                        } else {
                            System.out.println("No tienes suficientes monedas.");
                        }
                    }
                    return;
                case "3":
                    return;
                default:
                    System.out.println("Opción incorrecta, selecciona entre 1, 2 o 3.");
            }
        }
    }

    public void subirNivel(Personajes p) {
        int[] niveles = {200, 500, 1000, 5000, 10000};
        for (int nivel : niveles) {
            if (p.getExperiencia() > nivel) {
                p.setNivelExperiencia(p.getNivelExperiencia() + 1);
                p.setVidaMaxima(p.getVidaMaxima() + 5);
                p.setFuerza(p.getFuerza() + 5);
                System.out.println(p.getNombre() + " ha subido de nivel. ¡Felicidades!");
            }
        }
    }

    public void ganarRecompensas(Personajes p) {
        int bonusExp = (p.getFortuna() > 0) ? (int) (p.getNivelExperiencia() * 0.25) : 0;
        int bonusMonedas = (p.getFortuna() > 0) ? (int) (p.getNivelExperiencia() * 0.25) : 0;

        p.setExperiencia(p.getExperiencia() + 50 + bonusExp);
        p.setMoneda(p.getMoneda() + 5 + bonusMonedas);

        subirNivel(p);
    }
    
    public void creacionObjetos() {
        
    }
}
