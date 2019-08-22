
package modelotecnoimport;

import java.util.Date;


/**
 *
 * @author ANA
 */
public class Venta {
    
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private Date fecha;

    public Venta(int id, Cliente cliente, Date fecha) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
