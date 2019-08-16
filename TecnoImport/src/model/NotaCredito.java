/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ANA
 */
public class NotaCredito extends DocumentoElectronico{
    
    private float porcentajeDescuento, valorGastoIncurrido;
    private Factura facturaAnulada;

    public NotaCredito(float porcentajeDescuento, float valorGastoIncurrido, Factura facturaAnulada) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.valorGastoIncurrido = valorGastoIncurrido;
        this.facturaAnulada = facturaAnulada;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public float getValorGastoIncurrido() {
        return valorGastoIncurrido;
    }

    public void setValorGastoIncurrido(float valorGastoIncurrido) {
        this.valorGastoIncurrido = valorGastoIncurrido;
    }

    public Factura getFacturaAnulada() {
        return facturaAnulada;
    }

    public void setFacturaAnulada(Factura facturaAnulada) {
        this.facturaAnulada = facturaAnulada;
    }
    
    
    
}
