import java.util.Scanner;

public class Coche {

    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private CaracteristicasCoche caracteristicas; // Caracteristicas del coche(Color, Motorización, Transmision...).
    
    public static double precioCoche=0;

    public Coche(int id, String marca, String modelo, String categoria, CaracteristicasCoche caracteristicas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }

    public Coche(){

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

    public static double getPrecioCoche() {
        return precioCoche;
    }

    public static void setPrecioCoche(double precioCoche) {
        Coche.precioCoche = precioCoche;
    }

    protected void configurarCoche() {
        precioCoche = +caracteristicas.getprecioCocheCarac();
    }

    protected void resumenCoche() {
        System.out.println("Coche "+id+": "+"Marca: " + marca+", Modelo: "+modelo+", Categoria: "+categoria+", Caracteristicas: "+caracteristicas.verCaracteristicas()+". ");
    }

    protected void meterDatosCoche(Scanner sc) {
        CaracteristicasCoche caracteristicas0 = new CaracteristicasCoche(modelo, marca, categoria);

        int id=4;
        setId(id);

        System.out.print("Introduce la marca que quieras (Toyota, Ferrai, Porsche): ");
        String marca = sc.nextLine();
        setMarca(marca);

        System.out.print("Introduce el modelo del coche (Corolla, Roma, Panamera): ");
        String modelo = sc.nextLine();
        setModelo(modelo);

        System.out.print("Introduce la categoria (Suv, Todoterreno, Deportivo): ");
        String categoria = sc.nextLine();
        setCategoria(categoria);

        caracteristicas0.solicitarCaracterísticas(sc);

        System.out.println();
    }
}