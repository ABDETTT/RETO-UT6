import java.util.Scanner;

public class CocheMain {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("abde", 22, "4170sfs34", "Hajji", "Hajji", "Calle donado");
    }

    public void verMenu(Scanner sc){
        int opcion = 0;
        int opcion2 = 0;
        do {
            System.out.println("**** Bienvenido a Coche Amigo ****");
            System.out.println("1. Registrate ");
            System.out.println("2. Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                       
                        meterDatos(sc);
                    break;
            
                default:
                        System.out.println("Opcion invalida");
                    break;
            }

            do {
                System.out.println("Hola"+cliente1.getNombre+" elige una opcion");
                System.out.println("1. Ver coche disponibles");
                System.out.println("2. Configurar un coche nuevo");
                System.out.println("3. Ver factura");
                System.out.println("4. Salir");
                opcion2 = sc.nextInt();

                switch (opcion2) {
                    case 1:
                        verCoches();
                        break;
                    case 2:
                        meterDatosCoche();
                        break;
                    case 3:
                        datosVenta();
                        break;
                
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            } while (opcion2 != 4);


        } while (opcion != 2);
            System.out.println("Gracias por su vista a **** COCHES AMIGO ****");

        
    }

}
