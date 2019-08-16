/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

/**
 *
 * @author ANA
 */
public class Gerente extends Empleado{
    
    public Gerente(String numCedula, String nombre, String cargo, String apellido, String direccion, String numTelefono) {
        super(numCedula, nombre, cargo, apellido, direccion, numTelefono);
    }
    
    public void agregarPedidoAbastecimiento(){
        System.out.println("Clase Gerente Metodo agregarPedidoAbastecimiento");
    }
    
    public void consultarEmpleados(){
        System.out.println("Clase Gerente Metodo consultarEmpleados");
    }
    
    public void consultarClientes(){
        System.out.println("Clase Gerente Metodo consultarClientes");
    }
    
    public void consultarEnvio(){
        System.out.println("Clase Gerente Metodo consultarEnvio");
    }
    
}
