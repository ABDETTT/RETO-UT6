import java.util.Scanner;

public class Coche {
    public Scanner sc = new Scanner(System.in);

    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private CaracterísticasCoche características; // Caracteristicas del coche(Color, Motorización, Transmision...).
    private ExtrasCoche extras; // Extras que llevara el vehiculo.
    
    public double precioCoche=0;

    public Coche(int id, String marca, String modelo, String categoria, CaracterísticasCoche características,
            ExtrasCoche extras) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.características = características;
        this.extras = extras;
    }
}
