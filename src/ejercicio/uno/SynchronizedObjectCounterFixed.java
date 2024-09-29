package ejercicio.uno;

public class SynchronizedObjectCounterFixed {

    private int c = 0;

    public void increment() {
        synchronized (this) {
            c++;
        }
    }

    public void decrement() {
        synchronized (this) {
            c--;
        }
    }

    public synchronized int getValue() {
        return c;
    }
}
