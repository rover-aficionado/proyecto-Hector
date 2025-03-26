package videojuego.personajes;

import java.util.Scanner;

public class Mago extends Personajes{
    private int mana;

    public Mago(int mana, String nombre) {
        super(nombre);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + " Mago{" + "mana=" + mana + '}';
    }

    @Override
    public double atacar() {
        return getFuerza() * (getNivelExperiencia() * 0.50);
    }

    public void usarMana(Scanner sc){
        String respuesta;
        if (this.getMana() > 50){
            System.out.println("Quieres gastar 50 de mana para obtener" + (this.getFuerza() * 0.2));
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                this.setFuerza((this.getFuerza() * 0.2));
                this.setMana(this.getMana() - 50);
            } else {
                this.setMana(this.getMana());
            }
        }
        if (this.getMana() > 133){
            System.out.println("Quieres gastar 133 de mana para obtener" + (this.getFuerza() * 0.3));
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                this.setFuerza((this.getFuerza() * 0.3));
                this.setMana(this.getMana() - 133);
            } else {
                this.setMana(this.getMana());
            }
        }
        if (this.getMana() > 200){
            System.out.println("Quieres gastar 200 de mana para obtener" + (this.getFuerza() * 0.4));
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                this.setFuerza((this.getFuerza() * 0.4));
                this.setMana(this.getMana() - 200);
            } else {
                this.setMana(this.getMana());
            }
        }
    }
}
