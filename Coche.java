import java.util.Scanner;

public class Coche {
    public Scanner sc = new Scanner(System.in);

    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private CaracteristicasCoche caracteristicas; // Caracteristicas del coche(Color, Motorización, Transmision...).
    
    public static double precioCoche=0;

    public Coche(int id, String marca, String modelo, String categoria, CaracteristicasCoche caracteristicas,
            ExtrasCoche extras) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }

    protected void configurarCoche(){
        precioCoche =+ caracteristicas.getprecioCocheCarac();
    }

    private void resumenCoche(){
        System.out.println("\nResumen del coche configurado:");
        System.out.println("Id: "+id);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Categoria: "+categoria);
        System.out.println("Características: "+caracteristicas);
        System.out.println("Precio total: "+precioCoche);
    }
}
