package utils;
import java.util.*;
import videojuego.personajes.*;
import videojuego.armas.*;

public class Toolbox {
    Textos t = new Textos();
    Tiendas ti = new Tiendas();
    public void introduccion(ArrayList<Personajes> personaje) {
        for (Personajes p : personaje) {
            if(p instanceof Guerrero g) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido guerrero, tu aventura está a punto de comenzar...");
                t.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Mago m) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido poseedor de magia, tu aventura está a punto de comenzar...");
                t.historia();
                System.out.println("-------------------------------------------------------------");
            } else if (p instanceof Arquero a) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Bienvenido hawkeye, tu aventura está a punto de comenzar...");
                t.historia();
                System.out.println("-------------------------------------------------------------");

            }
        }
    }
    
    // METODO PARA VER LAS TIENDAS Y COMPRAR ARMAS
    
    public void tiendaArmas(ArrayList<Personajes> personajes, Scanner sc, ArrayList<Armas> equipo, Objetos o) {
        String opcion;
        t.seleccionTiendas();
        opcion = sc.nextLine();
        
        for (Personajes p : personajes) {
            if(p instanceof Guerrero g) {
                switch(opcion) {
                    case "1": 
                        ti.tiendaArmasGuerrero1();
                        opcion = sc.nextLine();
                        switch(opcion) {
                            case "0":
                                equipo.add(o.espadas.get(0));
                                g.setMoneda(g.getMoneda() - o.espadas.get(0).getPrecio());
                                break;
                            case "1":
                                equipo.add(o.espadas.get(1));
                                g.setMoneda(g.getMoneda() - o.espadas.get(1).getPrecio());
                                break;
                            case "2":
                                equipo.add(o.espadas.get(2));
                                g.setMoneda(g.getMoneda() - o.espadas.get(2).getPrecio());
                                break;
                            case "3":
                                equipo.add(o.espadas.get(3));
                                g.setMoneda(g.getMoneda() - o.espadas.get(3).getPrecio());
                                break;
                            case "4":
                                equipo.add(o.espadas.get(4));
                                g.setMoneda(g.getMoneda() - o.espadas.get(4).getPrecio());
                                break;
                            case "5":
                                equipo.add(o.espadas.get(5));
                                g.setMoneda(g.getMoneda() - o.espadas.get(5).getPrecio());
                                break;
                            case "6":
                                break;
                        }
                        break;
                    case "2":
                        ti.tiendaArmasGuerrero2();
                        break;
                    case "3":
                        ti.tiendaArmasGuerrero3();
                        break;
                    case "4":
                        ti.tiendaArmasGuerrero4();
                        break;
                    case "5": 
                        ti.tiendaArmasGuerrero5();
                        break;
                    case "6":
                        return;
                    default:
                        System.out.println("Valor no válido, vuelva a intentarlo");
                }
            } else if (p instanceof Arquero a) {
                switch(opcion) {
                    case "1": 
                        ti.tiendaArmasArquero1();
                    case "2":
                        ti.tiendaArmasArquero2();
                    case "3":
                        ti.tiendaArmasArquero3();
                    case "4":
                        ti.tiendaArmasArquero4();
                    case "5": 
                        ti.tiendaArmasArquero5();
                    case "6":
                        return;
                    default:
                        System.out.println("Valor no válido, vuelva a intentarlo");
                }
            } else if (p instanceof Mago m) {
                switch(opcion) {
                    case "1": 
                        ti.tiendaArmasMago1();
                    case "2":
                        ti.tiendaArmasMago2();
                    case "3":
                        ti.tiendaArmasMago3();
                    case "4":
                        ti.tiendaArmasMago4();
                    case "5": 
                        ti.tiendaArmasMago5();
                    case "6":
                        return;
                    default:
                        System.out.println("Valor no válido, vuelva a intentarlo");
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
    
    // métodos para usar los libros comprados
    public void usarLibros(Personajes personaje, Grimorio grimorio){ // MÉTODO NO TESTEADO
        double fuerza = personaje.getFuerza();
        double nuevaFuerza = personaje.getFuerza()+grimorio.getPotenciador();
        int contador=0;
        
        while (contador < grimorio.getTiempo()){
            if (fuerza!=nuevaFuerza){
                personaje.setFuerza(personaje.getFuerza()+grimorio.getPotenciador());
            }
            contador++;
        }
       
                
    }
}
