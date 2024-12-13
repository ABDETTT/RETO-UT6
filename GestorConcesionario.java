/**
 * @author Amine 
 * @author Abdelilah
 * @since 02 diciembre 2024 
 */
public class GestorConcesionario {

    /**
     * Imprime por pantalla el coche seleccionado o creado.
     * Basicamente es el metodo resumenCoche() Coche, pero este metodo acepta por parametros un coche. 
     * @param coche
     */
    protected void verCoches(Coche coche){
        coche.resumenCoche();
        
        System.out.println();
    }
}
