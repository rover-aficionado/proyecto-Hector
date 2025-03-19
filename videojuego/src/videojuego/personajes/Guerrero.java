public class Guerrero extends Personajes{
    int fuerza;

    public Guerrero(String nombre, int vida, int energia, int nivelExperiencia,int fuerza){
        super(nombre, vida, energia, nivelExperiencia);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString + "{" +
            " fuerza='" + getFuerza() + "'" +
            "}";
    }

}