public class Venta {
    
    public void datosVenta(Cliente cliente1, Coche coche1) {

        System.out.println("El cliente con los siguientes datos: ");
        cliente1.verInfo();

        System.out.println("El coche que ha configurado el cliente es: ");
        coche1.resumenCoche();

        System.out.println("Precio total de: ");

    }
}
