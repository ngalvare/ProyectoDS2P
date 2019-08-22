
package modelotecnoimport.strategy;


import java.util.Currency;

/**
 *
 * @author ANA
 */
public class VisaStrategy implements PagoStrategy{
    
    private String nombre;
    private String numeroTarjeta;
    private String cvv;
    private String fechaExpiracion;
    private Currency monto;

    public VisaStrategy(String nombre, String numeroTarjeta, String cvv, String fechaExpiracion, Currency monto) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
        this.monto = monto;
    }

    @Override
    public void pagar(Currency monto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Currency getMonto() {
        return monto;
    }

    public void setMonto(Currency monto) {
        this.monto = monto;
    }
    
    
    
}
