import java.net.Socket;

public class GestorConcesionario {
    
    public static void verCoches(){

        Coche coche1 = new Coche(2222, "Ferrari", "488 Pista", "Deportivo", null, null);
        Coche coche2 = new Coche(3332, "Toyota", "Yaris", "Compacto", null, null);
        
        System.out.println("Estos son los coches que tenemos en stock");
        coche1.resumenCoche();
        coche2.resumenCoche();

    }

    
}
