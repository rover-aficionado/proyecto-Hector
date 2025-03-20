package videojuego.mascotas;

import videojuego.personajes.Personajes;


public class Gato extends Mascota{

    public Gato(String nombre, String alias, double vida, double vidaMax, String efectos, int nivel) {
        super(nombre, alias, vida, vidaMax, efectos, nivel);
    }

    @Override
    public String toString() {
        return super.toString() + " Gato{" + '}';
    }

    @Override
    public void aplicarEfecto(Personajes p) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        
    }
}
