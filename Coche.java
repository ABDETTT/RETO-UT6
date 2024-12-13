import java.util.Scanner;

/**
 * @author Amine 
 * @author Abdelilah
 */
public class Coche {
    // Atributos del constructor. 
    private int id; // Numero para identificar el coche.
    private String marca; // Marca del coche(Kia, Mercedes, Bmw...).
    private String modelo; // Modelo del coche(Ibiza, Corolla, Leon...).
    private String categoria; // Categoria del coche(Súv, Coupe, Todoterreno...).
    private CaracteristicasCoche caracteristicas; // Caracteristicas del coche(Color, Motorización, Transmision...).

    // Atributos 
    private double precioCocheBase=20000; // El precio base de un coche parte de 20000$. 
    private double precioCocheFF=0; // Suma del precio base y de las caracteristicas seleccionadas. 

    /**
     * Constructor parametizado. 
     * @param id
     * @param marca
     * @param modelo
     * @param categoria
     * @param caracteristicas
     */
    public Coche(int id, String marca, String modelo, String categoria, CaracteristicasCoche caracteristicas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }

    public Coche(){
        // Constructor sin parametros. 
    }

    /**
     * Imprime por pantalla los datos del coche y asigna e imprime el precio total. 
     */
    protected void resumenCoche() {
        System.out.println("Coche "+id+": "+"Marca: " + marca+", Modelo: "+modelo+", Categoria: "+categoria+", Caracteristicas: "+caracteristicas.verCaracteristicas()+". ");
        precioCocheFF=precioCocheBase+caracteristicas.getPrecioC(); // El precio final del coche, sumado ya el precio base y el precio de las caracteristicas seleccionadas. 
        System.out.println("Precio: "+precioCocheFF+"$. ");
    }

    /**
     * Imprime por pantalla los datos del coche y el precio total en formato factura. 
     */
    protected void verFacturaCoche(){
        System.out.println("Datos coche: ");
        System.out.println("Coche: "+this.marca+" "+this.modelo+". ");
        System.out.println("Categoria: "+this.categoria+". ");
        System.out.println("Caracteristicas: "+caracteristicas.verCaracteristicas()+". ");
        precioCocheFF=precioCocheBase+caracteristicas.getPrecioC();
        System.out.println("......................");
        System.out.println("Precio Total: "+ precioCocheFF+"$. ");
    } 

    // Metodos geters y seters. 

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

}