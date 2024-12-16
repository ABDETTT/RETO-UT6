import java.util.Scanner;

/**
 * @author Amine 
 * @author Abdelilah
 * @since 02 diciembre 2024 
 */
public class CocheMain {
    // Atributos de inicializacion. 
    private static Coche coche0 = new Coche(); 
    private static Cliente cliente1 = new Cliente();
    private static GestorConcesionario concesionario1 = new GestorConcesionario();
    private static CaracteristicasCoche caracteristicas0 = new CaracteristicasCoche(null, null, null, 0);
    private static Venta venta1 = new Venta();

    // Atributos con valores predeterminados. 
    private static CaracteristicasCoche caracteristicas1 = new CaracteristicasCoche("Rojo", "Automatico", "Gasolina",
            28500);
    private static CaracteristicasCoche caracteristicas2 = new CaracteristicasCoche("Azul", "Manual", "Gasoil", 24000);
    private static CaracteristicasCoche caracteristicas3 = new CaracteristicasCoche("Negro", "Automatico", "Hibrido",
            32500);
    private static Coche coche1 = new Coche(1, "Ferrari", "488 Pista", "Super Deportivo", caracteristicas1);
    private static Coche coche2 = new Coche(2, "Toyota", "Yaris", "Compacto", caracteristicas2);
    private static Coche coche3 = new Coche(3, "Kia", "Sport", "Suv", caracteristicas3);

    // Atributo que se usa para saber si la compra esta realizada, con lo cual termina el progama.
    private static boolean comprado = false;
    private static boolean submenuinicial=false; // Variable que se usa para volver al submenu. 

