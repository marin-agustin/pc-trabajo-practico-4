package ejercicio.uno;

public class SynchronizedCounter {

    private int c = 0;

    public synchronized void increment() { c++;}

    public void decrementar() {c--;}

    public synchronized int getValue() {return c;}

}
