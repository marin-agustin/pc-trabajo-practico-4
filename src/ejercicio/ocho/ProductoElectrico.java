package ejercicio.ocho;

public class ProductoElectrico extends Thread {

    private ControladorProduccion controladorProduccion;

    public ProductoElectrico(ControladorProduccion controladorProduccion) {
        this.controladorProduccion = controladorProduccion;
    }

    @Override
    public void run() {
        try {
            controladorProduccion.llegaElectrico();
            Thread.sleep(3000);
            controladorProduccion.sale("electrico");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
