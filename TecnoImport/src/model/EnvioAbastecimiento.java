/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Nicole Alvarez
 */
public class EnvioAbastecimiento extends Envio {
    private Local lugarDestino;


    public EnvioAbastecimiento(int id, Date fechaEmision, EstadoEnvio estado, Empleado originador, Bodega Bodega, Local local,Empleado originario) {
        super(id, fechaEmision, estado, originador, Bodega);
        this.lugarDestino = local;
        
    }

    public Local getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(Local lugarDestino) {
        this.lugarDestino = lugarDestino;
    }
    
    
    
    
}
