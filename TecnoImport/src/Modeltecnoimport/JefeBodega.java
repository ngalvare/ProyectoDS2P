/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

/**
 *
 * @author scmz2607
 */
public class JefeBodega extends Empleado{

    public JefeBodega(String numCedula, String nombre, String cargo, String apellido, String direccion, String numTelefono) {
        super(numCedula, nombre, cargo, apellido, direccion, numTelefono);
    }
    
    public void crearRutaEntrega(){
        System.out.println("Clase JefeBodega Metodo crearRutaEntrega");
    }
    
    public void asignarRepartidorDisponible(){
        System.out.println("Clase JefeBodega Metodo asignarRepartidorDisponible");
    }
    
    public void actualizarEnvios(){
        System.out.println("Clase JefeBodega Metodo actualizarEnvios");
    }
    
}
