import java.util.Scanner;

public class CaracteristicasCoche {
    public static Scanner sc = new Scanner(System.in);

    private static String[] arrayCaracterísticas = { "Color", "Transmision", "Motorizacion" };
    private static String[] coloresDisponibles = { "Rojo", "Negro", "Azul", "Amarillo", "Blanco" };
    private static double[] precioColor = { 1500, 2500, 3000, 5000, 2500 };
    private static String[] transmisionDisponibles = { "Manual", "Automatica" };
    private static double[] precioTransmision = { 10000, 15000 };
    private static String[] motorizaciónDisponible = { "Gasolina", "Gasoil", "Hibrido", "Electrico" };
    private static double[] precioMotorizacion = { 12000, 11000, 15000, 20000 };
    private static String[] arrayCaracterísticasSelec = new String[arrayCaracterísticas.length];
    private static double precioCocheCarac=0;

    public CaracteristicasCoche(String[] arrayCaracterísticas, String[] coloresDisponibles,String[] transmisionDisponibles, String[] motorizaciónDisponible) {
        this.arrayCaracterísticas = arrayCaracterísticas;
        this.coloresDisponibles = coloresDisponibles;
        this.transmisionDisponibles = transmisionDisponibles;
        this.motorizaciónDisponible = motorizaciónDisponible;
    }

    protected static void solicitarCaracterísticas(Scanner sc) {
        int n = 0;
        int opcionSelec;

        for (int i = 0; i < arrayCaracterísticas.length; i++) {
            System.out.println("\nElige " + arrayCaracterísticas[i]);
            n = i;

            if (n == 0) {
                boolean valido = false;
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

                    arrayCaracterísticasSelec[i] = coloresDisponibles[opcionSelec - 1];
                    precioCocheCarac = +precioColor[opcionSelec - 1];

                    for (int k = 0; k < coloresDisponibles.length; k++) {
                        if (arrayCaracterísticasSelec[i].equals(coloresDisponibles[k])) {
                            valido = true;
                        }
                    }

                    n1++;
                } while (valido == false);

            } else if (n == 1) {
                boolean valido = false;
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

                    arrayCaracterísticasSelec[i] = transmisionDisponibles[opcionSelec - 1];
                    precioCocheCarac = +precioTransmision[opcionSelec - 1];


                    for (int k = 0; k < transmisionDisponibles.length; k++) {
                        if (arrayCaracterísticasSelec[i].equals(transmisionDisponibles[k])) {
                            valido = true;
                        }
                    }

                    n1++;
                } while (valido == false);

            } else {
                boolean valido = false;
                int n1 = 0;

                for (int j = 0; j < motorizaciónDisponible.length; j++) {
                    System.out.println(j + 1 + ". " + motorizaciónDisponible[j] + " " + precioMotorizacion[j]);
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    arrayCaracterísticasSelec[i] = motorizaciónDisponible[opcionSelec - 1];
                    precioCocheCarac = +precioMotorizacion[opcionSelec - 1];


                    for (int k = 0; k < motorizaciónDisponible.length; k++) {
                        if (arrayCaracterísticasSelec[i].equals(motorizaciónDisponible[k])) {
                            valido = true;
                        }
                    }

                    n1++;
                } while (valido == false);

            }

        }

        System.out.print("\nCaracterísticas seleccionadas: ");
        for (int i = 0; i < arrayCaracterísticas.length; i++) {
            System.out.print(arrayCaracterísticas[i] + ": " + arrayCaracterísticasSelec[i]);
            if (i < arrayCaracterísticas.length - 1) {
                System.out.print(", ");
            }

        }
    }

    protected double getprecioCocheCarac(){ 
        return precioCocheCarac;
    }

}
