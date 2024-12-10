import java.util.Scanner;

public class CaracteristicasCoche {
    public static Scanner sc = new Scanner(System.in);

    private static String[] arrayCaracteristicas = { "Color", "Transmision", "Motorizacion" };
    private static String[] coloresDisponibles = { "Rojo", "Negro", "Azul", "Amarillo", "Blanco" };
    private static double[] precioColor = { 1500, 2500, 3000, 5000, 2500 };
    private static String[] transmisionDisponibles = { "Manual", "Automatica" };
    private static double[] precioTransmision = { 10000, 15000 };
    private static String[] motorizacionDisponible = { "Gasolina", "Gasoil", "Hibrido", "Electrico" };
    private static double[] precioMotorizacion = { 12000, 11000, 15000, 20000 };
    private static String[] arrayCaracteristicasSelec = new String[arrayCaracteristicas.length];
    private static double precioCocheCarac=0;

    public CaracteristicasCoche(String[] arrayCaracteristicas, String[] coloresDisponibles,
            String[] transmisionDisponibles, String[] motorizacionDisponible) {
        this.arrayCaracteristicas = arrayCaracteristicas;
        this.coloresDisponibles = coloresDisponibles;
        this.transmisionDisponibles = transmisionDisponibles;
        this.motorizacionDisponible = motorizacionDisponible;
    }

    public static void main(String[] args) {
        solicitarCaracterísticas(sc);
        imprimirCaracteristicas();

    }

    protected static void solicitarCaracterísticas(Scanner sc) {
        int n = 0;
        int opcionSelec;

        for (int i = 0; i < arrayCaracteristicas.length; i++) {
            System.out.println("\nElige " + arrayCaracteristicas[i]);
            n = i;

            if (n == 0) {
                int n1 = 0;

                for (int j = 0; j < coloresDisponibles.length; j++) {
                    System.out.println(j + 1 + ". " + coloresDisponibles[j] + " " + precioColor[j]);
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    n1++;
                } while (opcionSelec>coloresDisponibles.length || opcionSelec<1);

                arrayCaracteristicasSelec[i] = coloresDisponibles[opcionSelec - 1];
                precioCocheCarac = +precioColor[opcionSelec - 1];

            } else if (n == 1) {
                int n1 = 0;

                for (int j = 0; j < transmisionDisponibles.length; j++) {
                    System.out.println(j + 1 + ". " + transmisionDisponibles[j] + " " + precioTransmision[j]);
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    n1++;
                } while (opcionSelec>transmisionDisponibles.length || opcionSelec<1);

                arrayCaracteristicasSelec[i] = transmisionDisponibles[opcionSelec - 1];
                precioCocheCarac = +precioTransmision[opcionSelec - 1];

            } else {
                int n1 = 0;

                for (int j = 0; j < motorizacionDisponible.length; j++) {
                    System.out.println(j + 1 + ". " + motorizacionDisponible[j] + " " + precioMotorizacion[j]);
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    n1++;
                } while (opcionSelec>motorizacionDisponible.length || opcionSelec<1);
                
                arrayCaracteristicasSelec[i] = motorizacionDisponible[opcionSelec - 1];
                precioCocheCarac = +precioMotorizacion[opcionSelec - 1];
            }
        } 
    }

    protected static void imprimirCaracteristicas(){
        System.out.print("\nCaracterísticas seleccionadas: ");

        for (int i = 0; i < arrayCaracteristicas.length; i++) {
            System.out.print(arrayCaracteristicas[i] + ": " + arrayCaracteristicasSelec[i]);
            if (i < arrayCaracteristicas.length - 1) {
                System.out.print(", ");
            }
        }
    }

    protected double getprecioCocheCarac(){ 
        return precioCocheCarac;
    }

    public static void verCoches() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verCoches'");
    }

}
