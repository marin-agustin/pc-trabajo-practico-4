package ejercicio.cinco;

public class ClienteA extends Thread {

    private final Impresora impresora;

    public ClienteA(Impresora impresora, String nombre) {
        super(nombre);
        this.impresora = impresora;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresora.imprimirImpresoraA();
        }
    }

}
