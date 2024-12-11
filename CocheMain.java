import java.util.Scanner;

public class CocheMain {
    private static Coche coche1 = new Coche();
    private static Cliente cliente1 = new Cliente();
    private static GestorConcesionario concesionario1 = new GestorConcesionario();
    private static CaracteristicasCoche caracteristicas0 = new CaracteristicasCoche(null, null, null);

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        verMenu(sc);
    }

    public static void verMenu(Scanner sc)throws InterruptedException {
        int opcion = 0;
        int opcion2 = 0;

        System.out.println("**** Bienvenido a Coche Amigo ****");

        do {
            System.out.println("1. Registrate ");
            System.out.println("2. Salir ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
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
                                concesionario1.verCoches();
                                int opcion3;

                                do {
                                    System.out.println(cliente1.getNombre()+" elige una opcion: ");
                                    System.out.println("1. Elegir un coche del stock. ");
                                    System.out.println("2. Volver atras. ");
                                    opcion3 = sc.nextInt();

                                    switch (opcion3) {
                                        case 1:
                                            //Hacerla funcional.
                                            break;
                                        case 2:
                                            System.out.println("Volviendo atras....");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("Opcion no valida, vuelve a intentarlo. ");
                                            break;
                                    }
                                } while (opcion3!=2);

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
                                break;
                        }

                    } while (opcion2 != 4);

                    break;
                case 2:
                    System.out.println("Adios, vuelva pronto. ");
                    System.out.println("Saliendo del programa...");
                    // Metodo que pausa la ejecución del hilo por una cantidad especifica de tiempo.
                    Thread.sleep(1000); // Delay de 1s
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 2);

    }

    public static void datosVenta(Cliente cliente1) {

        System.out.println("El coche ha sido vendido al cliente: ");
        cliente1.verInfo();

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

        int id=4;
        coche1.setId(id);

        System.out.print("Introduce la marca que quieras (Toyota, Ferrai, Porsche): ");
        String marca = sc.nextLine();
        coche1.setMarca(marca);

        System.out.print("Introduce el modelo del coche (Corolla, Roma, Panamera): ");
        String modelo = sc.nextLine();
        coche1.setModelo(modelo);

        System.out.print("Introduce la categoria (Suv, Todoterreno, Deportivo): ");
        String categoria = sc.nextLine();
        coche1.setCategoria(categoria);

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

    public static void pagar(Scanner sc){
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
