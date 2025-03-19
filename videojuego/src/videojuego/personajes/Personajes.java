public abstract class Personaje{
    private String nombre;
    private int fuerza = 1;
    private int nivel = 1;
    private int experiencia;
    private int vidaMaxima = 100;
    private int vidaActual = 100;

    public Personaje(String nombre, int fuerza, int nivel, int experiencia, int vidaMaxima, int vidaActual) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.nivel = nivel;
        if (experiencia >= 200){
            this.experiencia =200;
        } else if (experiencia <= 0) {
            this.experiencia = 0;
        }else {
            this.experiencia = experiencia;
        }
        this.vidaMaxima = vidaMaxima;
        if (vidaActual >= 100){
            this.vidaActual = 100;
        } else if (vidaActual <= 0) {
            this.vidaActual = 0;
        }else {
            this.vidaActual = vidaActual;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        if (vidaActual >= 100){
            this.vidaActual = 100;
        } else if (vidaActual <= 0) {
            this.vidaActual = 0;
        }else {
            this.vidaActual = vidaActual;
        }
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vidaMaxima=" + vidaMaxima +
                ", vidaActual=" + vidaActual +
                '}';
    }

    public int atacar(){
       return (int) (this.getFuerza() * (this.getNivel() * 0.50));
    }

    public void recibirDaño(int daño) {
        this.setVidaActual(this.getVidaActual - daño);
        System.out.println("El personaje " + this.nombre + " ha recibido " + daño + " de daño");
        System.out.println("Vida restante: " + this.getVidaActual);
    };

    public abstract void descansar();

    public void subirNivel(){
        if (this.getExperiencia() >= 200){
            if (!(this.getNivel() >= 5)) {
                this.setNivel(this.getNivel() + 1);
                System.out.println("Sube de nivel");
            }else {
                System.out.println("Ya ha alcanzado el nivel maximo");
            }
        }else {
            System.out.println("No tienes suficiente experiencia para subir de nivel");
        }
    }

}
