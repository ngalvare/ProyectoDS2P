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
public class Local {
    
    protected int id;
    protected String direccion;
//    protected Inventario inventario;
//    protected List<Empleado> empleados;

    public Local(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
//        this.inventario = inventario;
//        this.empleados = empleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    
}
