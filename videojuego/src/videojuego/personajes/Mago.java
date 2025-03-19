package videojuego.personajes;

import java.util.Scanner;

public class Mago extends Personajes{
    private int mana;
    private int fuerza = 1;

    public Mago(String nombre, int vida, int vidaMaxima, int ataque, int energia, int nivelExperiencia, int experiencia, int mana, int fuerza) {
        super(nombre, vida, vidaMaxima, ataque, energia, nivelExperiencia, experiencia);
        this.mana = mana;
        this.fuerza = fuerza;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" +
                "mana=" + mana +
                ", fuerza=" + fuerza +
                '}';
    }

    @Override
    public int atacar() {
        return (int) (this.getFuerza() * (this.getNivelExperiencia() * 0.50));
    }

    public void usarMana(Scanner sc){
        String respuesta;
        if (this.getMana() > 50){
            System.out.println("Quieres gastar 50 de mana para obtener" + (this.getFuerza() * 0.2));
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                this.setFuerza((int) (this.getFuerza() * 0.2));
                this.setMana(this.getMana() - 50);
            } else {
                this.setMana(this.getMana());
            }
        }
        if (this.getMana() > 133){
            System.out.println("Quieres gastar 133 de mana para obtener" + (this.getFuerza() * 0.3));
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                this.setFuerza((int) (this.getFuerza() * 0.3));
                this.setMana(this.getMana() - 133);
            } else {
                this.setMana(this.getMana());
            }
        }
        if (this.getMana() > 200){
            System.out.println("Quieres gastar 200 de mana para obtener" + (this.getFuerza() * 0.4));
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                this.setFuerza((int) (this.getFuerza() * 0.4));
                this.setMana(this.getMana() - 200);
            } else {
                this.setMana(this.getMana());
            }
        }
    }
}
