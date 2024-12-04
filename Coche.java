import java.util.Scanner;

public class Coche {
    public Scanner sc = new Scanner(System.in);

    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private String [] Características; // Caracteristicas del coche(Color, Motorización, Transmision...).
    private boolean [] Extras; // Extras que llevara el vehiculo.

    public Coche(int id, String marca, String modelo, String categoria, String[] características, boolean[] extras) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        Características = características;
        Extras = extras;
    }

    protected void cochesDisponibles(Scanner sc){
        System.out.println("Elige uno de los siguientes coches disponibles del stock: ");
        System.out.println("1. "+coche1);
        System.out.println("2. "+coche2);
        System.out.println("3. "+coche3);
        int cocheselec = sc.nextInt();
        
    }
}
