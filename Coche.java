import java.util.Scanner;

public class Coche {

    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private CaracteristicasCoche caracteristicas; // Caracteristicas del coche(Color, Motorización, Transmision...).

    private double precioCocheBase=20000; // El precio base de un coche parte de 20000$ y dependiendo de que caracteristicas eliga el cliente, costara mas o menos. 

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

    protected void configurarCoche() {
        precioCocheBase = +caracteristicas.getprecioCocheCarac();
    }

    protected void resumenCoche() {
        System.out.println("Coche "+id+": "+"Marca: " + marca+", Modelo: "+modelo+", Categoria: "+categoria+", Caracteristicas: "+caracteristicas.verCaracteristicas()+". ");
        double precioCocheFinal=precioCocheBase+caracteristicas.getPrecioC(); // El precio final del coche, sumado ya el precio base y el precio de las caracteristicas seleccionadas. 
        System.out.println("Precio: "+precioCocheFinal+"$. ");
    }

    
}