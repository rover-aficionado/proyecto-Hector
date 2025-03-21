package utils;

import videojuego.personajes.*;

public class GanarRecompensas {
    public void ganarRecompensas(Personajes p){
        p.setExperiencia(p.getExperiencia() + 50);
        p.setMoneda(p.getMoneda() + 5);
        if (p.getExperiencia() > 200 || p.getExperiencia() > 500 || p.getExperiencia() > 1000 || p.getExperiencia() > 5000 || p.getExperiencia() > 10000){
            p.subirNivel();
        }
    }
}
