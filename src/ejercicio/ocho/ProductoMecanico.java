package ejercicio.ocho;

public class ProductoMecanico extends Thread {

    private ControladorProduccion controladorProduccion;

    public ProductoMecanico(ControladorProduccion controladorProduccion) {
        this.controladorProduccion = controladorProduccion;
    }

    @Override
    public void run() {
        try {
            controladorProduccion.llegaMecanico();
            Thread.sleep(3000);
            controladorProduccion.sale("mecanico");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
