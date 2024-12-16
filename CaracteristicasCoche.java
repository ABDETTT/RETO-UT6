import java.util.Scanner;

/**
 * @author Amine 
 * @author Abdelilah
 * @since 02 diciembre 2024 
 */
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
        int n1 = 0; // Contador que se usa dentro del bucle do while del switch case para el mensaje de error. 
        precioC = 0;
    
        for (int i = 0; i < arrayCaracteristicas.length; i++) {
            System.out.println("\nElige " + arrayCaracteristicas[i]); // Caracteristica a elegir. 

            switch (i) {

                // Elegir un color.
                case 0: 
                    n1 = 0;

                    for (int j = 0; j < coloresDisponibles.length; j++) {
                    System.out.println(j + 1 + ". " + coloresDisponibles[j] + " " + precioColor[j] + "$"); // Colores disponibles a elegir con su respectivo precio. 
                    }

                    do {
                        if (n1 > 0) {
                            System.out.println("Opcion no valida, vuelve a intentarlo.");
                            System.out.println();
                        }

                        System.out.print("Selecciona una opcion: ");
                        opcionSelec = sc.nextInt();

                        n1++;
                    } while (opcionSelec > coloresDisponibles.length || opcionSelec < 1);

                    arrayCaracteristicasSelec[i] = coloresDisponibles[opcionSelec - 1]; // Guardar la opcion seleccionada. 
                    precioCocheCarac += precioColor[opcionSelec - 1]; // Sumar el precio del color seleccionado. 
                    setColor(arrayCaracteristicasSelec[i]); // Guardar color seleccionado en la variable del constructor. 

                    break;
                // Elegir transmision. 
                case 1:
                    n1 = 0;

                    for (int j = 0; j < transmisionDisponibles.length; j++) {
                    System.out.println(j + 1 + ". " + transmisionDisponibles[j] + " " + precioTransmision[j] + "$"); // Transmisiones disponibles a elegir con su respectivo precio. 
                    }

                    do {
                        if (n1 > 0) {
                            System.out.println("Opcion no valida, vuelve a intentarlo.");
                            System.out.println();
                        }

                        System.out.print("Selecciona una opcion: ");
                        opcionSelec = sc.nextInt();

                        n1++;
                    } while (opcionSelec > transmisionDisponibles.length || opcionSelec < 1);

                    arrayCaracteristicasSelec[i] = transmisionDisponibles[opcionSelec - 1]; // Guardar la opcion seleccionada. 
                    precioCocheCarac += precioTransmision[opcionSelec - 1]; // Sumar el precio de la transmision seleccionado. 
                    setTransmision(arrayCaracteristicasSelec[i]); // Guardar transmision seleccionado en la variable del constructor. 
                    break;
                // Elegir motorizacion. 
                case 2:
                    n1 = 0;

                    for (int j = 0; j < motorizacionDisponible.length; j++) {
                        System.out.println(j + 1 + ". " + motorizacionDisponible[j] + " " + precioMotorizacion[j] + "$"); // Motorizaciones disponibles a elegir con su respectivo precio. 
                    }

                    do {
                        if (n1 > 0) {
                            System.out.println("Opcion no valida, vuelve a intentarlo.");
                            System.out.println();
                        }

                        System.out.print("Selecciona una opcion: ");
                        opcionSelec = sc.nextInt();

                        n1++;
                    } while (opcionSelec > motorizacionDisponible.length || opcionSelec < 1);

                    arrayCaracteristicasSelec[i] = motorizacionDisponible[opcionSelec - 1]; // Guardar la opcion seleccionada.
                    precioCocheCarac += precioMotorizacion[opcionSelec - 1]; // Sumar el precio de la motorizacion seleccionado. 
                    setMotorizacion(arrayCaracteristicasSelec[i]); // Guardar motorizacion seleccionado en la variable del constructor. 
                    break;
            } 
        }

        setPrecioC(precioCocheCarac); //  Guardar la suma del precio seleccionado en la variable del constructor. 
        precioCocheCarac = 0; // Resetear el precio (Corregido). 
    }

    /**
     * Devuelve por pantalla las caracteristicas seleccionadas. 
     * @return
     */
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
