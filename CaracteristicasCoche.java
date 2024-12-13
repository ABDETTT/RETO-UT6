import java.util.Scanner;

public class CaracteristicasCoche {
    public Scanner sc = new Scanner(System.in);

    // Atributos para el metodo solicitarCaracteristicas(Scanner sc).
    private String[] arrayCaracteristicas = { "Color", "Transmision", "Motorizacion" }; // Caracteristicas disponibles. 
    private String[] coloresDisponibles = { "Rojo", "Negro", "Azul", "Amarillo", "Blanco" }; // Opciones de la caracteristica color. 
    private double[] precioColor = { 1500, 2500, 3000, 5000, 2500 }; // Precio de las caracteristicas color. 
    private String[] transmisionDisponibles = { "Manual", "Automatica" }; // Opciones de la caracteristica transmision. 
    private double[] precioTransmision = { 10000, 15000 }; // Precio de las caracteristicas transmision. 
    private String[] motorizacionDisponible = { "Gasolina", "Gasoil", "Hibrido", "Electrico" }; // Opciones de la caracteristica motorizacion. 
    private double[] precioMotorizacion = { 12000, 11000, 15000, 20000 }; // Precio de las caracteristicas motorizacion. 
    private String[] arrayCaracteristicasSelec = new String[arrayCaracteristicas.length]; // Caracteristicas seleccionadas.  
    private double precioCocheCarac = 0; // Suma del precio de las caracteristacas seleccinadas. 

    // Atributos para el constructor.
    private String color; 
    private String transmision; 
    private String motorizacion;
    private double precioC;

    // Constructor parametizado. 
    public CaracteristicasCoche(String color, String transmision, String motorizacion, double precioC){
        this.color = color; 
        this.transmision = transmision;
        this.motorizacion = motorizacion; 
        this.precioC = precioC;
    }

    
    
    /** 
     * Solicita por scanner las caracteristicas que desee el cliente. 
     * @param sc
     */
    protected void solicitarCaracteristicas(Scanner sc) {
        int opcionSelec; // Posicion del array de la caracteristica seleccionada. 

        for (int i = 0; i < arrayCaracteristicas.length; i++) {
            System.out.println("\nElige " + arrayCaracteristicas[i]);

            // Elegir un color. 
            if (i == 0) { 
                int n1 = 0;

                for (int j = 0; j < coloresDisponibles.length; j++) {
                    System.out.println(j + 1 + ". " + coloresDisponibles[j] + " " + precioColor[j] + "$");
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    n1++;
                } while (opcionSelec > coloresDisponibles.length || opcionSelec < 1);

                arrayCaracteristicasSelec[i] = coloresDisponibles[opcionSelec - 1];
                precioCocheCarac += precioColor[opcionSelec - 1];
                setColor(arrayCaracteristicasSelec[i]);

            } 

            // Elegir transmision. 
            else if (i == 1) {
                int n1 = 0;

                for (int j = 0; j < transmisionDisponibles.length; j++) {
                    System.out.println(j + 1 + ". " + transmisionDisponibles[j] + " " + precioTransmision[j] + "$");
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    n1++;
                } while (opcionSelec > transmisionDisponibles.length || opcionSelec < 1);

                arrayCaracteristicasSelec[i] = transmisionDisponibles[opcionSelec - 1];
                precioCocheCarac += precioTransmision[opcionSelec - 1];
                setTransmision(arrayCaracteristicasSelec[i]);

            } 
            
            // Elegir motorizacion. 
            else {
                int n1 = 0;

                for (int j = 0; j < motorizacionDisponible.length; j++) {
                    System.out.println(j + 1 + ". " + motorizacionDisponible[j] + " " + precioMotorizacion[j] + "$");
                }

                do {
                    if (n1 > 0) {
                        System.out.println("Opcion no valida.");
                    }

                    System.out.print("Selecciona una opcion: ");
                    opcionSelec = sc.nextInt();

                    n1++;
                } while (opcionSelec > motorizacionDisponible.length || opcionSelec < 1);

                arrayCaracteristicasSelec[i] = motorizacionDisponible[opcionSelec - 1];
                precioCocheCarac += precioMotorizacion[opcionSelec - 1];
                setMotorizacion(arrayCaracteristicasSelec[i]);
            }
        }

        setPrecioC(precioCocheCarac);
    }

    protected void imprimirCaracteristicas() {
        System.out.print("\nCaracteristicas seleccionadas: ");

        for (int i = 0; i < arrayCaracteristicas.length; i++) {
            System.out.print(arrayCaracteristicas[i] + ": " + arrayCaracteristicasSelec[i]);
            if (i < arrayCaracteristicas.length - 1) {
                System.out.print(", ");
            }
        }
    }

    protected String verCaracteristicas() {
        return "[Color: " + color + ", Transmision: " + transmision + ", Motorizacion: " + motorizacion + "]";
    }

    // Metodos geters y seters. 
    public double getprecioCocheCarac() {
        return precioCocheCarac;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getMotorizacion() {
        return motorizacion;
    }

    public void setMotorizacion(String motorizacion) {
        this.motorizacion = motorizacion;
    }
     
}
