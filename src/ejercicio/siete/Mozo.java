package ejercicio.siete;

import java.util.concurrent.Semaphore;

public class Mozo extends Thread {

    private Semaphore disponibilidadMozo;
    private Semaphore empleadoListo;
    private Semaphore empleadoMenu;

    public Mozo(Semaphore disponibilidadMozo, Semaphore empleadoListo, Semaphore empleadoMenu) {
        this.disponibilidadMozo = disponibilidadMozo;
        this.empleadoListo = empleadoListo;
        this.empleadoMenu = empleadoMenu;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Mozo: Inventando nuevas versiones de pollos");

                empleadoListo.acquire();
                System.out.println("Mozo: Que desea comer:");

                empleadoMenu.acquire();
                System.out.println("Mozo: Entrega la comida al empleado");

                disponibilidadMozo.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
