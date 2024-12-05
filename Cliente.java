import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Cliente {
    
    private static String nombre;
    private static int edad;
    private static String dni;
    private static String apellido1;
    private static String apellido2;
    private static String direccion;    

    public Cliente(String nombre, int edad, String dni, String apellido1, String apellido2, String direccion) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static void meterDatos (Scanner sc){

        System.out.println("Introduce tu Nombre: ");
        nombre = sc.nextLine();

        System.out.println("Introduce tu primer apellido");
        apellido1 = sc.nextLine();

        System.out.println("Introduce tu segundo appellido");
        apellido2 =sc.nextLine();

        System.out.println("Introduce tu dni: ");
        dni = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.println();

    }
    
    public static void verInfo(){
        System.out.println("Datos de cliente");
        System.out.println();
        System.out.println("Nombre: "+nombre+", Apellido1: "+apellido1+", Apellido2: "+apellido2+", DNI: "+dni+", Edad: "+edad);
    }
    
}
