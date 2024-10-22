package ejercicio.ocho;

import java.util.concurrent.Semaphore;

public class ControladorProduccion {

    private Semaphore colaElectrico;
    private Semaphore colaMecanico;
    

    public ControladorProduccion() {
        colaElectrico = new Semaphore(1);
        colaMecanico = new Semaphore(1);
    }

    public void cambiaLineas() {

    }

    public void llegaElectrico() {
        try {
                colaElectrico.acquire();
                System.out.println(Thread.currentThread().getName() + ": llego a la linea de produccion electrica");
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }



    public void llegaMecanico() {
        try {
            colaMecanico.acquire();
            System.out.println(Thread.currentThread().getName() + ": llego a la linea de produccion mecanica");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sale(String tipo) {
        if (tipo.equals("electrico")) {
            System.out.println(Thread.currentThread().getName() + ": sale de la linea de produccion electrica");
            colaElectrico.release();
        } else if (tipo.equals("mecanico")) {
            System.out.println(Thread.currentThread().getName() + ": sale de la linea de produccion mecanica");
            colaMecanico.release();
        }
    }



}
