package ejercicio.cuatro;

public class Main {

    public static void main(String[] args) {

        CentroCopiado ce = new CentroCopiado(5);

        Cliente c1 = new Cliente(ce);
        Cliente c2 = new Cliente(ce);
        Cliente c3 = new Cliente(ce);
        Cliente c4 = new Cliente(ce);
        Cliente c5 = new Cliente(ce);
        Cliente c6 = new Cliente(ce);
        Cliente c7 = new Cliente(ce);
        Cliente c8 = new Cliente(ce);
        Cliente c9 = new Cliente(ce);
        Cliente c10 = new Cliente(ce);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();

    }

}
