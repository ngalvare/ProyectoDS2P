
package Modeltecnoimport;


/**
 *
 * @author Nicole Alvarez
 */
public class EnvioDomicilio extends Envio{
    private Venta venta;

    public EnvioDomicilio(int id, EstadoEnvio estado,Venta venta) {
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
