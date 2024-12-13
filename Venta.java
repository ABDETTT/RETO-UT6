/**
 * @author Amine 
 * @author Abdelilah
 * @since 02 diciembre 2024 
 */
public class Venta {
    
    /**
     * Imprime por pantalla los datos del cliente y los datos del coche en formato factura. 
     * Basicamente son el metodo verFacturaCliente() de la clase Cliente y el metodo verFacturaCoche() de la clase Coche, unificados en un metodo. 
     * @param cliente1
     * @param coche1
     */
    public void factura(Cliente cliente1, Coche coche1) {
        System.out.println("           **** Factura ****");
        cliente1.verFacturaCliente();
        System.out.println("......................");
        coche1.verFacturaCoche();

    }
}
