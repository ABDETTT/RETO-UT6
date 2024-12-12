public class Venta {
    
    public void factura(Cliente cliente1, Coche coche1) {
        System.out.println("           **** Factura ****");
        cliente1.verFacturaCliente();
        System.out.println("......................");
        coche1.verFacturaCoche();

    }

    public void ventas(){

        System.out.println("Hemos vendido ");
    }

}
