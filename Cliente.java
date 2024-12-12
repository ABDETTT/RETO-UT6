public class Cliente {

    private String nombre;
    private String dni;
    private String apellido1;
    private String apellido2;
    private String direccion;

    public Cliente() {
        //TODO Auto-generated constructor stub
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void verFacturaCliente() {
        System.out.println("Datos de cliente: ");
        System.out.println("Nombre completo: " +this.nombre+" "+this.apellido1+" "+this.apellido2);
        System.out.println("DNI: "+this.dni);
        System.out.println("Domicilio: "+this.direccion);
    }

    
}
