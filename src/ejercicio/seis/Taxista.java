package ejercicio.seis;

import java.util.concurrent.Semaphore;

public class Taxista extends Thread{

    private Semaphore pasajeroListo;
    private Semaphore taxiListo;

    public Taxista(Semaphore pasajeroListo, Semaphore taxiListo) {
        this.pasajeroListo = pasajeroListo;
        this.taxiListo = taxiListo;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Taxista: Durmiendo en el taxi...");

                pasajeroListo.acquire();
                System.out.println("Taxista: Pasajero encontrado, iniciando viaje...");

                Thread.sleep(2000);
                System.out.println("Taxista: Llegada a destino...");

                taxiListo.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
