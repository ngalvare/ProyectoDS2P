/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scmz2607
 */
public abstract class Empleado {
    protected String numCedula, nombre, cargo, apellido, direccion, numTelefono;
    protected Usuario usuario;

    public Empleado(String numCedula, String nombre, String cargo, String apellido, String direccion, String numTelefono) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        usuario =  generarUsuario(numCedula);
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    //aqui se debe crear una excepcion para cedulas no repetidas
    private Usuario generarUsuario(String numCedula){
        return new Usuario(numCedula, numCedula); //luego habra que permitirle cambiar clave
    }

}
//iniciarSesion() creo que no deberia ir aqui ni activarOnline()