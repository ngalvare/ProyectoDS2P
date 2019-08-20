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
public class EnvioDomicilio extends Envio{
    private Venta venta;

    public EnvioDomicilio(int id, Date fechaEmision, EstadoEnvio estado,Venta venta) {
        super(id, estado);
        this.venta = venta;
    }


    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
    
}
