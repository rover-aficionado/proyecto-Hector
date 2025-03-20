package videojuego.mascotas;
import videojuego.personajes.Personajes;


public class Perro extends Mascota {
    
    public Perro(String nombre, String alias, double vida, double vidaMax, String efectos, int nivel) {
        super(nombre, alias, vida, vidaMax, efectos, nivel);
    }
    
    @Override
    public void aplicarEfecto(Personajes p) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(super.getNivel() == 1) {
            p.setVida(p.getVida() + 30);
        } else if (super.getNivel() == 2) {
            p.setVida(p.getVida() + 35);
        } else if (super.getNivel() == 3) {
            p.setVida(p.getVida() + 40);
        } else if (super.getNivel() == 4) {
            p.setVida(p.getVida() + 45);
        } else if (super.getNivel() == 5) {
            p.setVida(p.getVida() + 50);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Perro{" + '}';
    }
}
