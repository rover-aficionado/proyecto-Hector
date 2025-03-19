package videojuego.personajes;
// clase heredable de los personajes. Los personaje heredan de esta clase
public abstract class Personajes {
    private String nombre;
    private int vida = 100;
    private int vidaMaxima = 100;
    private int ataque;
    private int energia;
    private int nivelExperiencia = 1;
    private int experiencia;

    public Personajes(String nombre, int vida, int vidaMaxima, int ataque, int energia, int nivelExperiencia, int experiencia) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        if (vida >= 100){
            this.vida = 100;
        } else if (vida <= 0) {
            this.vida = 0;
        }else {
            this.vida = vida;
        }
        this.ataque = ataque;
        this.energia = energia;
        this.nivelExperiencia = nivelExperiencia;
        if (experiencia >= 200){
            this.experiencia =200;
        } else if (experiencia <= 0) {
            this.experiencia = 0;
        }else {
            this.experiencia = experiencia;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 100){
            this.vida = 100;
        } else if (vida <= 0) {
            this.vida = 0;
        }else {
            this.vida = vida;
        }
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia >= 200){
            this.experiencia =200;
        } else if (experiencia <= 0) {
            this.experiencia = 0;
        }else {
            this.experiencia = experiencia;
        }
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", vidaMaxima=" + vidaMaxima +
                ", ataque=" + ataque +
                ", energia=" + energia +
                ", nivelExperiencia=" + nivelExperiencia +
                ", experiencia=" + experiencia +
                '}';
    }

    public abstract int atacar();

    public void subirNivel(){
        if (this.getExperiencia() >= 200){
            if (!(this.getNivelExperiencia() >= 5)) {
                this.setNivelExperiencia(this.getNivelExperiencia() + 1);
                System.out.println("Sube de nivel");
            }else {
                System.out.println("Ya ha alcanzado el nivel maximo");
            }
        }else {
            System.out.println("No tienes suficiente experiencia para subir de nivel");
        }
    }
}
