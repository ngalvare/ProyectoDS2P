/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Nicole Alvarez
 */
public class Envio {
    protected int id;
    protected EstadoEnvio estado;

    public Envio(int id, EstadoEnvio estado) {
        this.id = id;
        this.estado = estado;
    }
    
    
    public void cambiarEstadoEnvio(EstadoEnvio estado){
    
        System.out.println("EnvioCambiarEstadoEnvio");
    }
    
    public void solicitar(List<Producto> productos){
    
        System.out.println("Enviosolicitar");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }
    
    
}
