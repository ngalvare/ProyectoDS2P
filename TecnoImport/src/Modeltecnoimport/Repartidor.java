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
    private boolean disponible;
    public Repartidor(String numCedula, String nombre, String direccion, String numTelefono,boolean disponible) {
        super(numCedula, nombre, direccion, numTelefono);
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
