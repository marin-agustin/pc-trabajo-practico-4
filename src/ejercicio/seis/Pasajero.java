package ejercicio.seis;

import java.util.concurrent.Semaphore;

public class Pasajero extends Thread {

    private Semaphore pasajeroListo;
    private Semaphore taxiListo;
    private Semaphore taxiCola;

    public Pasajero(Semaphore pasajeroListo, Semaphore taxiListo, Semaphore taxiCola) {
        this.pasajeroListo = pasajeroListo;
        this.taxiListo = taxiListo;
        this.taxiCola = taxiCola;
    }

    @Override
    public void run() {
        try {
            taxiCola.acquire();

            System.out.println(Thread.currentThread().getName() + ": Buscando un taxi...");

            pasajeroListo.release();
            System.out.println(Thread.currentThread().getName() + ": Taxi encontrado...");

            taxiListo.acquire();
            System.out.println(Thread.currentThread().getName() + ": Llegada a destino...");

            taxiCola.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
