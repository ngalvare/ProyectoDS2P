/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.Date;

/**
 *
 * @author Nicole Alvarez
 */
public class EnvioAbastecimiento extends Envio {
    private Local lugarDestino;
    private Date fechaEmision;


    public EnvioAbastecimiento(int id, Date fechaEmision, EstadoEnvio estado, Local local,Empleado originario) {
        super(id,estado);
        this.lugarDestino = local;
        this.fechaEmision=fechaEmision;
        
    }

    public Local getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(Local lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    
    
    
}
