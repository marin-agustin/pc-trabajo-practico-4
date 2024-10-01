package ejercicio.cinco;

public class Main {

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        ClienteA clienteA1 = new ClienteA(impresora, "Cliente A1");
        ClienteA clienteA2 = new ClienteA(impresora, "Cliente A2");
        ClienteA clienteA3 = new ClienteA(impresora, "Cliente A3");
        ClienteA clienteA4 = new ClienteA(impresora, "Cliente A4");

        ClienteB clienteB1 = new ClienteB(impresora, "Cliente B1");
        ClienteB clienteB2 = new ClienteB(impresora, "Cliente B2");
        ClienteB clienteB3 = new ClienteB(impresora, "Cliente B3");
        ClienteB clienteB4 = new ClienteB(impresora, "Cliente B4");
        ClienteB clienteB5 = new ClienteB(impresora, "Cliente B5");
        ClienteB clienteB6 = new ClienteB(impresora, "Cliente B6");

        ClienteX clienteX1 = new ClienteX(impresora, "Cliente X1");
        ClienteX clienteX2 = new ClienteX(impresora, "Cliente X2");

        clienteA1.start();
        clienteA2.start();
        clienteA3.start();
        clienteA4.start();
        clienteB1.start();
        clienteB2.start();
        clienteB3.start();
        clienteB4.start();
        clienteB5.start();
        clienteB6.start();
        clienteX1.start();
        clienteX2.start();

    }

}
