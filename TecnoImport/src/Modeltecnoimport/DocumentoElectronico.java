package Modeltecnoimport;

import java.util.Date;

/**
 *
 * @author ANA
 */
public class DocumentoElectronico {
    
    private int id;
    private PagoStrategy pago;
    private Cliente cliente;
    private Date fecha;
    private String detalle;

    public DocumentoElectronico(int id, PagoStrategy pago, Cliente cliente, Date fecha, String detalle) {
        this.id = id;
        this.pago = pago;
        this.cliente = cliente;
        this.fecha = fecha;
        this.detalle = detalle;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PagoStrategy getPago() {
        return pago;
    }

    public void setPago(PagoStrategy pago) {
        this.pago = pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
