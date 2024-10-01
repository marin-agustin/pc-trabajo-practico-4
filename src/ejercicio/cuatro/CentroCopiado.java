package ejercicio.cuatro;

import java.util.concurrent.Semaphore;

public class CentroCopiado {

    private final Semaphore impresorasDisponibles;

    public CentroCopiado(int numeroImpresoras) {
        impresorasDisponibles = new Semaphore(numeroImpresoras);
    }

    public void solicitarImpresora() {
        try {
            System.out.println("Cliente " + Thread.currentThread().getName() + " esta esperando una impresora");
            impresorasDisponibles.acquire();
            System.out.println("Cliente " + Thread.currentThread().getName() + " esta utilizando una impresora");
            imprimir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cliente " + Thread.currentThread().getName() + " ha terminado de utilizar la impresora");
            impresorasDisponibles.release();
        }
    }

    public void imprimir() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
