package ejercicio.tres;

import java.util.concurrent.Semaphore;

public class Main {

    private final Semaphore sem1 = new Semaphore(1);
    private final Semaphore sem2 = new Semaphore(0);
    private final Semaphore sem3 = new Semaphore(0);

    public static void main(String[] args) {

        Main main = new Main();

        Thread p1 = main.new Proceso1();
        Thread p2 = main.new Proceso2();
        Thread p3 = main.new Proceso3();

        p1.start();
        p2.start();
        p3.start();

    }

    private class Proceso1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    sem1.acquire();
                    System.out.println("Ejecutando proceso 1");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    sem3.release();
                }
            }
        }
    }

    private class Proceso2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    sem2.acquire();
                    System.out.println("Ejecutando proceso 2");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    sem1.release();
                }
            }
        }
    }

    private class Proceso3 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    sem3.acquire();
                    System.out.println("Ejecutando proceso 3");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    sem2.release();
                }
            }
        }
    }

}
