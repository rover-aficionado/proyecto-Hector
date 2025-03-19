public class PadreCorredor extends Enemigos {

    public PadreCorredor(String nombre, String superPoder, int vida, int daño) {
        super(nombre, superPoder, vida, daño);
    }

    @Override
    public void recibirDaño(int dañoArma) {
        super.setVida(super.getVida()-dañoArma);
    }

}
