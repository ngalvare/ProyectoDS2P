/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Nicole Alvarez
 */
public class Envio {
    protected int id;
    protected Date fechaEmision;
    protected EstadoEnvio estado;
    protected Empleado originador;
    protected Bodega Bodega;

    public Envio(int id, Date fechaEmision, EstadoEnvio estado, Empleado originador, Bodega Bodega) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.estado = estado;
        this.originador = originador;
        this.Bodega = Bodega;
    }
    
    
    public void cambiarEstadoEnvio(EstadoEnvio estado){
    
        System.out.println("EnvioCambiarEstadoEnvio");
    }
    
    public void solicitar(List<Productos> productos){
    
        System.out.println("Enviosolicitar");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    public Empleado getOriginador() {
        return originador;
    }

    public void setOriginador(Empleado originador) {
        this.originador = originador;
    }

    public Bodega getBodega() {
        return Bodega;
    }

    public void setBodega(Bodega Bodega) {
        this.Bodega = Bodega;
    }

    
    
    
}
