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
public class Repartidor extends Empleado{
    
    private int entregasRealizadas;
    
    public Repartidor(String numCedula, String nombre, String cargo, String apellido, String direccion, String numTelefono, int entregas) {
        super(numCedula, nombre, cargo, apellido, direccion, numTelefono);
        this.entregasRealizadas = entregas;
    }

    public int getEntregasRealizadas() {
        return entregasRealizadas;
    }

    public void setEntregasRealizadas(int entregasRealizadas) {
        this.entregasRealizadas = entregasRealizadas;
    }
    
    public int valorCobrar(){
        System.out.println("Clase Repartidor Metodo valorCobrar");
        return 1;
    }
    
    
}
