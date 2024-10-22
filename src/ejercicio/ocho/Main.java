package ejercicio.ocho;

public class Main {

    public static void main(String[] args) {

        ControladorProduccion controladorProduccion = new ControladorProduccion();

        ProductoElectrico productoElectrico1 = new ProductoElectrico(controladorProduccion);
        ProductoElectrico productoElectrico2 = new ProductoElectrico(controladorProduccion);
        ProductoElectrico productoElectrico3 = new ProductoElectrico(controladorProduccion);
        ProductoElectrico productoElectrico4 = new ProductoElectrico(controladorProduccion);
        ProductoElectrico productoElectrico5 = new ProductoElectrico(controladorProduccion);
        ProductoElectrico productoElectrico6 = new ProductoElectrico(controladorProduccion);

        ProductoMecanico productoMecanico1 = new ProductoMecanico(controladorProduccion);
        ProductoMecanico productoMecanico2 = new ProductoMecanico(controladorProduccion);
        ProductoMecanico productoMecanico3 = new ProductoMecanico(controladorProduccion);
        ProductoMecanico productoMecanico4 = new ProductoMecanico(controladorProduccion);
        ProductoMecanico productoMecanico5 = new ProductoMecanico(controladorProduccion);
        ProductoMecanico productoMecanico6 = new ProductoMecanico(controladorProduccion);

        productoElectrico1.start();
        productoElectrico2.start();
        productoElectrico3.start();
        productoElectrico4.start();
        productoElectrico5.start();
        productoElectrico6.start();

        productoMecanico1.start();
        productoMecanico2.start();
        productoMecanico3.start();
        productoMecanico4.start();
        productoMecanico5.start();
        productoMecanico6.start();


    }

}
