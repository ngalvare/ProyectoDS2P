
package modelotecnoimport;

import modelotecnoimport.strategy.PagoStrategy;
import java.util.Date;

/**
 *
 * @author ANA
 */
public class NotaCredito extends DocumentoElectronico{
    
    private float valorGastoIncurrido;
    private Factura facturaAnulada;

    public NotaCredito(int id, PagoStrategy pago, Cliente cliente, Date fecha, String detalle, float valorGastoIncurrido, Factura facturaAnulada) {
        super(id, pago, cliente, fecha, detalle);
        this.valorGastoIncurrido = valorGastoIncurrido;
        this.facturaAnulada = facturaAnulada;
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
