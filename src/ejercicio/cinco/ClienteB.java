package ejercicio.cinco;

public class ClienteB extends Thread{

    private final Impresora impresora;

    public ClienteB(Impresora impresora, String nombre) {
        super(nombre);
        this.impresora = impresora;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresora.imprimirImpresoraB();
        }
    }

}
