
package Modeltecnoimport;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ANA
 */
public class Factura extends DocumentoElectronico{
    
    private List<Producto> productos;

    public Factura(int id, PagoStrategy pago, Cliente cliente, Date fecha, String detalle,List<Producto> productos) {
        super(id, pago, cliente, fecha, detalle);
        this.productos=productos;
    }

   

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
