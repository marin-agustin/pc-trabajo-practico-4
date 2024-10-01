package ejercicio.cinco;

public class ClienteX extends Thread{

    private final Impresora impresora;

    public ClienteX(Impresora impresora, String nombre) {
        super(nombre);
        this.impresora = impresora;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            boolean permiso = false;

            permiso = intentarImprimiA();

            if (!permiso) {
                impresora.imprimirImpresoraB();
            }
        }
    }

    private boolean intentarImprimiA() {
        if (impresora.getSemaforoA().tryAcquire()) {
            try {
                impresora.imprimirImpresoraA();
            } finally {
                impresora.getSemaforoA().release();
            }
            return true;
        }
        return false;
    }

}
