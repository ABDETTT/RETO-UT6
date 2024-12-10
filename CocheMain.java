import java.util.Scanner;

public class CocheMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        GestorConcesionario concesionario1 = new GestorConcesionario();

        verMenu(sc, cliente1, concesionario1);
    }

    public static void verMenu(Scanner sc, Cliente cliente1, GestorConcesionario concesionario1){
        int opcion = 0;
        int opcion2 = 0;

        System.out.println("**** Bienvenido a Coche Amigo ****");

        do {
            System.out.println("1. Registrate ");
            System.out.println("2. Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                        meterDatos(sc, cliente1);

                        do {
                            System.out.println("Hola"+cliente1.getNombre()+" elige una opcion: ");
                            System.out.println("1. Ver coches disponibles");
                            System.out.println("2. Configurar un coche nuevo");
                            System.out.println("3. Ver factura");
                            System.out.println("4. Salir");
                            opcion2 = sc.nextInt();
            
                            switch (opcion2) {
                                case 1:
                                    concesionario1.verCoches();
                                    break;
                                case 2:
                                    meterDatosCoche(sc);
                                    break;
                                case 3:
                                    datosVenta(cliente1);
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

    public static void meterDatos(Scanner sc, Cliente cliente1) {
        System.out.println("Introduce tu Nombre: ");
        String nombre = sc.nextLine();
        cliente1.setNombre(nombre);

        System.out.println("Introduce tu primer apellido");
        String apellido1 = sc.nextLine();
        cliente1.setApellido1(apellido1);

        System.out.println("Introduce tu segundo appellido");
        String apellido2 = sc.nextLine();
        cliente1.setApellido2(apellido2);

        System.out.println("Introduce tu dni: ");
        String dni = sc.nextLine();
        cliente1.setDni(dni);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        cliente1.setEdad(edad);
        System.out.println();
    }

    private static void meterDatosCoche(Scanner sc){

        System.out.println("Introduce la Marca que quieras(Toyota, Ferrai, Porsche )");
        String marca = sc.nextLine();

        System.out.println("Introduce el modelo del coche (Corolla, Roma, Panamera)");
        String modelo = sc.nextLine();

        System.out.println("Introduce la categoria");
        String categoria = sc.nextLine();


    }

    public static void datosVenta (Cliente cliente1){

        System.out.println("El coche ha sido vendido al cliente: ");
        cliente1.verInfo();

        System.out.println("El coche eligido es: ");

    }

    
}
