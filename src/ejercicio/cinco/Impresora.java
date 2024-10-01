package ejercicio.cinco;

import java.util.concurrent.Semaphore;

public class Impresora {

    private final Semaphore semaforoImpresoraA = new Semaphore(3);
    private final Semaphore semaforoImpresoraB = new Semaphore(2);

    public Impresora() {

    }

    public Semaphore getSemaforoA() {
        return semaforoImpresoraA;
    }

    public void imprimirImpresoraA(){
        System.out.println("El cliente " + Thread.currentThread().getName() + " quiere acceder a la impresora A");
        try {
            semaforoImpresoraA.acquire();
            System.out.println("El cliente " + Thread.currentThread().getName() + " esta imprimiendo con la impresora A");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforoImpresoraA.release();
            System.out.println("El cliente " + Thread.currentThread().getName() + " termino de utilizar la impresora A");
        }
    }

    public void imprimirImpresoraB() {
        System.out.println("El cliente " + Thread.currentThread().getName() + " quiere acceder a la impresora B");
        try {
            semaforoImpresoraB.acquire();
            System.out.println("El cliente " + Thread.currentThread().getName() + " esta imprimiendo con la impresora B");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforoImpresoraB.release();
            System.out.println("El cliente " + Thread.currentThread().getName() + " termino de utilizar la impresora B");
        }
    }

}
