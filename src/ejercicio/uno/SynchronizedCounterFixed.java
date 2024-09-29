package ejercicio.uno;

public class SynchronizedCounterFixed {

    private int c = 0;

    public synchronized void increment() {c++;}

    public synchronized void decrement() {c--;}

    public synchronized int getValue() {return c;}

}
