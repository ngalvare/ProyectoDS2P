package Modeltecnoimport;

/**
 *
 * @author scmz2607
 */
public class Cliente {
    String cedula, nombre, address, numTlf;

    public Cliente(String cedula,  String nombre, String address, String numTlf) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.address = address;
        this.numTlf = numTlf;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumTlf() {
        return numTlf;
    }

    public void setNumTlf(String numTlf) {
        this.numTlf = numTlf;
    }    
}
