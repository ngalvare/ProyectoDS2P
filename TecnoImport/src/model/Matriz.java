/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author ANA
 */
public class Matriz extends Local{
    
    public Matriz(int id, String direccion, Inventario inventario, List<Empleado> empleados) {
        super(id, direccion, inventario, empleados);
    }
    
}
