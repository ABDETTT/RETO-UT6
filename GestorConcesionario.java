public class GestorConcesionario {
    CaracteristicasCoche caracteristicas1 = new CaracteristicasCoche("Rojo", "Automatico", "Gasolina");
    CaracteristicasCoche caracteristicas2 = new CaracteristicasCoche("Azul", "Manual", "Gasoil");
    CaracteristicasCoche caracteristicas3 = new CaracteristicasCoche("Negro", "Automatico", "Hibrido");
    
    Coche coche1 = new Coche(1, "Ferrari", "488 Pista", "Super Deportivo", caracteristicas1);
    Coche coche2 = new Coche(2, "Toyota", "Yaris", "Compacto", caracteristicas2);
    Coche coche3 = new Coche(3, "Kia", "Sport", "Suv", caracteristicas3);

    protected void verCoches(){
        System.out.println("Estos son los coches que tenemos en el stock: ");
        coche1.resumenCoche();
        coche2.resumenCoche();
        coche3.resumenCoche();
        
        System.out.println();
    }

}
