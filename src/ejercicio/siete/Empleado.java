package ejercicio.siete;

import java.util.concurrent.Semaphore;

public class Empleado extends Thread{

    private Semaphore disponibilidadMozo;
    private Semaphore colaEmpleados;
    private Semaphore empleadoListo;
    private Semaphore empleadoMenu;

    public Empleado(Semaphore disponibilidadMozo, Semaphore colaEmpleados, Semaphore empleadoListo, Semaphore empleadoMenu) {
        this.disponibilidadMozo = disponibilidadMozo;
        this.colaEmpleados = colaEmpleados;
        this.empleadoListo = empleadoListo;
        this.empleadoMenu = empleadoMenu;
    }

    @Override
    public void run() {
        try {
            colaEmpleados.acquire();

            System.out.println(Thread.currentThread().getName() + ": Esperando al mozo");
            empleadoListo.release();

            System.out.println(Thread.currentThread().getName() + ": Elije su comida");
            empleadoMenu.release();

            System.out.println(Thread.currentThread().getName() + ": Comiendo la comida");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + ": Agradece al mozo y se va");
            disponibilidadMozo.acquire();

            colaEmpleados.release();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
