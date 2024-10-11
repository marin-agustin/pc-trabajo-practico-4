package ejercicio.siete;

import java.util.concurrent.Semaphore;

public class Empresa {

    public static void main(String[] args) {

        Semaphore disponibilidadMozo = new Semaphore(0);
        Semaphore colaEmpleados = new Semaphore(1);
        Semaphore empleadoListo = new Semaphore(0);
        Semaphore empleadoMenu = new Semaphore(0);

        Mozo mozo = new Mozo(disponibilidadMozo, empleadoListo, empleadoMenu);

        Empleado empleado1 = new Empleado(disponibilidadMozo, colaEmpleados, empleadoListo, empleadoMenu);
        Empleado empleado2 = new Empleado(disponibilidadMozo, colaEmpleados, empleadoListo, empleadoMenu);
        Empleado empleado3 = new Empleado(disponibilidadMozo, colaEmpleados, empleadoListo, empleadoMenu);
        Empleado empleado4 = new Empleado(disponibilidadMozo, colaEmpleados, empleadoListo, empleadoMenu);

        mozo.start();

        empleado1.start();
        empleado2.start();
        empleado3.start();
        empleado4.start();

    }

}
