import java.util.Scanner;

public class Coche {
    public Scanner sc = new Scanner(System.in);

    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private CaracteristicasCoche caracteristicas; // Caracteristicas del coche(Color, Motorización, Transmision...).

    public static double precioCoche = 0;

    public Coche(int id, String marca, String modelo, String categoria, CaracteristicasCoche caracteristicas,
            ExtrasCoche extras) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public CaracteristicasCoche getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(CaracteristicasCoche caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public ExtrasCoche getExtras() {
        return extras;
    }

    public void setExtras(ExtrasCoche extras) {
        this.extras = extras;
    }

    public static double getPrecioCoche() {
        return precioCoche;
    }

    public static void setPrecioCoche(double precioCoche) {
        Coche.precioCoche = precioCoche;
    }

    protected void configurarCoche() {
        precioCoche = +caracteristicas.getprecioCocheCarac();
    }

    private void meterDatosCoche() {

        System.out.println("Introduce la Marca que quieras(Toyota, Ferrai, Porsche )");
        marca = sc.nextLine();
        System.out.println("Introduce el modelo del coche (Corolla, Roma, Panamera)");
        modelo = sc.nextLine();
        System.out.println("Introduce la categoria");
        categoria = sc.nextLine();
        solicitarCaracterísticas();
    }

    protected void resumenCoche() {
        System.out.println("\nResumen del coche configurado: Id: " + id + "Marca: " + marca + "Modelo: " + modelo
                + "Categoria: " + categoria + "Características: " + caracteristicas + "Precio total: " + precioCoche);
    }
}
