package ejercicio.cuatro;

public class Cliente extends Thread{

    private CentroCopiado centroCopiado;

    public Cliente(CentroCopiado centroCopiado) {
        this.centroCopiado = centroCopiado;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            centroCopiado.solicitarImpresora();
        }
    }

}
