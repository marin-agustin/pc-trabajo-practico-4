package ejercicio.uno;

public class SynchronizedObjectCounter {

    private int c = 0;

    /*
    public void incrementar() {
        synchronized (c) {c++;}
    }
     */

    public void decrementar() {
        synchronized (this) {c--;}
    }

    public int getValue() {return c;}

}