package ejercicio.seis;

import java.util.concurrent.Semaphore;

public class TaxiApp {

    public static void main(String[] args) {

        Semaphore taxiListo = new Semaphore(0);
        Semaphore pasajeroListo = new Semaphore(0);
        Semaphore taxiCola = new Semaphore(1);

        Taxista taxista = new Taxista(pasajeroListo, taxiListo);

        Pasajero pasajero1 = new Pasajero(pasajeroListo, taxiListo, taxiCola);
        Pasajero pasajero2 = new Pasajero(pasajeroListo, taxiListo, taxiCola);
        Pasajero pasajero3 = new Pasajero(pasajeroListo, taxiListo, taxiCola);
        Pasajero pasajero4 = new Pasajero(pasajeroListo, taxiListo, taxiCola);

        taxista.start();

        pasajero1.start();
        pasajero2.start();
        pasajero3.start();
        pasajero4.start();

    }

}
