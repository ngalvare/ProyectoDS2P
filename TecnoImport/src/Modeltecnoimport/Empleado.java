package Modeltecnoimport;

/**
 *
 * @author Nicole Alvarez
 */
public class Empleado {
    protected String numCedula, nombre, direccion, numTelefono;
  

    public Empleado(String numCedula, String nombre, String direccion, String numTelefono) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    
}
