import java.util.Scanner;

public class CocheMain {
    private static Coche coche0 = new Coche();
    private static Cliente cliente1 = new Cliente();
    private static GestorConcesionario concesionario1 = new GestorConcesionario();
    private static CaracteristicasCoche caracteristicas0 = new CaracteristicasCoche(null, null, null, 0);
    private static Venta venta1 = new Venta();

    private static CaracteristicasCoche caracteristicas1 = new CaracteristicasCoche("Rojo", "Automatico", "Gasolina",
            28500);
    private static CaracteristicasCoche caracteristicas2 = new CaracteristicasCoche("Azul", "Manual", "Gasoil", 24000);
    private static CaracteristicasCoche caracteristicas3 = new CaracteristicasCoche("Negro", "Automatico", "Hibrido",
            32500);

    private static Coche coche1 = new Coche(1, "Ferrari", "488 Pista", "Super Deportivo", caracteristicas1);
    private static Coche coche2 = new Coche(2, "Toyota", "Yaris", "Compacto", caracteristicas2);
    private static Coche coche3 = new Coche(3, "Kia", "Sport", "Suv", caracteristicas3);

    // El throws InterruptedException es una exepcion para poder usar el metodo
    // Thread.sleep().
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        verMenu(sc);
    }

    public static void verMenu(Scanner sc) throws InterruptedException {
        int opcion = 0;
        int opcion2 = 0;
        boolean comprado = false;

        System.out.println("**** Bienvenido a Coche Amigo ****");

        do {
            System.out.println("1. Registrate ");
            System.out.println("2. Salir ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println();
                    meterDatos(sc);

                    do {
                        System.out.println("Hola " + cliente1.getNombre() + " elige una opcion: ");
                        System.out.println("1. Ver coches disponibles. ");
                        System.out.println("2. Configurar un coche nuevo. ");
                        System.out.println("3. Ver factura. ");
                        System.out.println("4. Volver al menu inicial. ");
                        opcion2 = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer

                        switch (opcion2) {
                            case 1:
                                System.out.println();
                                System.out.println("Estos son los coches que tenemos en el stock: ");
                                concesionario1.verCoches(coche1);
                                concesionario1.verCoches(coche2);
                                concesionario1.verCoches(coche3);
                                int opcion3;

                                do {
                                    System.out.println(cliente1.getNombre() + " que quieres hacer ahora: ");
                                    System.out.println("1. Elegir un coche del stock. ");
                                    System.out.println("2. Volver atras. ");
                                    opcion3 = sc.nextInt();
                                    sc.nextLine(); // Limpiar el buffer

                                    switch (opcion3) {
                                        case 1:
                                            System.out.println();
                                            int opcion4;

                                            do {
                                                System.out.println(cliente1.getNombre() + " elige una opcion: ");
                                                System.out.println("1. Coche 1. ");
                                                System.out.println("2. Coche 2. ");
                                                System.out.println("3. Coche 3. ");
                                                System.out.println("4. Volver atras. ");
                                                opcion4 = sc.nextInt();
                                                sc.nextLine(); // Limpiar el buffer

                                                switch (opcion4) {
                                                    case 1:
                                                        int opcion5;
                                                        System.out.println();
                                                        System.out.println("Has elegido el siguiente coche: ");
                                                        concesionario1.verCoche(coche1);
                                                        System.out.println();

                                                        do {
                                                            System.out.println("Comprar: ");
                                                            System.out.println("1. Si. ");
                                                            System.out.println("2. No. ");
                                                            opcion5 = sc.nextInt();
                                                            sc.nextLine();

                                                            switch (opcion5) {
                                                                case 1:
                                                                    System.out.println();
                                                                    venta1.factura(cliente1, coche1);
                                                                    System.out.println();
                                                                    System.out.println(
                                                                            "Coche comprado, gracias por comprar en Coche Amigo. ");
                                                                    System.out.println("Hasta la proxima, adios. ");

                                                                    comprado=true;
                                                                    break;
                                                                case 2:
                                                                    System.out.println("Volviendo atras...");
                                                                    System.out.println();
                                                                    break;
                                                                default:
                                                                    System.out.println(
                                                                            "Opcion invalida, vuelve a intentarlo. ");
                                                                    System.out.println();
                                                                    break;
                                                            }
                                                        } while (opcion5 != 2 && opcion5 != 1);
                                                        break;
                                                    case 2:
                                                        int opcion6;
                                                        System.out.println();
                                                        System.out.println("Has elegido el siguiente coche: ");
                                                        concesionario1.verCoche(coche2);
                                                        System.out.println();

                                                        do {
                                                            System.out.println("Comprar: ");
                                                            System.out.println("1. Si. ");
                                                            System.out.println("2. No. ");
                                                            opcion6 = sc.nextInt();
                                                            sc.nextLine();

                                                            switch (opcion6) {
                                                                case 1:
                                                                    System.out.println();
                                                                    venta1.factura(cliente1, coche2);
                                                                    System.out.println();
                                                                    System.out.println(
                                                                            "Coche comprado, gracias por comprar en Coche Amigo. ");
                                                                    System.out.println("Hasta la proxima, adios. ");

                                                                    comprado=true;
                                                                    break;
                                                                case 2:
                                                                    System.out.println("Volviendo atras...");
                                                                    System.out.println();
                                                                    break;
                                                                default:
                                                                    System.out.println(
                                                                            "Opcion invalida, vuelve a intentarlo. ");
                                                                    System.out.println();
                                                                    break;
                                                            }
                                                        } while (opcion6 != 2 && opcion6 != 1);
                                                        break;
                                                    case 3:
                                                        int opcion7;
                                                        System.out.println();
                                                        System.out.println("Has elegido el siguiente coche: ");
                                                        concesionario1.verCoche(coche3);
                                                        System.out.println();

                                                        do {
                                                            System.out.println("Comprar: ");
                                                            System.out.println("1. Si. ");
                                                            System.out.println("2. No. ");
                                                            opcion7 = sc.nextInt();
                                                            sc.nextLine();

                                                            switch (opcion7) {
                                                                case 1:
                                                                    System.out.println();
                                                                    venta1.factura(cliente1, coche3);
                                                                    System.out.println();
                                                                    System.out.println(
                                                                            "Coche comprado, gracias por comprar en Coche Amigo. ");
                                                                    System.out.println("Hasta la proxima, adios. ");

                                                                    comprado=true;
                                                                    break;
                                                                case 2:
                                                                    System.out.println("Volviendo atras...");
                                                                    System.out.println();
                                                                    break;
                                                                default:
                                                                    System.out.println(
                                                                            "Opcion invalida, vuelve a intentarlo. ");
                                                                    System.out.println();
                                                                    break;
                                                            }
                                                        } while (opcion7 != 2 && opcion7 != 1);
                                                        break;
                                                    case 4:
                                                        System.out.println("Volviendo atras...");
                                                        System.out.println();
                                                        break;
                                                    default:
                                                        System.out.println("Opcion invalida, vuelve a intentarlo. ");
                                                        System.out.println();
                                                        break;
                                                }

                                            } while (opcion4 != 4 && opcion4 != 3 && opcion4 != 2 && opcion4 != 1);
                                            break;
                                        case 2:
                                            System.out.println("Volviendo atras....");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("Opcion no valida, vuelve a intentarlo. ");
                                            System.out.println();
                                            break;
                                    }
                                } while (opcion3 != 2 && comprado!=true);

                                break;
                            case 2:
                                meterDatosCoche(sc);
                                break;
                            case 3:
                                datosVenta(cliente1);

                                break;
                            case 4:
                                System.out.println("Volviendo al menu inicial...");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Opcion no valida, vuelve a intentarlo. ");
                                System.out.println();
                                break;
                        }

                    } while (opcion2 != 4 && comprado!=true);

                    break;
                case 2:
                    System.out.println("Adios, vuelva pronto. ");
                    System.out.println();
                    System.out.println("Saliendo del programa...");
                    // Metodo que pausa la ejecución del hilo por una cantidad especifica de tiempo.
                    Thread.sleep(1000); // Delay de 1s
                    break;
                default:
                    System.out.println("Opcion invalida, vuelve a intentarlo");
                    System.out.println();
                    break;
            }

        } while (opcion != 2 && comprado!=true);

    }

    public static void datosVenta(Cliente cliente1) {

        System.out.println("El coche ha sido vendido al cliente: ");
        cliente1.verFacturaCliente();

        System.out.println("El coche eligido es: ");

    }

    public static void meterDatos(Scanner sc) {
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        cliente1.setNombre(nombre);

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.nextLine();
        cliente1.setApellido1(apellido1);

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();
        cliente1.setApellido2(apellido2);

        System.out.print("Introduce tu dni: ");
        String dni = sc.nextLine();
        cliente1.setDni(dni);

        System.out.print("Introduce tu direccion(Calle/Avenida, Numero, Codigo Postal): ");
        String direccion = sc.nextLine();
        cliente1.setDireccion(direccion);

        System.out.println();
    }

    protected static void meterDatosCoche(Scanner sc) throws InterruptedException {
        int opcion = 0;

        int id = 4;
        coche0.setId(id);

        System.out.print("Introduce la marca que quieras (Toyota, Ferrai, Porsche): ");
        String marca = sc.nextLine();
        coche0.setMarca(marca);

        System.out.print("Introduce el modelo del coche (Corolla, Roma, Panamera): ");
        String modelo = sc.nextLine();
        coche0.setModelo(modelo);

        System.out.print("Introduce la categoria (Suv, Todoterreno, Deportivo): ");
        String categoria = sc.nextLine();
        coche0.setCategoria(categoria);

        caracteristicas0.solicitarCaracterísticas(sc);

        System.out.println();
        do {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Prodecer al pago");
            System.out.println("2. Volver a configurar un de nuevo");
            System.out.println("3. Volver al inicio");
            System.out.println();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    pagar(sc);
                    break;
                case 2:
                    meterDatosCoche(sc);
                    break;
                case 3:
                    verMenu(sc);
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 4);

    }

    public static void pagar(Scanner sc) {
        double precioFinal = 0.0;

        System.out.print("Introduce la cantidad de dinero disponible: ");
        double dineroCliente = sc.nextDouble();

        if (dineroCliente != precioFinal) {

            System.out.println("Operacion rechazada(dinero insuficiente)");

        } else {

            System.out.println("Operacion realizada correctamnte");
        }

    }

}
