package videojuego.personajes;
// clase heredable de los personajes. Los personaje heredan de esta clase
//hola adios adios hola adios
public abstract class Personajes {
    private String nombre;
    private double vida = 100;
    private double vidaMaxima = 100;
    private double fuerza = 1;
    private double energia = 100;
    private int nivelExperiencia = 1;
    private double experiencia = 0;
    private int moneda = 0;

    public Personajes(String nombre, double fuerza, double energia, int moneda) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.energia = energia;
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if(vida > getVidaMaxima()) {
            this.vida = getVidaMaxima();
        } else if(vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }
    
    public abstract int atacar();

    public void subirNivel(){
        if (this.getExperiencia() >= 200){
            if (!(this.getNivelExperiencia() >= 5)) {
                setNivelExperiencia(getNivelExperiencia() + 1);
                System.out.println("Sube de nivel");
            }else {
                System.out.println("Ya ha alcanzado el nivel maximo");
            }
        }else {
            System.out.println("No tienes suficiente experiencia para subir de nivel");
        }
    }
}
