import java.util.Scanner;

public class CocheMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("abde", 22, "4170sfs34", "Hajji", "Hajji", "Calle donado");
    }

    public void verMenu(Scanner sc) {
        int opcion = 0;
        int opcion2 = 0;

        System.out.println("**** Bienvenido a Coche Amigo ****");

        do {
            System.out.println("1. Registrate ");
            System.out.println("2. Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    meterDatos(sc);

                    do {
                        System.out.println("Hola" + getnombre() + " elige una opcion: ");
                        System.out.println("1. Ver coches disponibles");
                        System.out.println("2. Configurar un coche nuevo");
                        System.out.println("3. Ver factura");
                        System.out.println("4. Salir");
                        opcion2 = sc.nextInt();

                        switch (opcion2) {
                            case 1:
                                verCoches();
                                break;
                            case 2:
                                meterDatosCoche(sc);
                                break;
                            case 3:
                                datosVenta();
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    } while (opcion2 != 4);

                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 2);

    }

    public static void verCoches() {
        Coche coche1 = new Coche(2222, "Ferrari", "488 Pista", "Deportivo", null, null);
        Coche coche2 = new Coche(3332, "Toyota", "Yaris", "Compacto", null, null);

        System.out.println("Estos son los coches que tenemos en stock");
        System.out.println(coche1);
        System.out.println(coche2);
    }
}
