package utils;
import videojuego.personajes.*;

public class SubirNivel {
    public void subirNivel(Personajes x){
        if (x.getExperiencia() > 200) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 500) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 1000) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 5000) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
        if (x.getExperiencia() > 10000) {
            x.setNivelExperiencia(x.getNivelExperiencia() + 1);
            x.setVidaMaxima(x.getVidaMaxima() + 5);
            x.setFuerza(x.getFuerza() + 5);
        }
    }
}
