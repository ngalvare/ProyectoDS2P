/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ANA
 */
public class Vendedor extends Empleado{
    
    public Vendedor(String numCedula, String nombre, String cargo, String apellido, String direccion, String numTelefono) {
        super(numCedula, nombre, cargo, apellido, direccion, numTelefono);
    }
    
    public void crearVenta(){
        System.out.println("Clase Vendedor Metodo crearVenta");
    }
    
    public void consultarVenta(){
        System.out.println("Clase Vendedor Metodo consultarVenta");
    }
    
    public void crearCliente(){
        System.out.println("Clase Vendedor Metodo crearCliente");
    }
    
    public void editarCliente(Cliente c){
        System.out.println("Clase Vendedor Metodo editarCliente");
    }
    
    public void crearNotaCredito(Factura f){
        System.out.println("Clase Vendedor Metodo crearNotaCredito");
    }
    
}
