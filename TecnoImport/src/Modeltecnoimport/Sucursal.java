/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.List;

/**
 *
 * @author ANA
 */
public class Sucursal extends Local{
    
    public Sucursal(int id, String direccion, Inventario inventario, List<Empleado> empleados) {
        super(id, direccion, inventario, empleados);
    }
    
}