    // El throws InterruptedException es una exepcion para poder usar el metodo Thread.sleep().
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        verMenu(sc);
        sc.close();

    }

    
    /** 
     * Menu inicial en el que se ejecutan todos los demas metodos. 
     * @param sc
     * @throws InterruptedException
     */
    public static void verMenu(Scanner sc) throws InterruptedException {
        int opcion = 0; // Opcion seleccionada del menu inicial.
        int opcion2 = 0; // Opcion seleccionada del submenu. 

        System.out.println("**** Bienvenido a Coche Amigo ****");

        // Menu inicial, en el que tenemos dos opciones Registrate y Salir. 
        do {
            System.out.println("1. Registrate "); 
            System.out.println("2. Salir "); 
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println();
                    meterDatos(sc); // Metodo para meter los datos del cliente, con lo cual registrarse.  

                    // Submenu, que consta de 3 opciones: Ver coches disponibles, Configurarar un coche nuevo y Volver al menu inicial. 
                    do {
                        submenuinicial=false;
                        System.out.println("Hola " + cliente1.getNombre() + " elige una opcion: ");
                        System.out.println("1. Ver coches disponibles. "); 
                        System.out.println("2. Configurar un coche nuevo. ");
                        System.out.println("3. Volver al menu inicial. ");
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

                                // Submenu de Ver coches disponibles. 
                                do {
                                    System.out.println(cliente1.getNombre() + " que quieres hacer ahora: ");
                                    System.out.println("1. Elegir un coche del stock. ");
                                    System.out.println("2. Volver atras. ");
                                    opcion3 = sc.nextInt(); // Opcion seleccionada del submenu de Ver coches disponibles. 
                                    sc.nextLine(); // Limpiar el buffer

                                    switch (opcion3) {
                                        case 1:
                                            elegirCocheStock(sc);
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
                                } while (opcion3 != 2 && comprado != true && submenuinicial != true);
                                break;
                            case 2:
                                System.out.println();
                                meterDatosCoche(sc);
                                break;
                            case 3:
                                System.out.println("Volviendo al menu inicial...");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Opcion no valida, vuelve a intentarlo. ");
                                System.out.println();
                                break;
                        }

                    } while (opcion2 != 3 && comprado != true);
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

        } while (opcion != 2 && comprado != true);

    }

    
    /** 
     * Solicita por pantalla los datos del cliente. 
     * @param sc
     */
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

    
    /** 
     * Solicita por pantalla los datos del coche.
     * Muestra por pantalla un menu que te permite pagar ya el coche configurado o volver a configurar otro coche o volver al submenu inicial. 
     * @param sc
     * @param submenuinicial
     * @throws InterruptedException
     */
    private static void meterDatosCoche(Scanner sc) throws InterruptedException {
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

        caracteristicas0.solicitarCaracteristicas(sc);
        coche0.setCaracteristicas(caracteristicas0);

        System.out.println();
        System.out.println("Coche configurado: ");
        coche0.resumenCoche();

        System.out.println();

        do {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Prodecer al pago. ");
            System.out.println("2. Volver a configurar un coche de nuevo. ");
            System.out.println("3. Volver al submenu inicial. ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    pagar(sc, coche0);
                    break;
                case 2:
                    sc.nextLine(); // Limpiar buffer (Corregido). 
                    meterDatosCoche(sc);
                    break;
                case 3:
                    submenuinicial=true; 
                    System.out.println("Volviendo al submenu inicial...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no valida, vuelve a intentarlo. ");
                    System.out.println();
                    break;
            }

        } while (opcion != 4 && comprado != true && submenuinicial!=true);

    }

    
    /** 
     * Muestra por pantalla un menu que te permite pagar ya el coche elegido o volver a elegir otro coche o volver al submenu inicial. 
     * @param sc
     * @param submenuinicial
     * @param coche
     */
    private static void menuPagar(Scanner sc, Coche coche){
        int opcion;

        do {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Prodecer al pago. ");
            System.out.println("2. Volver a elegir un coche. ");
            System.out.println("3. Volver al submenu inicial. ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    pagar(sc,coche);
                    break;
                case 2:
                    elegirCocheStock(sc);
                    break;
                case 3:
                    submenuinicial=true;
                    System.out.println("Volviendo al submenu inicial...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no valida, vuelve a intentarlo. ");
                    System.out.println();
                    break;
            }

        } while (opcion != 4 && comprado != true && submenuinicial!=true);
    }


    
    /** 
     * Solicita por pantalla el dinero disponible del cliente, si es igual o mayor que el precio del coche, se aceptara el pago, si no se denegara. 
     * @param sc
     * @param coche
     */
    public static void pagar(Scanner sc, Coche coche) {
        System.out.print("Introduce la cantidad de dinero disponible: ");
        double dineroCliente = sc.nextDouble();
        double precioFinal = coche.getCaracteristicas().getPrecioC() + 20000; // Precio base + características

        if (dineroCliente <= precioFinal) {
            System.out.println("Operacion rechazada(dinero insuficiente). ");
            System.out.println();
        } else {
            System.out.println();
            venta1.factura(cliente1, coche); // Mostrar factura de la compra. 
            System.out.println();
            System.out.println(
                            "Coche comprado, gracias por comprar en Coche Amigo. ");
                    System.out.println("Hasta la proxima, adios. ");
            System.out.println();

            comprado = true; // Coche comprado con lo cual este es el fin del programa. 
        }

    }
    
    /** 
     * Indica el coche elegido.
     * Ejecuta el metodo menuPagar(Scanner sc, Coche coche). 
     * @param sc
     * @param coche
     * @param submenuinicial
     */
    private static void cocheStock(Scanner sc, Coche coche) {
        int opcion5;
        System.out.println();
        System.out.println("Has elegido el siguiente coche: ");
        concesionario1.verCoches(coche);

        menuPagar(sc, coche);
    }

    /**
     * Muestra por pantalla un menu para elegir un coche, y ejecuta el metodo cocheStock(Scanner sc, Coche coche). 
     * @param sc
     * @param submenuinicial
     */ 
    private static void elegirCocheStock(Scanner sc) {
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
                    cocheStock(sc, coche1);
                    break;
                case 2:
                    cocheStock(sc, coche2);
                    break;
                case 3:
                    cocheStock(sc, coche3);
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
    }
}
